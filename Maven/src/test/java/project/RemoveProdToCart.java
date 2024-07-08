package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RemoveProdToCart extends BaseTest {
  @Test
  public void RemoveProducts() {
      WebElement LA1=driver.findElement(By.xpath("//i[@class='fa fa-home']/parent::a"));
      if(LA1.isDisplayed()) {
    	  System.out.println("User have seen to the HomePage");
      }
      else {
    	  System.out.println("User have not seen to homepage");
      }
      driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[13]")).click();
      driver.findElement(By.xpath("//button[@class='btn btn-success close-modal btn-block']")).click();
      driver.findElement(By.xpath("(//i[@class='fa fa-shopping-cart']/parent::a)[1]")).click();
      WebElement we=driver.findElement(By.xpath("//section[@id='cart_items']"));
      System.out.println(we.getText());
      driver.findElement(By.xpath("//i[@class='fa fa-times']")).click();
      WebElement we1=driver.findElement(By.xpath("(//p[@class='text-center'])[3]"));
      if(we1.isDisplayed()) {
    	  System.out.println("product is removed in the cart");
      }
      else {
    	  System.out.println("product is not removed in the cart");

      }
      driver.quit();

  }
}
