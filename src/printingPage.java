import java.time.Duration;

import org.openqa.selenium.Pdf;
import org.openqa.selenium.PrintsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.print.PrintOptions;

public class printingPage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev");
	    PrintsPage printer = (PrintsPage) driver;

	    PrintOptions printOptions = new PrintOptions();
	    printOptions.setPageRanges("1-2");

	    Pdf pdf = printer.print(printOptions);
	    String content = pdf.getContent();
	}

}
