// URL code: https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html

package Automation_Test.Auto_Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTable {
	public static void main(String[] args) {
		String url = "https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
		WebDriver driver = DriverConnection.getDriver(url);

	//	WebElement Row_name = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[4]/td[2]/span"));
		
//		WebElement Row_name = driver.findElement(By.xpath("//table[@id = 'customers']/tbody/tr/th[3]"));
//		System.out.println(Row_name.getText());
		
		
// 		********************************************
//		List<WebElement> header = driver.findElements(By.xpath("//table[@id = 'customers']/tbody/tr/th"));
//		for(WebElement e: header) {
//			System.out.print(e.getText() + " ");
//		}
//		System.out.println();
		
		
//		********************************************
		List<WebElement> header = driver.findElements(By.xpath("//table[@id = 'customers']/tbody/tr/th/span"));
		//System.out.println(tr.size());
		for(WebElement e: header) {
			System.out.print(e.getText() + " ");
		}
		System.out.println();
		
		List<WebElement> tr = driver.findElements(By.xpath("//table[@id = 'customers']/tbody/tr"));
		for(int i = 2; i <= tr.size(); i++) {
			List<WebElement> td = driver.findElements(By.xpath("//table[@id = 'customers']/tbody/tr[" + i + "]/td"));
			for (int j= 1; j<= td.size(); j++) {
				WebElement data = driver.findElement(By.xpath("//table[@id = 'customers']/tbody/tr/td[" + j +"]/span"));
				System.out.print(data.getText() + " ");
			}
			System.out.println();
		}
		
	}
}

