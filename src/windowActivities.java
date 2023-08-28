import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowActivities {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.navigate().to("https://rahulshettyacademy.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();
		
		/*driver.get() used to launch a particular website url, whereas driver.navigate().to() is also used to launch the particular
		website by passing the URL but we can use forward and backward button to navigate between the pages during test case writing.
        If you want to use back() and forward() method after driver.get() method, but you need to use it with Navigation Methods only.
        Both are exactly same, both are synonyms of each other. In fact navigate.to() method is calling get() method internally.
	    */
		
		
		//Explicit wait
	}

}
