package Automation_Test.Auto_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class DriverConnection {
//	public static WebDriver getDriver(String url) {
//		System.setProperty("Webdriver.chrome.driver","A:\\Krupal\\Automation Testing\\Automation Practice\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get(url);
//		return driver;
//	}
//}

public class DriverConnection {
	public static WebDriver getDriver(String url) {
		System.setProperty("Webdriver.chrome.driver","A:\\Krupal\\Automation Testing\\Automation Practice\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
}