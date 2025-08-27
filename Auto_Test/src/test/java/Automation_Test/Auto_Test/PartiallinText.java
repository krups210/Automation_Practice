package Automation_Test.Auto_Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PartiallinText {
	public static void main(String[] args) {
		String url = "https://www.facebook.com/";
		WebDriver driver = DriverConnection.getDriver(url);
		
		List<WebElement> list = driver.findElements(By.partialLinkText("Create"));
		for(WebElement link : list) {
			System.out.println(link.getText());
		}
		list.get(1).click();
		driver.navigate().back();
		driver.close();
	}
}
