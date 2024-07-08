package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ViewCategoryPro extends BaseTest{
  @Test
  public void ViewCategory() {
	  WebElement we=driver.findElement(By.xpath("//h2[text()='Category']"));
	  if(we.isDisplayed()) {
		  System.out.println("User will seen the categories are visible in leftside ");
	  }
	  else{
		  System.out.println("User will not seen the categories are visible in leftside ");

	  }
	  driver.findElement(By.xpath("(//i[@class='fa fa-plus'])[1]")).click();
	  driver.findElement(By.xpath("(//a[text()='Dress '])[1]")).click();
	  WebElement we1=driver.findElement(By.xpath("//div[@class='features_items']"));
	  if(we1.isDisplayed()) {
		  System.out.println("women category page is displayed");
	  }
	  else {
		  System.out.println("women category page is not displayed");

	  }
	  driver.findElement(By.xpath("(//i[@class='fa fa-plus'])[2]")).click();
	  driver.findElement(By.xpath("//a[text()='Tshirts ']")).click();
	  WebElement we2=driver.findElement(By.xpath("//h2[@class='title text-center']"));
	  if(we2.isDisplayed()) {
		  System.out.println("Mens category page is displayed");
	  }
	  else {
		  System.out.println("Mens category page is not displayed");

	  }
	  driver.quit();
	  

	  
  }
}

