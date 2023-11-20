package HandlingUIElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");
		String headingTextBeforeFrame = driver.findElement(By.cssSelector("[class='example'] h3")).getText();

		System.out.println(headingTextBeforeFrame);
		/**
		 * When ever there is any element present inside frame we have to switch to that
		 * frame in order to interact with that element There are three ways to grab any
		 * frame 1) By id 2) By webelement 3) By index
		 * 
		 * Once we are done with frame we have to come out of frame in order to interact
		 * with elements present outside frame
		 * 
		 */

		driver.switchTo().frame("mce_0_ifr");
		// driver.switchTo().frame(driver.findElement(By.cssSelector(".tox-edit-area
		// iframe")));
		// driver.switchTo().frame(0);
		WebElement box = driver.findElement(By.xpath("//*[@id='tinymce']/p"));
		box.clear();
		box.sendKeys("We are learning selenium but it is sad that we donot practise");

		// used to come out of frame
		driver.switchTo().defaultContent();
		String headingTextAfterFrame = driver.findElement(By.cssSelector("[class='example'] h3")).getText();
		System.out.println(headingTextAfterFrame);

		driver.quit();

	}
}
