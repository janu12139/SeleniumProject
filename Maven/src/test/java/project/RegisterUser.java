package project;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterUser extends BaseTest{
	//WebDriver driver;
	
	@Test(dataProvider="data")
	public void Register(String name,String Email) throws InterruptedException, IOException {

		// WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(6));
       driver.findElement(By.xpath("//i[@class='fa fa-lock']//parent::a")).click();

		WebElement we=driver.findElement(By.xpath("//h2[text()='New User Signup!']"));

		if(we.isDisplayed()) {

			System.out.println("New User SignUp Button is displayed");

		}

		else {

			System.out.println("New User SignUp Button is not displayed");

		}

		driver.findElement(By.xpath("//input[@name='name']")).sendKeys(name);

		driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys(Email);

		driver.findElement(By.xpath("(//button[@class='btn btn-default'])[2]")).click();

		WebElement we1=driver.findElement(By.xpath("//b[text()='Enter Account Information']"));

		if(we1.isDisplayed()) {

			System.out.println("Enter account information is displayed");

		}

		else {

			System.out.println("Enter account information is not displayed");

		}

		driver.findElement(By.xpath("//input[@id='id_gender2']")).click();


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


			WebElement Ac=driver.findElement(By.xpath("//b[text()='Account Created!']"));

			if(Ac.isDisplayed()) {

				System.out.println("Account is created");

			}

			else {

				System.out.println("Account is nots created");

			}

			driver.findElement(By.xpath("//a[text()='Continue']")).click();

			Thread.sleep(1000);


			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fafa-user']/parent::a")));


			WebElement we3=driver.findElement(By.xpath("//i[@class='fa fa-user']/parent::a"));

			String Lusername=we3.getText();

			if(we3.isDisplayed()) {

				System.out.println("It is successfully Visible as loged with username:" +Lusername);

			}

			else {

				System.out.println("It is not successfully visible as loged with username:" +Lusername);

			}

			Thread.sleep(1000);

			driver.findElement(By.xpath("//i[@class='fa fa-trash-o']/parent::a")).click();

			String PD=driver.findElement(By.xpath("//p[text()='Your account has been permanently deleted!']")).getText();

			System.out.println(PD);

			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();

           // driver.quit();
			
		}
        driver.quit();

	}
@DataProvider(name="data")

	public Object[][] data() {

		Object[][] obj=new Object[1][2];

		obj[0][0] = "jaanu";

		obj[0][1] = "jaanvii.B@gmail.com";

      return obj;
	}
}


	


















