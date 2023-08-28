import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://spicejet.com");
        driver.findElement(By.xpath("//div[@data-testid=\"home-page-travellers\"]")).click();
        
        System.out.println(driver.findElement(By.xpath("//div[@data-testid=\"home-page-travellers\"]")).getText());
        //adding 5 adults
        Thread.sleep(5000);
        for (int i=1;i<5;i++)
        {
        driver.findElement(By.xpath("//div[@data-testid=\"Adult-testID-plus-one-cta\"]")).click();
        }

        System.out.println(driver.findElement(By.xpath("//div[@data-testid=\"home-page-travellers\"]")).getText());
        driver.close();
	}

}
