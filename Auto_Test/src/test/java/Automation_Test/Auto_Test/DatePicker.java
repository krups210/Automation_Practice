package Automation_Test.Auto_Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DatePicker {
	public static void main(String[] args) {
		String url = "https://www.globalsqa.com/demo-site/datepicker/";
		WebDriver driver = DriverConnection.getDriver(url);
		
		String myDate = "2";
		String myMonth = "October";
		String myYear = "2022";
		
		WebElement iFrame = driver.findElement(By.xpath("//*[@id=\"post-2661\"]/div[2]/div/div/div[1]/p/iframe"));
		driver.switchTo().frame(iFrame);
		
		driver.findElement(By.id("datepicker")).click();
		
		WebElement currentYear =  driver.findElement(By.className("ui-datepicker-year"));
		System.out.println(currentYear.getText());
		
		int y1 = Integer.parseInt(myYear);
		int y2 = Integer.parseInt(currentYear.getText());
		
		//Year
		while(!myYear.equals(driver.findElement(By.className("ui-datepicker-year")).getText())) {
			if(y1 >y2) {
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click();
			}
			else {
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]")).click();
			}
		}
		
		//Month
		while(!myMonth.equals(driver.findElement(By.className("ui-datepicker-month")).getText())) {
			if(y1 >y2) {
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click();
			}
			else {
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]")).click();
			}
		}
		
		//Date
		List<WebElement> dates = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a"));
		for(WebElement d:dates) {
			if(myDate.equals(d.getText())) {
				d.click();
				
			}
		}
		
	}
}
