package Automation_Test.Auto_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scroll_Event {
	public static void main(String[] args) {
		String url = "https://www.amazon.in/";
		//String url ="https://demoqa.com/automation-practice-form";
		WebDriver driver = DriverConnection.getDriver(url);
		
		//URL for javascriptexecutor
		//https://www.browserstack.com/guide/selenium-scroll-tutorial
		
		
		//1. Scroll by Pixels
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,350)", "");
		
		
//		//2. Scroll by Element
//		WebElement state = driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]/div[1]"));
//		js.executeScript("arguments[0].scrollIntoView();", state);
		
		
		//3. Scroll By Bottom in amazon
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
	}
}
