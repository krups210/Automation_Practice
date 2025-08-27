package Automation_Test.Auto_Test;

import java.io.File;

import org.openqa.selenium.By;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	
	public static void getScreenShort(WebDriver driver, String path) {
		TakesScreenshot ss = (TakesScreenshot)driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		try {
			FileUtils.copyFile(source,dest);
			System.out.println("SS Taken");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		String url = "https://www.facebook.com/";
		WebDriver driver = DriverConnection.getDriver(url);
		
		driver.findElement(By.id("email")).sendKeys("Selenium@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("selenium@123");
		getScreenShort(driver, "A:\\Krupal\\Automation Testing\\Automation Practice\\ScreenShots\\facebook.png");
		
	}
}
