package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class VerfyTestrCase extends BaseTest{
  @Test
  public void Terstcase() {
      WebElement LA1=driver.findElement(By.xpath("//i[@class='fa fa-home']/parent::a"));
      if(LA1.isDisplayed()) {
    	  System.out.println("User have seen to the HomePage");
      }
      else {
    	  System.out.println("User have not seen to homepage");

      }
      driver.findElement(By.xpath("(//i[@class='fa fa-list']/parent::a)[1]")).click();
      WebElement we=driver.findElement(By.xpath("//b[text()='Test Cases']"));
      if(we.isDisplayed()) {
    	  System.out.println("User will get the TestCases page");
      }
      else{
    	  System.out.println("User will not get the TestCases page");

      }
      driver.quit();
      

  }
}
