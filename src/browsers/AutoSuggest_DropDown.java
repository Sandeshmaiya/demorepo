package browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutoSuggest_DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Sandesh/Selenium Downloded/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get("https://www.ksrtc.in/oprs-web/");
			
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BEN");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		
		Thread.sleep(2000l);// if script runs fast den use wait statements
		
		String script = "return document.getElementById(\"fromPlaceName\").value;";		
		String text= (String) js.executeScript(script); 
		System.out.println(text); 
		int i=0;
		while (!text.equalsIgnoreCase("BENGALURU INTERNATION AIPORT")){
			i++;
			driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
			
			text= (String) js.executeScript(script); 
			System.out.println(text);
			
			if(i>12){
				
				break;
			} 
			
		}
		
		if(i>12){
			System.out.println("not found");
			
		} else {System.out.println("found");} // Dont use print statements inside the loop, when ever object not found it prints
		// hence use print statements outside loop
		
		
		/*String Newstring =driver.findElement(By.xpath("//input[@name='fromPlaceName']")).getText();
		System.out.println(Newstring); */
		
		// Output will be null or nothing as object's class is in hidden Mode. Hence use JavaScript HTML DOM	
		// Investigate the properties of object if it has any hidden text	
		// Reason - Selenium cannot identify Ajax implementation
				//Selenium has JavaScriptExecutor (Using javaScripts in JAVA) BANGALORE INTERNATION AIPORT
		
	
	}

}
