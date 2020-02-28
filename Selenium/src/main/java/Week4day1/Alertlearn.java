package Week4day1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Alertlearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\TestLeaf\\chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
		
		driver.findElementByXPath("//button[text()='Try it']").click();
		Alert newalert = driver.switchTo().alert();
	
		
		newalert.sendKeys("Prasanthvbcvbnm");
		newalert.accept();
//		driver.switchTo().defaultContent();
//		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='iframewrapper']/iframe)")));
		String trytext = driver.findElementById("demo").getText();
		if (trytext.contains("Prasanthvb")) {
		System.out.println(trytext);							
		}
		
		}
}
