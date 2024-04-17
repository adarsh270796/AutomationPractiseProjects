import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollectionPractise {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getTitle());
		String[] abc = driver.getTitle().split(" ");
		
		for (String i : abc)
		{
			System.out.println(i);
		} 
		driver.close();
		
		
	}

}
