//url: https://demo.guru99.com/popup.php

package Automation_Test.Auto_Test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WindowHandle {

	public static void main(String[] args) {
		String url = "https://demo.guru99.com/popup.php";
		WebDriver driver = DriverConnection.getDriver(url);
		
		WebElement link = driver.findElement(By.linkText("Click Here"));
		link.click();
		
		String mainWin = driver.getWindowHandle();
//		System.out.println(mainWin);
		
		Set<String> allwin = driver.getWindowHandles();
		for(String s:allwin) {
			System.out.println(s);
			if (!s.equals(mainWin)) {
				driver.switchTo().window(s);
				WebElement email = driver.findElement(By.name("emailid"));
				email.sendKeys("Selenium@gmail.com");
				driver.findElement(By.name("btnLogin")).click();
				driver.close();
			}
		}
		driver.switchTo().window(mainWin);
		driver.close();
		
	}
}
