package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
	
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:/Sandesh/Selenium Downloded/chromedriver_win32/chromedriver.exe");
	WebDriver driver = new ChromeDriver();	
	driver.get("google.com");

}
	
}
