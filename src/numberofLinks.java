import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class numberofLinks {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//number of links on page
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//limiting driver scope
	    //1.get the total number of links in footer of the page
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//2. get the number of the links in first colomn of footer section
		WebElement firstCol = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(firstCol.findElements(By.tagName("a")).size());
		driver.close();
		
		//3. click on each link in different tabs
		for (int i=1; i<firstCol.findElements(By.tagName("a")).size();i++)
		{
			String clickonLinkInTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			firstCol.findElements(By.tagName("a")).get(i).sendKeys(clickonLinkInTab);
		}
	}

}
