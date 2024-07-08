package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SearchProduct extends BaseTest {
  @Test
  public void Products() {
      WebElement LA1=driver.findElement(By.xpath("//i[@class='fa fa-home']/parent::a"));
      if(LA1.isDisplayed()) {
    	  System.out.println("User have seen to the HomePage");
      }
      else {
    	  System.out.println("User have not seen to homepage");

      }
      driver.findElement(By.xpath("//i[@class='material-icons card_travel']/parent::a")).click();

  
  WebElement we= driver.findElement(By.xpath("//h2[@class='title text-center']"));
  if(we.isDisplayed()) {
 	 System.out.println("User will navigate the All Products page sucessfully");
 	 
  }
  else {
 	 System.out.println("User will not navigate the All Products page sucessfully");

  }
  driver.findElement(By.xpath("//input[@id='search_product']")).sendKeys("saree");
  driver.findElement(By.xpath("//button[@id='submit_search']")).click();
  WebElement we1=driver.findElement(By.xpath("//h2[@class='title text-center']"));
  if(we1.isEnabled()) {
	 	 System.out.println("User have visibile to the search products");
	 	 
	  }
	  else {
	 	 System.out.println("User have not visibile to the search products");

	  }
  driver.quit();

  

}    }
