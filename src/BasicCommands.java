import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicCommands {

	public static void main(String[] args) throws InterruptedException {
		
		// Initializing driver instance will open browser
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//This command is used to open URL in browser
		driver.get("https://www.amazon.in/");
		
		//This command is used to get Title of page
		String title = driver.getTitle();
		System.out.println(title);
		
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
	
		//This command is used to kill the driver and browser
		driver.quit();
		
		
		
			

	}

}
