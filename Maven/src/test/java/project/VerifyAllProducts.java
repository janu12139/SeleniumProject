package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class VerifyAllProducts extends BaseTest {
  @Test
  public void VerifyPriducts() {
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
     WebElement we1= driver.findElement(By.xpath("//h2[text()='Brands']"));
     if(we1.isDisplayed()) {
    	 System.out.println("All products list is visibile to the cutomers");
    	 
     }
     else {
    	 System.out.println("All products list not is visibile to the cutomers");

     }
     driver.findElement(By.xpath("(//i[@class='fa fa-plus-square']/parent::a)[1]")).click();
     WebElement we2= driver.findElement(By.xpath("//h2[text()='Blue Top']"));
     if(we2.isDisplayed()) {
    	 System.out.println("User will landed the product details page");
    	 
     }
     else {
    	 System.out.println("User will not lkaded the product details");

     }
     driver.quit();


     
  }
}
