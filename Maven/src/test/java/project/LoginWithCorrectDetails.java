package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginWithCorrectDetails extends BaseTest {
	
  @Test(dataProvider="dataprovider")
  public void Login(String Email,String PW) throws InterruptedException  {
      driver.findElement(By.xpath("//i[@class='fa fa-lock']/parent::a")).click();
      WebElement LA=driver.findElement(By.xpath("//h2[text()='Login to your account']"));
      if(LA.isDisplayed()) {
    	  System.out.println("User is visible to the Login to your account");
      }
      else {
    	  System.out.println("Login to your Account not is visibiled");

      }
	 driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys(Email);
	 driver.findElement(By.xpath("(//input[@name='password'])[1]")).sendKeys(PW);
	 driver.findElement(By.xpath("(//button[@class='btn btn-default'])[1]")).click();


	 
	  driver.findElement(By.xpath("//i[@class='fa fa-trash-o']/parent::a")).click();
//	 WebElement AD=driver.findElement(By.xpath("//b[text()='Account Deleted!']"));
//    if(AD.isDisplayed()) {
//    	System.out.println("User is seen the Acount deleted option");
//    }
//    else {
//    	System.out.println("User is not seen the Acount deleted option");
//
//    }
    driver.quit();
  }


  @DataProvider(name="dataprovider")
  public Object[][] logindata() {
	  Object[][] data= new Object[][]{
		  {"jahnaviivakkapatla@gmail.com","Myblood@97"},

	  
	  };
	return data;
  }
  }
