package leaftab;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeleteLead extends ProjectspecificMethods{
	@Test
	public void main() throws InterruptedException {
		
		

		
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElement(By.name("phoneNumber")).sendKeys("9");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		
//		try {
//		    WebElement toplead = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr/td/div/a"));
//		    String leadid = toplead.getText();
//		    System.out.println(leadid);
//		    toplead.click();
//		}
//		catch(org.openqa.selenium.StaleElementReferenceException ex)
//		{
		    WebElement toplead = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr/td/div/a"));
		    String leadid = toplead.getText();
		    System.out.println(leadid);
		    toplead.click();
		    
		    driver.findElement(By.linkText("Delete")).click();
		    
		    Thread.sleep(3000);
		    driver.findElement(By.linkText("Find Leads")).click();
			driver.findElement(By.name("id")).sendKeys(leadid);
			String noRecordsTo = driver.findElement(By.className("x-paging-info")).getText();
			System.out.println(noRecordsTo);
			driver.close();
		    
		}
		
		

		
	}


