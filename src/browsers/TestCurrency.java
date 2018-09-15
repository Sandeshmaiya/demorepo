package browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCurrency {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Sandesh/Selenium Downloded/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://crmtest.amicorp.com/sugarcrm/#Currencies");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password@123");	
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='content']/div/div/div/div/form/div[3]/span/a")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[@href='#Currencies/create']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='iso4217']")).sendKeys("CRC");
		driver.findElement(By.xpath("//input[@name='conversion_rate']")).sendKeys("0.00176446");
	
		
	}

}
