package HandlingUIElements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		/**
		 * switch to alert and we can either accept it or dismiss it
		 * we can also send a msg inside an alert/prompt
		 */
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		
		driver.findElement(By.cssSelector(".btn.btn-warning")).click();
		Thread.sleep(2000);
		alert.dismiss();
		
		driver.findElement(By.cssSelector(".btn.btn-danger")).click();
		alert.sendKeys("Jasna");
		alert.accept();

	}

}
