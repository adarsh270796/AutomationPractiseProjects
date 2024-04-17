import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleWindowsTabsSel4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
	
		driver.switchTo().newWindow(WindowType.TAB);
		Set <String> windowhndl = driver.getWindowHandles();
		Iterator <String> it = windowhndl.iterator();
		String parentwinhndl = it.next();
		String childwinhndl = it.next();
		driver.switchTo().window(childwinhndl);
		driver.get("https://rahulshettyacademy.com/");
		String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/']"))
		.get(1).getText();
		driver.switchTo().window(parentwinhndl);
		driver.findElement(By.cssSelector("[name = 'name']")).sendKeys(courseName);
		driver.quit();
		
		
		
		
		
	}

}
