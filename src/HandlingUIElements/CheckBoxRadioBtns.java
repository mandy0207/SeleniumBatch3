package HandlingUIElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxRadioBtns {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement checkBox = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		checkBox.click();
		
		driver.findElement(By.xpath("//*[text()='Radio Buttons Demo']")).click();
		WebElement radioBtn = driver.findElement(By.id("inlineRadio1"));
		radioBtn.click();
		driver.findElement(By.cssSelector("[id='button-one']")).click();
		
		driver.quit();

	}

}
