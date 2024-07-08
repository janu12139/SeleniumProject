package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LogoutUser extends BaseTest {
  @Test
  public void Logout() {
	  
      driver.findElement(By.xpath("//i[@class='fa fa-lock']/parent::a")).click();
      WebElement LA=driver.findElement(By.xpath("//h2[text()='Login to your account']"));
      if(LA.isDisplayed()) {
    	  System.out.println("User is visible to the Login to your account");
      }
      else {
    	  System.out.println("Login to your Account not is visibiled");

      }
	  driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("janu5@gmail.com");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Janu5@123");
	  driver.findElement(By.xpath("//button[text()='Login']")).click();
		WebElement we3=driver.findElement(By.xpath("//i[@class='fa fa-user']/parent::a"));

		String Lusername=we3.getText();

		if(we3.isDisplayed()) {

			System.out.println("It is successfully Visible as loged with username:" +Lusername);

		}

		else {

			System.out.println("It is not successfully visible as loged with username:" +Lusername);

		}
		driver.findElement(By.xpath("//i[@class='fa fa-lock']/parent::a")).click();
	      WebElement LA1=driver.findElement(By.xpath("//h2[text()='Login to your account']"));
	      if(LA1.isDisplayed()) {
	    	  System.out.println("User have visible to the HomePage");
	      }
	      else {
	    	  System.out.println("User have not visible to homepage");

	      }
	      driver.quit();
	      






  }
}
