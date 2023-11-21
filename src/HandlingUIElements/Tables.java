package HandlingUIElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");
		
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='dtBasicExample']//tr[3]/td"));
		System.out.println(list.size());
		
		for(int i =0; i<list.size();i++) {
			String text = list.get(i).getText();
			System.out.println(text);
		}
		
//		for(WebElement element : list) {
//			System.out.println(element.getText());
//		}
	
		driver.quit();

	}

}
