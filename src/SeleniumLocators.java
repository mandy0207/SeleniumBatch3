import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		//using ID locator here
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//using name locator
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		//using class locator
		driver.findElement(By.className("submit-button")).click();
		
     	driver.findElement(By.id("react-burger-menu-btn")).click();
		
		Thread.sleep(2000);
		//using LinkText locator
		driver.findElement(By.linkText("About")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		//using PartialLinkText locator
		driver.findElement(By.partialLinkText("Logou")).click();
		
		driver.quit();
		

	}

}
