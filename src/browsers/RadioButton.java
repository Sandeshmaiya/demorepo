package browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Sandesh/Selenium Downloded/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		// Handle Radio button 1 - Specific Click		
		driver.findElement(By.xpath("//input[@value='Butter']")).click();
		
		//Handle Radio button 2 - Count number of RadioButton
		
		int Count_RD = driver.findElements(By.xpath("//input[@name= 'group1']")).size();
		System.out.println(Count_RD);
		
		//Handle Radio button 3 - Assume there is no Value Attribute (second Radio button)
				
		for(int i=0;i<Count_RD; i++){
			
			String name= driver.findElements(By.xpath("//input[@name= 'group1']")).get(i).getAttribute("value");
			
			
			//if(name.equals("cheese")){driver.findElements(By.xpath("//input[@name= 'group1']")).get(i).click();}
			//use this for string match 
			
			if(i==2){
				driver.findElements(By.xpath("//input[@name= 'group1']")).get(i).click();
					}
			}
			
		}
			
	}


