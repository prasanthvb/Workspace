package leaftab;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Duplicatelead {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TestLeaf\\chromedriver76/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("DemosalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElement(By.name("emailAddress")).sendKeys("leaf@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		
		WebElement toplead = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr/td[3]/div/a"));
	    String leadid = toplead.getText();
	    System.out.println(leadid);
	    toplead.click();
		
	    driver.findElement(By.linkText("Duplicate Lead")).click();
	    String duplicateLead = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
	    System.out.println(duplicateLead);
	    
	    driver.findElement(By.linkText("Create Lead")).click();
	    
	    String createLead = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
	    System.out.println(createLead);
		
	}

}
