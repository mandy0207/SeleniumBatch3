import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeneralMethods {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		
		//Grab text present inside any element
		String heading =driver.findElement(By.className("main-heading")).getText();
		
		System.out.println(heading);
		
		
	}
}
