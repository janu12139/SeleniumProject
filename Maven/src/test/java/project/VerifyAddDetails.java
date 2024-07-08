package project;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class VerifyAddDetails extends BaseTest {
  @Test
  public void AddressDetails() throws InterruptedException, IOException {
      WebElement LA1=driver.findElement(By.xpath("//i[@class='fa fa-home']/parent::a"));
      if(LA1.isDisplayed()) {
    	  System.out.println("User have seen to the HomePage");
      }
      else {
    	  System.out.println("User have not seen to homepage");
      }
      driver.findElement(By.xpath("//i[@class='fa fa-lock']/parent::a")).click();
      driver.findElement(By.xpath("//input[@name='name']")).sendKeys("megha");
      driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("megha.B@gmail.com");
      driver.findElement(By.xpath("(//button[@class='btn btn-default'])[2]")).click();
      
		FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\Desktop\\Book1.xlsx");
		XSSFWorkbook  wb= new XSSFWorkbook(fis);

		XSSFSheet sheet=wb.getSheet("Sheet1");

		for(int i=1;i<=sheet.getLastRowNum();i++) {

			String PW=sheet.getRow(i).getCell(0).getStringCellValue();

			String FN=sheet.getRow(i).getCell(1).getStringCellValue();

			String LN=sheet.getRow(i).getCell(2).getStringCellValue();

			String Add=sheet.getRow(i).getCell(3).getStringCellValue();

			String State=sheet.getRow(i).getCell(4).getStringCellValue();

			String City=sheet.getRow(i).getCell(5).getStringCellValue();

			int ZC=(int) sheet.getRow(i).getCell(6).getNumericCellValue();

			String ZCS = String.valueOf(ZC);

			int PN=(int) sheet.getRow(i).getCell(7).getNumericCellValue();

			String PNS = String.valueOf(PN);

       driver.findElement(By.xpath("//input[@id='password']")).sendKeys(PW);

			Thread.sleep(1000);

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

        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(FN);

			driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys(LN);

			driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(Add);

			driver.findElement(By.xpath("//input[@id='state']")).sendKeys(State);

			driver.findElement(By.xpath("//input[@id='city']")).sendKeys(City);

			driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys(ZCS);

			driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys(PNS);

			Thread.sleep(1000);

			driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
			WebElement  Text=driver.findElement(By.xpath("//p[text()='Congratulations! Your new account has been successfully created!']"));
			System.out.println(Text.getText());
			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			WebElement we=driver.findElement(By.xpath("//i[@class='fa fa-user']/parent::a"));
			if(we.isDisplayed()) {
				System.out.println("Top in page Loged with user name");
			}
			else {
				System.out.println("Top in page is not Loged with user name");

			}
			driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[19]")).click();
			driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
			driver.findElement(By.xpath("(//i[@class='fa fa-shopping-cart']/parent::a)[1]")).click();
			WebElement we2=driver.findElement(By.xpath("//section[@id='cart_items']"));
			if(we2.isDisplayed()) {
				System.out.println("cart page is displayed");
			}
			else {
				System.out.println("cart page is not displayed");

			}
			driver.findElement(By.xpath("//a[text()='Proceed To Checkout']")).click();
			Thread.sleep(1000);
			WebElement add=driver.findElement(By.xpath("//section[@id='cart_items']/div/div[3]"));
			String s=add.getText();
			System.out.println(s);
			driver.quit();
			
			

  }
  }
}
