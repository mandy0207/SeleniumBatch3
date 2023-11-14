package HandlingUIElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/select-input.php");

		/**
		 * 1) Grab the webelement of static dropdown 2) Make an object of select class
		 * 3) we can select element by uisng any of three methods selectByValue,
		 *    selectByVisibileText, selectByIndex
		 */
		WebElement dropDown = driver.findElement(By.cssSelector("#single-input-field"));
		Select staticDropdown = new Select(dropDown);
		staticDropdown.selectByVisibleText("Green");
		Thread.sleep(2000);
		staticDropdown.selectByValue("Yellow");
		Thread.sleep(2000);
		staticDropdown.selectByIndex(1);

		driver.quit();

	}

}
