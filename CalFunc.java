package Calendar_2ndJune;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalFunc {

	public static void main(String[] args) throws InterruptedException {

		String url = "https://www.irctc.co.in/nget/train-search";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mgallani\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		system.out.println("abc");
		system.out.println("abc");
		driver.get("https://www.yatra.com");		
		driver.findElement(By.id("BE_flight_origin_date")).click();
		driver.findElement(By.id("05/06/2019")).click();
	}

}
