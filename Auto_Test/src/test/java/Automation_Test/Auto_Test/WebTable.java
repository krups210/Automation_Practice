// URL code: https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html

package Automation_Test.Auto_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTable {
	public static void main(String[] args) {
		String url = "https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
		WebDriver driver = DriverConnection.getDriver(url);

	//	WebElement Row_name = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[4]/td[2]/span"));
		
		WebElement Row_name = driver.findElement(By.xpath("//table[@id = 'customers']/tbody/tr[4]/td[2]/span"));
		System.out.println(Row_name.getText());
		
	}
}

