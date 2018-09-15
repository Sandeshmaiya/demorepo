package browsers;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childwindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Sandesh/Selenium Downloded/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://accounts.google.com/");		
		driver.findElement(By.xpath("//*[@id='initialView']/footer/ul/li[3]/a")).click();
		System.out.println(driver.getTitle());
		
		// GetWindowhandles expects the return type to be in Set<String>
		
		Set<String> ids = driver.getWindowHandles();
		
		//Iterator to expects to be in Set<String>
		Iterator<String>  it= ids.iterator();
				
		String  parentid = it.next();// 1st Window
		String  Childid = it.next();// 2nd Window
		
		driver.switchTo().window(Childid);
		System.out.println(driver.getTitle());
		//driver.switchTo().defaultContent();//  this is useful in frames not for Child Windows
		
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		

	}

}
