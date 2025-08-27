package Automation_Test.Auto_Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagName {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.facebook.com/";
		WebDriver driver = DriverConnection.getDriver(url);
		
		List<WebElement> tags = driver.findElements(By.tagName("a"));
		String str[] = new String[tags.size()];
		int i = 0;
		for(WebElement tag: tags) {
			//System.out.println(tag.getText());
			
			if(!tag.getText().equals("")) {
				str[i] = tag.getText();
				i++;
				//System.out.println(tag.getText());

			}
		}
		
		for(String s: str) {
			WebElement link = driver.findElement(By.linkText(s));
			link.click();
			Thread.sleep(5000);
			driver.navigate().back();
		}
	}
}
