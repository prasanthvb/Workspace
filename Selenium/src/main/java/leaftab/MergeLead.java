package leaftab;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MergeLead extends ProjectspecificMethods{
	
	@DataProvider(name="fetchdata")
	public Object[][] datasetup(){
		
		String [][] data= new String[1][2];
		data[0][0]="1021";
		data[0][1]="1022";
	
		return data;	
		
	}
	@Test(dataProvider="fetchdata",dependsOnMethods= {"leaftab.CreateLead.class1"})
	public void mergeLead(String value1,String value2) throws InterruptedException {
		

		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElement(By.linkText("Merge Leads")).click();
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		
		Set<String> allwin = driver.getWindowHandles();
		List<String> eachwin= new ArrayList<String>(allwin);
		driver.switchTo().window(eachwin.get(1));
		
		driver.findElement(By.name("id")).sendKeys(value1);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr/td/div/a")).click();
		
		driver.switchTo().window(eachwin.get(0));
		
		
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> allwin2 = driver.getWindowHandles();
		List<String> eachwin2= new ArrayList<String>(allwin2);
		driver.switchTo().window(eachwin2.get(1));
		
		
		
		Thread.sleep(2000);
		driver.findElement(By.name("id")).sendKeys(value2);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr/td/div/a")).click();
		driver.switchTo().window(eachwin2.get(0));
		
		Thread.sleep(2000);
		driver.findElementByXPath("//a[text()='Merge']").click();
		
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.name("id")).sendKeys(value1);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String noRecordsTo = driver.findElement(By.className("x-paging-info")).getText();
		System.out.println(noRecordsTo);
		
	}

}
