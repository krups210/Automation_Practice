package Automation_Test.Auto_Test;

import java.awt.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IFrame {
	public static void main(String[] args) {
		String url = "https://demoqa.com/frames";
		WebDriver driver = DriverConnection.getDriver(url);
		
		WebElement Frame1 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(Frame1);
		
		WebElement text1 = driver.findElement(By.id("sampleHeading"));
		System.out.println(text1.getText());
		
		driver.switchTo().window(driver.getWindowHandle());
		
		WebElement Frame2 = driver.findElement(By.id("frame2"));
		driver.switchTo().frame(Frame2);
		
		WebElement text2 = driver.findElement(By.id("sampleHeading"));
		System.out.println(text2.getText());
		
	}
}
