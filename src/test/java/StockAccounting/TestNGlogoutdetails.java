package StockAccounting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGlogoutdetails {
	@Test
	public void setup() throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.get("http://webapp.qedgetech.com/login.php");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='username']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("master");
		driver.findElement(By.xpath("//button[@id='btnsubmit']")).click();
		
	}

}
