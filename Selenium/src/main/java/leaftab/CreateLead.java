package leaftab;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends ProjectspecificMethods{
	
	@DataProvider(name="fetchdata1")
	public Object[][] datasetup1() throws IOException{
		return ReadExcel.readdata();
		
		
		/*String [][] data1= new String[1][3];
		data1[0][0]="Virtusa";
		data1[0][1]="Rock";
		data1[0][2]="Star";
	
		return data1;*/	
		
	}
	
	@Test(dataProvider="fetchdata1")
	public  void class1(String value1,String value2,String value3) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "D:\\TestLeaf\\chromedriver_win32/chromedriver.exe");
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(value1);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(value2);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(value3);
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Selma");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Special");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Tester");
		WebElement dataSourceId = driver.findElement(By.id("createLeadForm_dataSourceId"));
		new Select(dataSourceId).selectByVisibleText("Website");
		
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Leader");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("450000");
		
		WebElement industryEnumId = driver.findElement(By.id("createLeadForm_industryEnumId"));
		new Select(industryEnumId).selectByVisibleText("Health Care");
		WebElement ownershipEnumId = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		new Select(ownershipEnumId).selectByValue("OWN_CCORP");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("258369");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Lead Creation");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Completed");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("456");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("789");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Mech");
		WebElement currencyUomId = driver.findElement(By.id("createLeadForm_currencyUomId"));
		new Select(currencyUomId).selectByValue("INR");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("50");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Symbol");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Prasa");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://facebook.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("James");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("ABC");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("DEF");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		WebElement State = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		new Select(State).selectByVisibleText("California");
		
		WebElement generalCountryGeoId = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		new Select(generalCountryGeoId).selectByVisibleText("India");
		
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("603103");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("301");
		
		WebElement marketingCampaignId = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		new Select(marketingCampaignId).selectByVisibleText("Automobile");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9852145255");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("leaf@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String Firstname = driver.findElementByXPath("//div[@class='fieldgroup']/div[2]/table/tbody/tr[2]/td[2]/span").getText();
		System.out.println(Firstname);
		
		
	}

}
