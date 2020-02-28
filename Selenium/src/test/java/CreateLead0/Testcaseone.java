package CreateLead0;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Testcaseone {
	public ChromeDriver driver;
	@Given("open the chrome browser")
	public void openchromebrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\TestLeaf\\chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		
		
	}
	@Given("maxmimize the browser")
	public void maxmimizeTheBrowser() {
	    driver.manage().window().maximize();	}

	@Given("get the url")
	public void getTheUrl() {
	    driver.get("http://leaftaps.com/opentaps/control/main");
	}

	@Given("enter username (.*) in login page")
	public void enterUsernameDemosalesmanagerInLoginPage(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}

	@Given("enter password (.*) in login page")
	public void enterPasswordCrmsfrInLoginPage(String password) {
		driver.findElementById("password").sendKeys(password);
	}

	@When("click on Login button")
	public void clickOnLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Then("user navigates to home page")
	public void userNavigatesToHomePage() {
	    System.out.println("User is in Home Page");
	    driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@Given("click on create leads")
	public void clickOnCreateLeads() {
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@Given("Enter (.*) in first name")
	public void enterVbInFirstName(String FN) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(FN);
	    
	}

	@Given("Enter (.*) in second name")
	public void enterSindhuInSecondName(String LN) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(LN);
	}

	@Given("Entetr (.*) in company name")
	public void entetrAmazoneInCompanyName(String comp) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(comp);
	    
	}

	@When("click on save button")
	public void clickOnSaveButton() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("say user saved")
	public void sayUserSaved() {
	    System.out.println("User is saved");
	}
}
