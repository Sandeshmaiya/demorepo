package browsers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Sandesh/Selenium Downloded/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.path2usa.com/travel-companions");
		
		// common Object across the date hence use CSS
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		selectdate("23", "April", driver);
		
		
		//driver.findElement(By.xpath("//div[@id='fare_"+ newdate +"']")).click();
			
	}

	
/* Click on date using  xpath Site name "Goibbo"*/
	public static String dateformat(int noOfDays){		
		
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		Calendar calendar= Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, noOfDays);
		Date date = calendar.getTime();		
		String date1= dateFormat.format(date);		
		return date1;
	}
	
	public static void selectdate(String day, String month, WebDriver driver){
		
		driver.findElement(By.xpath("//input[@name='travel_date']")).click();		
		
		while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class ='datepicker-switch']"))
				.getText().contains(month))
		{
				driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
		}
				
		int count = driver.findElements(By.cssSelector("[class ='day']")).size();		
		List<WebElement> date =driver.findElements(By.cssSelector("[class ='day']"));
		
			for (int i= 0; i<count;i++)
			{
				String Text = date.get(i).getText();
				
				if (Text.equalsIgnoreCase(day)){
					date.get(i).click();
					break;
				}
			}
	}
	
}
