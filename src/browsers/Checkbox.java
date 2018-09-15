package browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Sandesh/Selenium Downloded/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("http://www.spicejet.com/");
		
		driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).click();
		
		//isSelected method will let us know if checkbox is checked or not
		driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).isSelected();
		
		//based on isSelected output we can perform desired action
	}

}
