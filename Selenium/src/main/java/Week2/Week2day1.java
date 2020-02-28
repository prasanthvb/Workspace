package Week2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Week2day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		//C:\\Users\\Vb Prasanth\\Selenium\\drivers\\Chromedriver\\chromedriver.exe
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement eleusername= driver.findElement(By.id("username"));
		eleusername.sendKeys("DemosalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		//Thread.sleep(3000L);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElementByXPath("//*[@id=\"createLeadForm_companyName\"]").sendKeys("Cognizant");		
		driver.findElementByXPath("//*[@id=\"createLeadForm_firstName\"]").sendKeys("Prasanth");
		driver.findElementByXPath("//*[@id=\"createLeadForm_lastName\"]").sendKeys("VB");
		
		WebElement ele = driver.findElementById("createLeadForm_dataSourceId");
		Select source = new Select(ele);
		source.selectByValue("LEAD_PR");
		
		WebElement elect = driver.findElementById("createLeadForm_marketingCampaignId");

		List<WebElement> options =elect.findElements(By.tagName("option"));
		System.out.println(options.get(options.size() - 2).getText());
		 
		Actions act =new Actions((WebDriver) options.get(options.size()-2));
		act.click().perform();
	
	
		
		//driver.close();
	}

}
