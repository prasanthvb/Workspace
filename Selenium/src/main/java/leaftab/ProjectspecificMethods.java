package leaftab;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class ProjectspecificMethods {
	public ChromeDriver driver;
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void startApp(String url,String uname,String pswd) {
		System.setProperty("webdriver.chrome.driver", "D:\\TestLeaf\\chromedriver76/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElementById("password").sendKeys(pswd);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
}
