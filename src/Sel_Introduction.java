import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel_Introduction {

	public static void main(String[] args) {
		// invoking chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*
		//invoking gecko driver
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\chromedriver_win32\\geckodriver.exe");
		WebDriver driver2 = new FirefoxDriver();
		
		//invoking edge driver
		System.setProperty("webdriver.edge.driver", "C:\\Users\\chromedriver_win32\\msedgeddriver.exe");
		WebDriver driver3 = new EdgeDriver();
		*/
		
		
		driver.get("https://rahulshettyacademy.com");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		
		
		
		
	}

}
