import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeneralMethods {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		
		//Grab text present inside any element
		WebElement heading = driver.findElement(By.className("main-heading"));
		String headingText = heading.getText();
		System.out.println(headingText);
		
		//Grab any attribute value
		String attributeValue = driver.findElement(By.id("booking_engine_hotels")).getAttribute("title");
		System.out.println("Attribute value== "+attributeValue);
		
		//Tool tip is nothing but title attribute value
		String toolTip = driver.findElement(By.id("booking_engine_holidays")).getAttribute("title");
		System.out.println("ToolTip = "+toolTip);
		
		//grab any CSS value associated to WebElement
		String cssValue = heading.getCssValue("font-weight");
		System.out.println(cssValue);
		
		driver.quit();
	}
}
