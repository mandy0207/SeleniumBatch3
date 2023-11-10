import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_CSSSelector {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		/**
		 * CSS Syntax 1)Css sytax for class atrribute = .classname 2) CSS syntax for id
		 * attribute = #id 3) If there are more than one classes present for class
		 * attribute remove space between classes and put .(dot) eg
		 * .button-1.login-button 4) General syntax for css = tagname[attribute='value']
		 * or [attribute='value']
		 * 
		 * 5) For parent chaining we have to use nth-child for elements inside parent
		 * parent nth-child(index)
		 * examples :
		 * [class='list'] li:nth-child(4) a
		 * .block-category-navigation ul li:nth-child(4) a
		 * 
		 * 6) RegularPath css syntax =[attribute*='substring value']
		 * 
		 */

		driver.findElement(By.cssSelector(".ico-login")).click();
		driver.findElement(By.cssSelector(".email")).sendKeys("obsqura24@gmail.com");
		;
		driver.findElement(By.cssSelector("#Password")).sendKeys("mypassword");
		// driver.findElement(By.cssSelector(".button-1.login-button")).click();

		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		driver.findElement(By.cssSelector("[class='list'] li:nth-child(4) a")).click();
		
		String text=driver.findElement(By.cssSelector("[class*='current-ite']")).getText();
		System.out.println(text);
		
		driver.quit();

	}

}
