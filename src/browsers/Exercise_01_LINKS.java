package browsers;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise_01_LINKS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Sandesh/Selenium Downloded/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.ebay.com/");
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		/*WebElement footer = driver.findElement(By.xpath("//footer[@id='glbfooter']"));
		 int count = footer.findElements(By.tagName("a")).size();
		 
		 for(int i=0;i<count; i++){
			 
			 System.out.println(footer.findElements(By.tagName("a")).get(i).getText());
			 		
			 
		 }*/

		 
		 WebElement column = driver.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));			 
		 
		 int count2 = column.findElements(By.tagName("a")).size();
		
		 
		 for(int j=0;j<count2; j++){
			 System.out.println(column.findElements(By.tagName("a")).get(j).getText()); 
			 
			 if(column.findElements(By.tagName("a")).get(j).getText().contains("Site map")){
				 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				 column.findElements(By.tagName("a")).get(j).click();
				 break;
			 }
			 
			// to validate between the Clicks or pages we  can have the Title Compare from Page 1 to 2 Looping condition will not equal to. Have PAss and Fail in SYSO
			 // to validate  the page take the text displayed in 2nd page and Compare using is displayed()
		 
		 }
			 
	}

}
