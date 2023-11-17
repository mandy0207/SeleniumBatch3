package HandlingUIElements;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/jquery-select.php");
		
		TakesScreenshot screenshot = 	(TakesScreenshot)driver;
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		
		File destFile=new File("C:\\Sask\\Code\\workspace\\SeleniumTraining3\\Screenshot\\screenshot.png");
		//For this use commons io dependency
		FileUtils.moveFile(srcFile, destFile);
		driver.quit();

	}

}
