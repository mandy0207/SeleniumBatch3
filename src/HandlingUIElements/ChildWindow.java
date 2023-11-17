package HandlingUIElements;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		
		
		System.out.println("Current Page Title="+driver.getTitle());
		driver.findElement(By.linkText("Click Here")).click();
		/**
		 * window handles grabs all handles in set collection
		 * we can iterate that set with iterator to grab window handles
		 * Then we will switch to window handle that is required to be interacted
		 */
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("Size of set"+windowHandles.size());
		
		//Iterator to iterate set
		Iterator<String> it = windowHandles.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		//switching to child window
		//close will close current window in control. here it is child window
		driver.switchTo().window(childWindow);
		System.out.println("Current Page Title="+driver.getTitle());
		driver.close();
		
		//switching to parent window
		driver.switchTo().window(parentWindow);
		System.out.println("Current Page Title="+driver.getTitle());
		
		driver.quit();

	}

}
