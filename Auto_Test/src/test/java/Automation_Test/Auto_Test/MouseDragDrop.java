package Automation_Test.Auto_Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseDragDrop {
	public static void main(String[] args) {
		String url = "https://www.globalsqa.com/demo-site/draganddrop/";
		WebDriver driver = DriverConnection.getDriver(url);
		
		WebElement iframe = driver.findElement(By.xpath("//*[@id=\"post-2669\"]/div[2]/div/div/div[1]/p/iframe"));
		System.out.println(iframe);
		driver.switchTo().frame(iframe);
		
		WebElement img1 = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]/img"));
		System.out.println(img1);
		
		WebElement trash = driver.findElement(By.id("trash"));
		Actions action = new Actions(driver);
		action.clickAndHold(img1).moveToElement(trash).release().build().perform();
		
		
	}
}
