import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowsers {

	public static void main(String[] args) {

		String browserName = "Chrome";
		WebDriver driver= null;
		
		if (browserName.equals("Chrome")) {
			 driver = new ChromeDriver();
			
		} else if (browserName.equals("Firefox")) {
			 driver = new FirefoxDriver();
		}

		else if (browserName.equals("Edge")) {
		 driver = new EdgeDriver();
		}
		else {
			System.out.println("Choose correct browser");
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
        driver.quit();
	}

}
