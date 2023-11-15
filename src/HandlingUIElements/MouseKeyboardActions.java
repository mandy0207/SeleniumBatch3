package HandlingUIElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseKeyboardActions {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		
		/**
		 * For performing any keyboard or mouse action we create an object of Actions class
		 * We have to build and perform every action that we want to execute
		 */

		Actions act = new Actions(driver);
		WebElement others = driver.findElement(By.id("others"));
		/**
		 * moveToElement hovers over an element
		 */
		act.moveToElement(others).build().perform();
		
		WebElement inputBox = driver.findElement(By.xpath("//*[@id='single-input-field']"));
		act.moveToElement(inputBox).click().sendKeys("Jasna").build().perform();
		
		WebElement showMsg = driver.findElement(By.cssSelector("[id='button-one']"));
		//act.moveToElement(showMsg).click().build().perform();
		
		//this is how we double click on any element
		act.moveToElement(showMsg).doubleClick().build().perform();
		
		inputBox.clear();
		Thread.sleep(2000);
		/**
		 * KeyDown is used to hold key on keyboard
		 * Here we are holding shift key
		 */
		act.moveToElement(inputBox).click().keyDown(Keys.SHIFT).sendKeys("laicy").build().perform();
		showMsg.click();
		
		/**
		 * Context click is used to right click on any element
		 */
		act.moveToElement(showMsg).contextClick().build().perform();
		
		
	
		
		
	}

}
