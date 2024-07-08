package project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class LoginWithInCorrectDetails{
	WebDriver driver;
	
	@Parameters({"browsername","url","Email","PW"})
   @Test
	  public void LoginInCorrectdata(String browsername,String url,String Email,String PW) throws InterruptedException, IOException {
	       driver =  new ChromeDriver();
	     driver.get("https://automationexercise.com/");
       driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
      driver.findElement(By.xpath("//i[@class='fa fa-lock']/parent::a")).click();
      WebElement LA=driver.findElement(By.xpath("//h2[text()='Login to your account']"));
      if(LA.isDisplayed()) {
    	  System.out.println("User is visible to the Login to your account");
      }
      else {
    	  System.out.println("Login to your Account not is visibiled");

      }
	  driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys(Email);
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys(PW);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[text()='Login']")).click();
	  Thread.sleep(2000);
	  WebElement we=driver.findElement(By.xpath("//p[text()='Your email or password is incorrect!']"));
	  we.getText();
	  if(we.isDisplayed()) {
		  System.out.println("User will getting the error like your email password is incorrect");
	  }
	  else {
		  System.out.println("User will not getting the your email password is incorrect");

	  }
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(source, new File(".\\Screenshots\\" + System.currentTimeMillis() + ".png"));


		driver.quit();


  }
}
