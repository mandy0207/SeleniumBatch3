package HandlingUIElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) {
		int headingIndex = 0;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/tables");

		List<WebElement> tableHeadings = driver.findElements(By.xpath("//*[@id='table1']/thead//th"));

		for (int i = 0; i < tableHeadings.size(); i++) {
			if (tableHeadings.get(i).getText().equalsIgnoreCase("web site")) {
				headingIndex = i + 1;
				break;
			}
		}
		System.out.println(headingIndex);
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='table1']/tbody/tr"));
	
		for(int i =0;i<rows.size();i++) {
			System.out.println(rows.get(i).findElement(By.xpath("td["+ headingIndex+"]")).getText());
		}
		
		driver.quit();

	}

}
