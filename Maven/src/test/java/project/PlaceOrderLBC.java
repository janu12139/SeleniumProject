package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PlaceOrderLBC extends BaseTest{
  @Test
  public void LBeforCheckOut() throws InterruptedException {
      WebElement LA1=driver.findElement(By.xpath("//i[@class='fa fa-home']/parent::a"));
      if(LA1.isDisplayed()) {
    	  System.out.println("User have seen to the HomePage");
      }
      else {
    	  System.out.println("User have not seen to homepage");
      }
      driver.findElement(By.xpath("//i[@class='fa fa-lock']/parent::a")).click();
      driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Chotu");
      driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("chotu.B@gmail.com");
      driver.findElement(By.xpath("(//button[@class='btn btn-default'])[2]")).click();
      driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Myblood@97");
		WebElement day=driver.findElement(By.xpath("//select[@id='days']"));

		Select sc=new Select(day);

		sc.selectByIndex(3);

		Thread.sleep(1000);

		WebElement month=driver.findElement(By.xpath("//select[@id='months']"));

		Select sc1=new Select(month);

		sc1.selectByIndex(6);

		Thread.sleep(1000);

		WebElement year=driver.findElement(By.xpath("//select[@id='years']"));

		Select sc2=new Select(year);

		sc2.selectByIndex(8);

		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@id='newsletter']")).click();

		Thread.sleep(1000);

		driver.findElement(By.id("optin")).click();
        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("jahnavi");

			driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("v");

			driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("hyd");

			driver.findElement(By.xpath("//input[@id='state']")).sendKeys("TG");

			driver.findElement(By.xpath("//input[@id='city']")).sendKeys("hyd");

			driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("32456");

			driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("1234567898");

			Thread.sleep(1000);

			driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
			WebElement  Text=driver.findElement(By.xpath("//p[text()='Congratulations! Your new account has been successfully created!']"));
			System.out.println(Text.getText());
			driver.findElement(By.xpath("//a[text()='Continue']")).click();
			driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[11]")).click();
			driver.findElement(By.xpath("//button[@class='btn btn-success close-modal btn-block']")).click();
			driver.findElement(By.xpath("(//i[@class='fa fa-shopping-cart']/parent::a)[1]")).click();
			WebElement cart=driver.findElement(By.xpath("//section[@id='cart_items']"));
			System.out.println(cart.getText());
			driver.findElement(By.xpath("//a[text()='Proceed To Checkout']")).click();
			WebElement we1=driver.findElement(By.xpath("(//div[@class='container'])[2]"));
			if(we1.isDisplayed()){
				System.out.println("User will seen the Address and review details");
			}
			else {
				System.out.println("User will not  seen the Address and review details");

			}
			driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("Order the product");
			driver.findElement(By.xpath("//a[text()='Place Order']")).click();
			driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("sbi");
			driver.findElement(By.xpath("//input[@class='form-control card-number']")).sendKeys("1223455678");
			driver.findElement(By.xpath("//input[@class='form-control card-cvc']")).sendKeys("321");
			driver.findElement(By.xpath("//input[@class='form-control card-expiry-month']")).sendKeys("03");
            driver.findElement(By.xpath("//input[@class='form-control card-expiry-year']")).sendKeys("2025");
            driver.findElement(By.xpath("//button[@id='submit']")).click();
            WebElement mess=driver.findElement(By.xpath("//div[@class='alert-success alert']"));
            System.out.println(mess.getText());
            driver.findElement(By.xpath("//i[@class='fa fa-trash-o']/parent::a")).click();
            WebElement mes=driver.findElement(By.xpath("//p[text()='Your account has been permanently deleted!']"));
            System.out.println(mes.getText());
            driver.findElement(By.xpath("//a[text()='Continue']")).click();
            driver.quit();
            




      

	  
  }
}
