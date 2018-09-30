package browsers;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:/Sandesh/Selenium Downloded/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		driver.get("http://google.com");
		Thread.sleep(5000l);
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium WEB Testing");

		List<WebElement> list = driver
				.findElements(By
						.xpath("//ul[@role='listbox']/li/descendant::div[@class='sbqs_c']"));
		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {
			if ((list.get(i).getText()).equals("selenium web testing pdf")) {
				list.get(i).click();
				break;
			}

		}

	}

}
