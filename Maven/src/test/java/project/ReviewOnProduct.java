package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ReviewOnProduct extends BaseTest {
  @Test
  public void ReviewProduct() {
	  driver.findElement(By.xpath("//i[@class='material-icons card_travel']/parent::a")).click();
	  WebElement we=driver.findElement(By.xpath("(//div[@class='container'])[3]"));
	  if(we.isDisplayed()) {
		  System.out.println("all products are displayed");
	  }
	  else {
		  System.out.println("all products are not displayed");

	  }
	  driver.findElement(By.xpath("(//i[@class='fa fa-plus-square']/parent::a)[9]")).click();
	  WebElement we2=driver.findElement(By.xpath("//a[text()='Write Your Review']"));
	  if(we2.isDisplayed()) {
		  System.out.println("user have visible to the add write to review option");
	  }
	  else {
		  System.out.println("user have not visible to the add write to review option");
		  	
	  }
	  String name="jaan";
	  driver.findElement(By.xpath("//input[@id='name']")).sendKeys(name);
	  String email="jannu@gmail.com";
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
	  String review="it is bood product";
	  driver.findElement(By.xpath("//textarea[@name='review']")).sendKeys(review);
	  driver.findElement(By.xpath("//button[@id='button-review']")).click();
	  WebElement we3=driver.findElement(By.xpath("//button[@id='button-review']"));
	  if(we3.isDisplayed()) {
		  System.out.println("user will get the message like Thank you for submitting the review");
	  }
	  else {
		  System.out.println("user will not get the message like Thank you for submitting the review");

	  }
	  driver.quit();


	  
  }
}
