package project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RegisterWithExistingData extends BaseTest {
  @Test
  public void RegWithIncorrect() throws IOException {
	  WebElement we=driver.findElement(By.xpath("//i[@class='fa fa-home']/parent::a"));
	  if(we.isDisplayed()) {
		  System.out.println("User will get the homepage");
	  }
	  else{
		  System.out.println("User will not get the homepage");

		  
	  }
	  driver.findElement(By.xpath("//i[@class='fa fa-lock']/parent::a")).click();
	  String name="janu";
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys(name);
		String Email="janu@gmail.com";
       driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys(Email);
		driver.findElement(By.xpath("(//button[@class='btn btn-default'])[2]")).click();
		WebElement Text=driver.findElement(By.xpath("//p[text()='Email Address already exist!']"));
		if(Text.isDisplayed()) {
			System.out.println("User will get the Error like Email address is alredy exists");
		}
		else{
			System.out.println("User will not get the Email address is alredy exists");

			
		}
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(source, new File(".\\Screenshots\\" + System.currentTimeMillis() + ".png"));

		driver.quit();

       
  }
}
