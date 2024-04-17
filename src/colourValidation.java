import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class colourValidation {

	      public static void main(String[] args) 
	      {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.manage().window().maximize();
			driver.get("https://www.amazon.com/");
			Color loginButtonColour = Color.fromString(driver.findElement(By.xpath("//button[contains(@type,'submit')]")).getCssValue("color"));
			System.out.println(loginButtonColour);
			
			
			

	}

}
