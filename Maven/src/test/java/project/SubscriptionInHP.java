package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SubscriptionInHP extends BaseTest{
  @Test
  public void subscription() {
      WebElement LA1=driver.findElement(By.xpath("//i[@class='fa fa-home']/parent::a"));
      if(LA1.isDisplayed()) {
    	  System.out.println("User have seen to the HomePage");
      }
      else {
    	  System.out.println("User have not seen to homepage");

      }
      WebElement s=driver.findElement(By.xpath("//h2[text()='Subscription']"));
      if(s.isDisplayed()) {
    	  System.out.println("User have seen to the subscription in homepage");
      }
      else {
    	  System.out.println("User have not seen to the subscription homepage");

      }
      driver.findElement(By.xpath("//input[@id='susbscribe_email']")).sendKeys("janu@gmail.com");
      driver.findElement(By.xpath("//i[@class='fa fa-arrow-circle-o-right']")).click();
      System.out.println("user will get the you have been sucessfully subscribed message");
      driver.quit();

      

  }
}
