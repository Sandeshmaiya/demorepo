package browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_ajax_moveOver_keyBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:/Sandesh/Selenium Downloded/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();// to maximize the AUT
		Actions a = new Actions(driver);

		// make sure you give driver access inside movetoelement
		// contextClick() to Right Click on the Element
		a.moveToElement(driver.findElement(By.id("nav-link-yourAccount")))
				.contextClick().build().perform();

		// MAke sure to provide keyDown(Keys.SHIFT)
		a.moveToElement(
				driver.findElement(By
						.xpath("//input[@id='twotabsearchtextbox']"))).click()
				.keyDown(Keys.SHIFT).sendKeys("superman").doubleClick().build()
				.perform();

	}

}
