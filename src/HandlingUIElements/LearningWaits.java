package HandlingUIElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningWaits {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/**
		 * implicit wait is a global wait means it's applicable across entire project
		 * Here we are using 4 seconds, if any of the element is not shown up in 4 seconds it will wait but
		 * will fail if it takes more than 4 seconds
		 * But if an element shows up before 4th second it will resume execution means will not wait extra seconds like Thread.sleep()
		 */
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4)); 
		driver.get("https://selenium.obsqurazone.com/dynamic-load.php");
		
		driver.findElement(By.cssSelector("[id='save']")).click();
		String name=driver.findElement(By.cssSelector(".card-title")).getText();
		
		System.out.println(name);
		

	}

}
