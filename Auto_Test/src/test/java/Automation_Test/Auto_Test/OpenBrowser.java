package Automation_Test.Auto_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","A:\\Krupal\\Automation Testing\\Automation Practice\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		//driver.get("https://brainpayrollwebuat.brainpayroll.co.uk/");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		
		WebElement emailElem = driver.findElement(By.id("email"));
		emailElem.sendKeys("k@gmail.com");
		WebElement PassElem = driver.findElement(By.id("pass"));
		PassElem.sendKeys("Admin@123");
		
		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();
		
		WebElement errmsg = driver.findElement(By.xpath("//*[@id='loginform']/div[2]/div[2]"));
		if(errmsg.isDisplayed()) {
			System.out.println("Error message is displayed: " + errmsg.getText());
		}else {
			System.out.println("Error message is not displayed:");
		}

		// driver.close();
	}
}
