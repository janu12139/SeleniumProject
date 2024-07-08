package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ProductQuantity extends BaseTest{
  @Test
  public void PrdQun() throws InterruptedException {
	  WebElement pc=driver.findElement(By.xpath("//i[@class='fa fa-home']/parent::a"));
	  if(pc.isDisplayed()) {
		  System.out.println("User have seen to the homepome page");
	  }
	  else {
		  System.out.println("User have not seen to the hpome page");

	  }
	  driver.findElement(By.xpath("(//i[@class='fa fa-plus-square']/parent::a)[3]")).click();
	  WebElement Info=driver.findElement(By.xpath("//div[@class='product-information']"));
	  System.out.println(Info.getText());
      driver.findElement(By.xpath("//input[@id='quantity']")).clear();
      driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys("4");
      driver.findElement(By.xpath("//button[@class='btn btn-default cart']")).click();
      Thread.sleep(1000);
      driver.findElement(By.xpath("//u[text()='View Cart']")).click();
      WebElement Quan=driver.findElement(By.xpath("//button[@class='disabled']"));
      if(Quan.isDisplayed()) {
    	  System.out.println("product is displayed in cart page with exact quantity");
    	  		
      }
      else {
    	  System.out.println("product is not displayed in cart page with exact quantity");

      }
      driver.quit();

      
  }
}
