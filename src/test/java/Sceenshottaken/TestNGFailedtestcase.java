package Sceenshottaken;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class TestNGFailedtestcase {
	public  static WebDriver driver;
@Test	
public void maintestcase() throws Throwable {
	
	 driver =new ChromeDriver();
	driver.get("https://tutorialsninja.com/demo/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='My Account']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("input-email")).sendKeys("qedge@gmail.com");
	driver.findElement(By.id("input-password")).sendKeys("Alekhya2@123");
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	String Expected_message="Your Account Has Been Created!";
	 String Acutal_message=driver.getTitle();
	 //Assert.assertEquals(Acutal_message, Expected_message, "title does not match");
	 SoftAssert softassert=new SoftAssert();
	 softassert.assertEquals(Acutal_message, Expected_message,"title does not match");
	 
	 //File srcScreenshot=(File)((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
	// String destinationpath =System.getProperty("user.dir")+"\\Screenshot\\"+"page.png";
	//FileHandler.copy(srcScreenshot, new File(destinationpath));
}
@Test
	 public void screenshot() {
		 
	 
	 File srcScreenshot=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	 String destinationpath ="C:\\Users\\DELL\\eclipse-workspace\\StockAccount\\Screenshot\\file.png";
	try {
		FileHandler.copy(srcScreenshot, new File(destinationpath));
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	System.out.println("screenshot taken sucessfully");
	driver.quit();
}
}







