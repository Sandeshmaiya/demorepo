package browsers;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Sandesh/Selenium Downloded/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("http://www.spicejet.com/");
		
		//ImplicitWait
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		//ExplictWait
		
		WebDriverWait d = (WebDriverWait) new WebDriverWait(driver, 5).ignoring(StaleElementReferenceException.class);
		d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		
		// Thread
		Thread.sleep(3000L); // Need to Add exception for the method
		
		
		// Fluent wait will tell the webdriver to wait for condition for given seconds and the frequency of which element is not available.
		
		
		//Wait wait = new FluentWait<WebDriver>(driver)							
		//		.withTimeout(30, TimeUnit.SECONDS) 			
		//	.pollingEvery(5, TimeUnit.SECONDS) 			
		//	.ignoring(NoSuchElementException.class);
		
		//WebElement clickseleniumlink = wait.until(new Function<WebDriver, WebElement>(){
		
		//public WebElement apply(WebDriver driver ) {
		//return driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i"));
				//}
				//});
		//click on the selenium link
				//clickseleniumlink.click();
		//close~ browser
				//driver.close() ;
		}
	
		
		
		

	}


