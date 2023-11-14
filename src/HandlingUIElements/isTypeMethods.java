package HandlingUIElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isTypeMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement checkBox = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		
		boolean displayed=checkBox.isDisplayed();
		System.out.println("Is checkBox displayed ="+displayed);
		
		boolean enabled=checkBox.isEnabled();
		System.out.println("Is checkbox enabled="+enabled);
		
	   boolean selected= checkBox.isSelected();
	   System.out.println("Is checkbox selected="+ selected);
	   checkBox.click();
	   selected=checkBox.isSelected();
	   System.out.println("Is checkbox selected="+ selected);
	   
	   driver.quit();
		
	}

}
