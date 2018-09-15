package browsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebContols_Captcha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Sandesh/Selenium Downloded/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://patrickhlauke.github.io/recaptcha/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		int number = findframenumber(driver, By.xpath("//*[@id='recaptcha-anchor']/div[5] "));
		driver.switchTo().frame(number);		
		driver.findElement(By.xpath("//*[@id='recaptcha-anchor']/div[5] ")).click();	
		
		driver.switchTo().defaultContent();
		
		
	
		int number1=findframenumber(driver, By.xpath(".//*[@id='recaptcha-verify-button']"));
		driver.switchTo().frame(number1);		
		driver.findElement(By.xpath(".//*[@id='recaptcha-verify-button']")).click();
		
		
		
		
	}
	

	
	public static int findframenumber(WebDriver driver, By by){
		
		int i;
		int count = driver.findElements(By.tagName("iframe")).size();
		
		for (i=0; i<=count; i++){
		driver.switchTo().frame(i);
							
		int numberOfFrames = driver.findElements(by).size();	
		if(numberOfFrames>0){
					
			break; 
			
		}else{
			 
			 System.out.println("Continue Looping");
			 driver.switchTo().defaultContent(); // This is important Step, if not then Code will try to find the Frame inside the frame.
		 }
		
		}
		
		driver.switchTo().defaultContent();
		System.out.println(i);
		return i;
	}
	
}
