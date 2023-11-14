package HandlingUIElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/jquery-select.php");
		driver.findElement(By.xpath("(//*[@role='combobox'])[1]")).click();
		driver.findElement(By.xpath("(//*[@aria-label='Search'])[2]")).sendKeys("new");
		
		List<WebElement> listofStates = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		for(int i=0;i<listofStates.size();i++) {
			if(listofStates.get(i).getText().equalsIgnoreCase("New York")) {
				listofStates.get(i).click();
				break;
			}
		}
//		
//		for(WebElement element : listofStates) {
//			if(element.getText().equalsIgnoreCase("New York")) {
//				element.click();
//				break;	
//			}
//		}
	}

}
