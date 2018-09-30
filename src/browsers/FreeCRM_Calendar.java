package browsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FreeCRM_Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:/Sandesh/Selenium Downloded/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.freecrm.com/");

		driver.findElement(By.name("username")).sendKeys("sandeshmaiya");
		driver.findElement(By.name("password")).sendKeys("sandesh1");

		Thread.sleep(3000l);
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		driver.switchTo().frame("mainpanel");
		String date1 = "31-September-2018";
		String[] datearray = date1.split("-");
		String day = datearray[0];
		String month = datearray[1];
		String year = datearray[2];

		Select select = new Select(driver.findElement(By.name("slctMonth")));
		select.selectByVisibleText(month);

		Select select1 = new Select(driver.findElement(By.name("slctYear")));
		select1.selectByVisibleText(year);
		// *[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]
		// *[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]
		// *[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[7]

		String beforeXpath = "//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[";
		String afterXpath = "]/td[";
		final int totalweek = 7;
		String checknumber = null;
		boolean flag = false;
		for (int rowNumber = 2; rowNumber <= 7; rowNumber++) {
			for (int colNumber = 1; colNumber <= totalweek; colNumber++) {

				try {
					checknumber = driver.findElement(
							By.xpath(beforeXpath + rowNumber + afterXpath
									+ colNumber + "]")).getText();

				} catch (NoSuchElementException e) {
					System.out.println("please entercorrect date");
				}

				System.out.println(checknumber);
				if (checknumber.equals(day)) {
					driver.findElement(
							By.xpath(beforeXpath + rowNumber + afterXpath
									+ colNumber + "]")).click();
					flag = true;
					break;

				}

			}
			if (flag)
				break;
		}

	}

}
