package HandlingUIElements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.obsqurazone.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		/**
		 * First way pf scrolling by passing some value
		 */
		js.executeScript("window.scrollBy(0,2000);");
		
		WebElement desiredElement = driver.findElement(By.cssSelector("h2.home-sec2-head-h2"));
		/**
		 * scrolling on the based of webelement 
		 */
		js.executeScript("arguments[0].scrollIntoView(true);",desiredElement);
		

	}

}
