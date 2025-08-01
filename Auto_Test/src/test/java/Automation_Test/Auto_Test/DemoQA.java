//URL: https://demoqa.com/alerts

package Automation_Test.Auto_Test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQA {
	public static void main(String[] args) {
		String url = "https://demoqa.com/alerts";
		WebDriver driver = DriverConnection.getDriver(url);
		
//		WebElement alert1 = driver.findElement(By.id("alertButton"));
//		alert1.click();
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
//		
		
//		WebElement alert2 = driver.findElement(By.id("timerAlertButton"));
//		alert2.click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.alertIsPresent());
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		
		
//		WebElement alert3 = driver.findElement(By.id("confirmButton"));
//		alert3.click();
//		Alert alert = driver.switchTo().alert();
//		alert.dismiss();
		
		
		WebElement alert4 = driver.findElement(By.id("promtButton"));
		alert4.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Hello testers");
		alert.accept();
		
	}
}
