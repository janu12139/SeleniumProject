package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseTest {
	WebDriver driver;
 @Test
  public void f() {
       driver =  new ChromeDriver();
       
      driver.get("https://automationexercise.com/");

		driver.manage().window().maximize();


		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);


  }
}
