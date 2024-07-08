package project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RecomendedItems extends BaseTest {
  @Test
  public void ATRI() throws InterruptedException {
	 WebElement we=driver.findElement(By.xpath("//div[@id='recommended-item-carousel']"));
	 if(we.isDisplayed()) {
		 System.out.println("Recomended items are visibile to the customers");
	 }
	 else {
		 System.out.println("Recomended items are not visibile to the customers");

	 }
     //Scroll down
     JavascriptExecutor jse=(JavascriptExecutor)driver;
    jse.executeScript("window.scroll(0, 350)");
    Thread.sleep(1000);
	 driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[70]")).click();
	 driver.findElement(By.xpath("//u[text()='View Cart']")).click();
	 WebElement we1=driver.findElement(By.xpath("//tr[@id='product-2']"));
	 if(we1.isDisplayed()) {
		 System.out.println("Recomended product is displayedn add to cart");
	 }
	 else {
		 System.out.println("Recomended product is not displayedn add to cart");

	 }
	 driver.quit();
  }
}
