package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SubscriptionInCP extends BaseTest{
  @Test
  public void CartSub() {
      WebElement LA1=driver.findElement(By.xpath("//i[@class='fa fa-home']/parent::a"));
      if(LA1.isDisplayed()) {
    	  System.out.println("User have seen to the HomePage");
      }
      else {
    	  System.out.println("User have not seen to homepage");

      }
      driver.findElement(By.xpath("//i[@class='fa fa-shopping-cart']/parent::a")).click();
      WebElement Sc=driver.findElement(By.xpath("//h2[text()='Subscription']"));
      if(Sc.isDisplayed()) {
    	  System.out.println("subscription option is visible to the cutomer");
      }
      else {
    	  System.out.println("subscription option not is visible to the cutomer");

      }
      String Email="janu@gmail.com";
      driver.findElement(By.xpath("//input[@id='susbscribe_email']")).sendKeys(Email);
      driver.findElement(By.xpath("//i[@class='fa fa-arrow-circle-o-right']")).click();
      System.out.println("user will get the you have been sucessfully subscribed message");
      driver.quit();

      

  }
}
