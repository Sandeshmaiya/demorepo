package browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Sandesh/Selenium Downloded/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.makemytrip.com/flights/");
		
		//Web form validation 1 --- isDisplayed
		driver.findElement(By.xpath("")).isDisplayed();// returns boolean value
		
		//Note: isDisplayed will not work if the Object not Available in the code for this we need to Use different method
		
		//Web form validation 2 -------.size()
		int Count = driver.findElements(By.xpath("xpath")).size();
		if(Count == 0)			
		{
			System.out.println("Object not Found");
			
		}
		
		//Web form validation 3  isEnabled, returns boolean value
		driver.findElement(By.xpath("")).isEnabled();
		//Web form validation 4  getText, to check text exists in Page
		driver.findElement(By.xpath("")).getText();
				

	}

}
