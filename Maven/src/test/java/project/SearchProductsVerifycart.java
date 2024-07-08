package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchProductsVerifycart extends BaseTest {
	  @Test(dataProvider="dataprovider")
  public void searchprod(String Email,String PW) throws InterruptedException {
	  driver.findElement(By.xpath("//i[@class='material-icons card_travel']")).click();
	  WebElement we=driver.findElement(By.xpath("//h2[text()='All Products']"));
	  if(we.isDisplayed()) {
		  System.out.println("user will get the all products page");
	  }
	  else {
		  System.out.println("user will not get the all products page");

	  }
	  driver.findElement(By.xpath("//input[@id='search_product']")).sendKeys("tshirts");
	  driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
	  WebElement we1=driver.findElement(By.xpath("//div[@class='features_items']"));
	  if(we1.isDisplayed()) {
		  System.out.println("searched products are visible to the customers");
	  }
	  else {
		  System.out.println("searched products are not visible to the customers");

	  }
	  driver.findElement(By.xpath("//a[@class='btn btn-default add-to-cart']")).click();
	  driver.findElement(By.xpath("//button[@class='btn btn-success close-modal btn-block']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[3]")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//button[@class='btn btn-success close-modal btn-block']")).click();
	  driver.findElement(By.xpath("//i[@class='fa fa-shopping-cart']/parent::a")).click();
	  WebElement we2=driver.findElement(By.xpath("//table[@class='table table-condensed']"));
	  if(we2.isDisplayed()) {
		  System.out.println("products are displayed in cart");
	  }
	  else {
		  System.out.println("products are not displayed in cart");

	  }
	  driver.findElement(By.xpath("//i[@class='fa fa-lock']/parent::a")).click();
	  driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys(Email);
		 driver.findElement(By.xpath("(//input[@name='password'])[1]")).sendKeys(PW);
		 driver.findElement(By.xpath("(//button[@class='btn btn-default'])[1]")).click();
		 driver.findElement(By.xpath("//i[@class='fa fa-shopping-cart']/parent::a")).click();
		 WebElement we3=driver.findElement(By.xpath("//table[@class='table table-condensed']"));
		 if(we3.isDisplayed()) {
			 System.out.println("All products are visible to the cart in after login as well");
		 }
		 else {
			 System.out.println("All products are not visible to the cart in after login as well");

		 }
		 driver.quit();
	  }
	  @DataProvider(name="dataprovider")
	  public Object[][] logindata() {
		  Object[][] data= new Object[][]{
			  {"jahnavvivakkapatla@gmail.com","Myblood@97"},

		  
		  };
		return data;
	  }
}


	  
	  
	  
  

