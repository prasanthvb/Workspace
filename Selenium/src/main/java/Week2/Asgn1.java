package Week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asgn1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement eleusername= driver.findElement(By.id("username"));
		eleusername.sendKeys("DemosalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		//Thread.sleep(3000L);
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		
		
		//To Click Leads tab
		WebElement leadstab = driver.findElementByXPath("//a[text()='Leads']");
		leadstab.click();
		// To Click Merge leads Tab
		WebElement mergeLeads = driver.findElementByXPath("//a[text()='Merge Leads']");
		mergeLeads.click();
		
		//To Find the Merge Leads Icon
		driver.findElementByXPath("(//div[@class='subSectionBlock'])//table/tbody/tr/td[2]/a");
		
		//navigate to Leads tab
		leadstab.click();
		
		// Find Leads
		
		WebElement findLeads = driver.findElementByXPath("//a[text()='Find Leads']");
		findLeads.click();
		
		
		
		
		
		

		
		
	
				
				
	}

}
