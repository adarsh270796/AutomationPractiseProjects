import java.awt.Window;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scrollingwindow {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(100,500)");
		Thread.sleep(2000);
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=1000");
	    List <WebElement> values =	driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
	    for(int i=0; i<values.size();i++)
		{
	    	sum=sum+ Integer.parseInt(values.get(i).getText());
			
		}
	    System.out.println("Sum is-"+sum);
	    
	   int total = Integer.parseInt(driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(": ")[1]);
	   Assert.assertEquals(sum, total);
	    driver.close();
	}

}
