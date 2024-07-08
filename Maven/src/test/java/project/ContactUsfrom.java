package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ContactUsfrom extends BaseTest {
	
  @Test(dataProvider="data")
  public void Contactus(String name,String Email,String sub,String msg) throws InterruptedException {
      driver.findElement(By.xpath("//i[@class='fa fa-envelope']/parent::a")).click();
      WebElement we=driver.findElement(By.xpath("(//h2[@class='title text-center'])[2]"));
      if(we.isDisplayed()) {
    	  System.out.println("User will seen the GET IN TUCH OPTION");
      }
      else {
    	  System.out.println("User will not seen the GET IN TUCH OPTION");

      }
      driver.findElement(By.xpath("//input[@name='name']")).sendKeys(name);
      driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Email);
      Thread.sleep(2000);
      driver.findElement(By.xpath("//input[@name='subject']")).sendKeys(sub);
      driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(msg);
      Thread.sleep(1000);
      //upload file
      WebElement UploadFile=driver.findElement(By.xpath("//input[@name='upload_file']"));
      UploadFile.sendKeys("C:\\Users\\DELL\\Desktop\\Screenshot (55).png");
      Thread.sleep(1000);
      driver.findElement(By.xpath("//input[@name='submit']")).click();
      driver.switchTo().alert().accept();
      WebElement msg1=driver.findElement(By.xpath("//div[@class='status alert alert-success']"));
      if(msg1.isDisplayed()) {
    	  System.out.println("Success! Your details have been submitted successfully");
    	  		
      }
      else {
    	  System.out.println("Not Success! Your details have not been submitted successfully");

    	  
      }
      driver.findElement(By.xpath("//a[@class='btn btn-success']")).click();
      driver.quit();

}
  @DataProvider(name="data")

	public Object[][] data() {

		Object[][] obj=new Object[2][4];
        obj[0][0] = "jaanu";
        obj[0][1] = "jaanvim@gmail.com";
        
		obj[0][2]="Shopping";
		obj[0][3]="User have an issue";

    return obj;

}
}