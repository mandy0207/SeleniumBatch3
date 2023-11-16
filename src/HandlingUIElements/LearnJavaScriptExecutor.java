package HandlingUIElements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnJavaScriptExecutor {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement message = driver.findElement(By.id("single-input-field"));
		WebElement btn = driver.findElement(By.id("button-one"));
		/**
		 * This is how we send keys in text box using js
		 */
		js.executeScript("arguments[0].value='Mandy is a good boy'", message);
		/**
		 * This is how we click on Webelement using js
		 */
		js.executeScript("arguments[0].click()", btn);
		

	}

}
