import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenLinks {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/india");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		int noOfLinks = driver.findElements(By.tagName("a")).size();
		System.out.println("Total no. of links on the page - "+noOfLinks);
		List <WebElement> links = driver.findElements(By.tagName("a"));
		for (WebElement link : links)
		{
			String url = link.getAttribute("href");
			if(url!=null && !url.isEmpty())
			{
				try {
					HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
				    connection.setRequestMethod("HEAD");
				    connection.connect();
				    int responseCode = connection.getResponseCode();
				    if(responseCode!=200)
				    {
				    System.out.println("Broken link found "+ url + "Response code: "+responseCode+")");
				    
				    }
				} 
				 catch (Exception e) {
					
					System.out.println("Error checking link:"+ url);
				}
			}
		}
		
		}

}
