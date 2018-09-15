package browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int Sum=1;
		System.setProperty("webdriver.chrome.driver", "C:/Sandesh/Selenium Downloded/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18922/cd-vs-nk-28th-match-plunket-shield-2017-18");
		
		Thread.sleep(3000L);
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		
			int rowcount = table.findElements(By.cssSelector("div[class ='cb-col cb-col-100 cb-scrd-itms']")).size();
			int count = table.findElements(By.cssSelector("div[class ='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();// parent to child
			
			for (int i= 0; i<count-2 ; i++){
				
				String Value =table.findElements(By.cssSelector("div[class ='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
				Sum = Sum + Integer.parseInt(Value);
			}
			String extra =driver.findElement(By.xpath("//div[text()= 'Extras']/following-sibling::div")).getText();// Sibling to Sibling 
			Sum = Sum +Integer.parseInt(extra);
			
			System.out.println(Sum);
			String total = driver.findElement(By.xpath("//div[text()= 'Total']/following-sibling::div")).getText();
			int finaltotal = Integer.parseInt(total);
			
			if(Sum==finaltotal){
				
				System.out.println("Total Sum are in Match");
			} else {System.out.println("Notin Synch");}
				
			}
			
	}


