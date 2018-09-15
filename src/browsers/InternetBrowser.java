package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.ie.driver", "C:/Sandesh/Selenium Downloded/IEDriverServer/IEDriverServer.exe");
		
		//******* GEEKO DRIVER PATH*********/////
		//System.setProperty("webdriver.gecko.driver", "C:/Sandesh/Selenium Downloded/geckodriver/geckodriver.exe");
		
		WebDriver driver= new InternetExplorerDriver();		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		

	}

}
