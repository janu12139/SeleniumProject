package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BrandProducts extends BaseTest{
  @Test
  public void ClickBrandProducts() {
	  driver.findElement(By.xpath("//i[@class='material-icons card_travel']")).click();
	  WebElement we=driver.findElement(By.xpath("//h2[text()='Brands']"));
	  if(we.isDisplayed()) {
		  System.out.println("Brands are visible to the left side bar");
	  }
	  else {
		  System.out.println("Brands are not visible to the left side bar");

	  }
	  driver.findElement(By.xpath("(//span[@class='pull-right']/parent::a)[1]")).click();
	  WebElement we1=driver.findElement(By.xpath("(//div[@class='container'])[2]"));
	  if(we1.isDisplayed()) {
		  System.out.println("polo brand products is visible to the customers");
	  }
	  else {
		  System.out.println("polo brand products is not visible to the customers");

	  }
	  driver.findElement(By.xpath("(//span[@class='pull-right']/parent::a)[2]")).click();
	  WebElement we2=driver.findElement(By.xpath("//h2[@class='title text-center']"));
	  if(we2.isDisplayed()) {
		  System.out.println("H&M brand products is visible to the customers");
	  }
	  else {
		  System.out.println("H&M brand products is not visible to the customers");

	  }
	  driver.quit();

	  
	  
	  
	  
  }
}
