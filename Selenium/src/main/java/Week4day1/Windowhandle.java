package Week4day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\TestLeaf\\chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");
		
		String oneid = driver.getWindowHandle();
		System.out.println(oneid);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
		
		driver.findElementByXPath("//button[text()='Try it']").click();
		Set<String> allwin = driver.getWindowHandles();
		List<String> eachwin= new ArrayList<String>(allwin);
		driver.switchTo().window(eachwin.get(0));
		driver.close();
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
		
	}

}
