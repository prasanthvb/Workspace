package Week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentday1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement eleusername= driver.findElement(By.id("username"));
		eleusername.sendKeys("DemosalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		
		//Find Leads
		driver.findElementByXPath("//span[text()='Phone']").click();	
		  driver.findElementByXPath("//*[@id=\"ext-gen270\"]").sendKeys("1234");

	    driver.findElementByXPath("//button[text()='Find Leads']").click();
      Thread.sleep(5000);
      driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
      driver.findElementByLinkText("Delete").click();
		
		
	}

}
