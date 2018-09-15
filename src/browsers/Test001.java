package browsers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test001 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int count =0;
		
	
		
	
		
		System.setProperty("webdriver.chrome.driver", "C:/Sandesh/Selenium Downloded/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.mcxlivedata.in/buysellindicator/mcx-crudeoil-indicator-commodity-discussion/");
		
		Thread.sleep(5000l);
		String Lst_Updated = driver.findElement(By.xpath(".//*[@id='CRO']/p[1]/sub[1]")).getText();
		
		
		//DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		
		DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
		Calendar calendar= Calendar.getInstance();
		Date date = calendar.getTime();
		String date1= dateFormat.format(date);		
		System.out.println(date1);
		
		String[] splited = Lst_Updated.split("\\s+");
		for (String num : splited) {
			if (count == 4 && num.equals(date1)){
				System.out.println("Pass");
				break;
			} 
			count++;
		}
		
		if (count != 4){
			System.out.println("FAIL");
		}
		

	}

}

