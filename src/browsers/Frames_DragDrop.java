package browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames_DragDrop {

	public void totest() {
		System.out.println("testo1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:/Sandesh/Selenium Downloded/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");

		// Frames can switched using WebElement, Id or String

		System.out.println(driver.findElements(By.tagName("iframe")).size());// to
		// get
		// Number
		// of
		// frames
		// in
		// page

		WebElement frame1 = driver.findElement(By
				.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(frame1);

		Actions a = new Actions(driver);
		
		

		WebElement source = driver.findElement(By
				.xpath(".//*[@id='draggable']"));
		WebElement target = driver.findElement(By
				.xpath(".//*[@id='droppable']"));
		
		//Two ways to perform the same actions using ClickAndHold other one being dragAndDrop
		
		//a.clickAndHold(source).moveToElement(target).release().build().perform();

		a.dragAndDrop(source, target).build().perform();

		driver.switchTo().defaultContent();// back to Top window

	}

}
