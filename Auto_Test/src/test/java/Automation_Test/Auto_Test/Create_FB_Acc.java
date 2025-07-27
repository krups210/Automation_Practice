package Automation_Test.Auto_Test;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Create_FB_Acc {
	public static void main(String[] args) {
		String url = "https://www.facebook.com/";
		WebDriver driver = DriverConnection.getDriver(url);
		
		WebElement CreateNewAcc = driver.findElement(By.linkText("Create new account"));
		CreateNewAcc.click();
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Krupal");
		
		WebElement surename = driver.findElement(By.name("lastname"));
		surename.sendKeys("Patel");
		
		WebElement days = driver.findElement(By.id("day"));
		Select day = new Select(days);
		day.selectByIndex(1);
		
		WebElement months = driver.findElement(By.id("month"));
		Select month = new Select(months);
		month.selectByValue("10");
		
		WebElement years = driver.findElement(By.id("year"));
		Select year = new Select(years);
		year.selectByVisibleText("1999");
		
		List<WebElement> gender = driver.findElements(By.id("sex"));
		for(WebElement e:gender) {
			System.out.println(e);
		}
		gender.get(1).click();
		
		WebElement contectno = driver.findElement(By.name("reg_email__"));
		contectno.sendKeys("7819999064");
		
		WebElement pass = driver.findElement(By.id("password_step_input"));
		pass.sendKeys("Admin@123");
		
		
	}
}
