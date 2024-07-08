package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ProductsInCart extends BaseTest{
  @Test
  public void ProductsCart() throws InterruptedException {
	  WebElement pc=driver.findElement(By.xpath("//i[@class='fa fa-home']/parent::a"));
	  if(pc.isDisplayed()) {
		  System.out.println("User have seen to the hpome page");
	  }
	  else {
		  System.out.println("User have not seen to the hpome page");

	  }
	  driver.findElement(By.xpath("//i[@class='material-icons card_travel']/parent::a")).click();
	  driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[1]")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[3]")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//u[text()='View Cart']")).click();
	  WebElement AP=driver.findElement(By.xpath("//table[@id='cart_info_table']"));
	  if(AP.isDisplayed()) {
		  System.out.println("Both products are added into the cart");
	  }
	  else {
		  System.out.println("Both products are not added into the cart");

	  }
	 WebElement price= driver.findElement(By.xpath("(//tr[@class='cart_menu']/child::td)[3]"));
	 if(price.isDisplayed()) {
		 System.out.println("User will seen the both products of price");
	 }
	 else {
		 System.out.println("User will not seen the both products of price");

		 
	 }
	 WebElement qual= driver.findElement(By.xpath("(//tr[@class='cart_menu']/child::td)[4]"));
	 if(qual.isDisplayed()) {
		 System.out.println("User will seen the both products of quantity");
	 }
	 else {
		 System.out.println("User will not seen the both products of quantity");

		 
	 }
	 WebElement total= driver.findElement(By.xpath("(//tr[@class='cart_menu']/child::td)[5]"));
	 if(total.isDisplayed()) {
		 System.out.println("User will seen the both products of total also");
	 }
	 else {
		 System.out.println("User will not seen the both products of total also");

		 
	 }
	 driver.quit();



	  
	  
  }
}
