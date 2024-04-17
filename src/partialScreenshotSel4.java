import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class partialScreenshotSel4 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
	     //switching window
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set <String> windowhndl = driver.getWindowHandles();
		Iterator <String> it = windowhndl.iterator();
		String parentwinhndl = it.next();
		String childwinhndl = it.next();
		driver.switchTo().window(childwinhndl);
		driver.get("https://rahulshettyacademy.com/");
		String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/']"))
		.get(1).getText();
		driver.switchTo().window(parentwinhndl);
		WebElement name =driver.findElement(By.cssSelector("[name = 'name']"));
		name.sendKeys(courseName);
		//taking element screenshot
		File file =name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(file, new File("coursename.png"));
		
		//Get height and width 
		System.out.println(name.getRect().getDimension());
		System.out.println(name.getRect().getWidth());
		System.out.println(name.getRect().getHeight());
	
		
		
		driver.quit();
	}

}
