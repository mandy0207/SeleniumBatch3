import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		/**
		 * Syntax of Xpath
		 * 1) //tagname[@attribute='value'] or //*[@attribute='value']
		 * 2) //parent//child[index]//child
		 * 3) //tagname[text()='textValue']
		 * 4) //tagname[contains(@attribute,'value')] -- regularPath xpath
		 */

		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("obsqura24@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("mypassword");
		driver.findElement(By.xpath("//*[@value='Log in']")).click();
		
		driver.findElement(By.xpath("(//div[@class='listbox'])[1]//li[4]//a")).click();
		
		
		List<WebElement> list = driver.findElements(By.xpath("//h2[@class='product-title']//a"));
		System.out.println(list.size());
		
		for(int i =0;i<list.size();i++) {
			if(list.get(i).getText().equals("Blue Jeans")) {
				list.get(i).click();
				break;	
			}		
		}
		
		
		
		WebElement qtyBox = driver.findElement(By.xpath("//input[contains(@data-val-number,'The field Qty')]"));
		qtyBox.clear();
		qtyBox.sendKeys("3");	
		driver.quit();
		
		
	}

}
