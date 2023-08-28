import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Free Access to InterviewQues/ResumeAssistance/Material')]")).click();
		Set <String> windows =driver.getWindowHandles();
		Iterator <String> it = windows.iterator();
		String parentID =it.next();
		String childID = it.next();
		driver.switchTo().window(childID);
		//driver.findElement(By.xpath("//*[contains(text(),'mentor@rahulshettyacademy.com')]")).getText();
		String email = driver.findElement(By.xpath("//*[contains(text(),'mentor@rahulshettyacademy.com')]")).getText();
		driver.switchTo().window(parentID);
		driver.findElement(By.id("username")).sendKeys(email);
		driver.close();
		
		
	}

}
