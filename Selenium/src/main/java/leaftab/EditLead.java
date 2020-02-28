package leaftab;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.testng.annotations.Test;


public class EditLead extends ProjectspecificMethods {
//@Test
	public void Class2() {
		
		
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("R");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		try {
		    WebElement toplead = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr/td/div/a"));
		    toplead.click();
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
		    WebElement toplead = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr/td/div/a"));
		    toplead.click();
		}
		
		
		
		//driver.findElementByXPath("//table[@class='x-grid3-row-table']/tbody/tr/td/div").click();
		String viewlead = driver.getTitle();
		System.out.println(viewlead);
		
		driver.findElementByXPath("//a[text()='Edit']").click();
		WebElement compname = driver.findElement(By.id("updateLeadForm_companyName"));
		compname.clear();
		compname.sendKeys("Leafstab");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		String compchange = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		System.out.println(compchange);
		
		driver.close();
		
	}

}
