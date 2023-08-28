import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsCLass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.com/");
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.xpath("//a[text()=\"Cart\"]"));
		a.moveToElement(move).build().perform();
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-bb-search\"]"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		a.moveToElement(move).contextClick().build().perform();
		a.moveToElement(move).doubleClick();
		

	}

}
