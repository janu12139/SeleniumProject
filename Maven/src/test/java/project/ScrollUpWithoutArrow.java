package project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ScrollUpWithoutArrow extends BaseTest{
  @Test
  public void ScrollUp() throws InterruptedException {
      WebElement LA1=driver.findElement(By.xpath("//i[@class='fa fa-home']/parent::a"));
      if(LA1.isDisplayed()) {
    	  System.out.println("User have seen to the HomePage");
      }
      else {
    	  System.out.println("User have not seen to homepage");

      }
     //Scroll down
      JavascriptExecutor jse=(JavascriptExecutor)driver;
     jse.executeScript("window.scroll(0, 350)");
     Thread.sleep(1000);
      WebElement we=driver.findElement(By.xpath("//h2[text()='Subscription']"));
      if(we.isDisplayed()) {
    	  System.out.println("user will seen the subscription option");
      }
      else {
    	  System.out.println("user will not seen the subscription option");

      }
      Thread.sleep(1000);
      //Scroll up
      JavascriptExecutor jse1=(JavascriptExecutor)driver;
     jse1.executeScript("window.scroll(0, -350)");
     Thread.sleep(1000);
     WebElement we1=driver.findElement(By.xpath("//div[@class='logo pull-left']/child::a/child::img"));
     if(we1.isDisplayed()) {
   	  System.out.println("user will get the hompage");
     }
     else {
   	  System.out.println("user will not get the hompage");

     }
     driver.quit();


	  
  }
}
