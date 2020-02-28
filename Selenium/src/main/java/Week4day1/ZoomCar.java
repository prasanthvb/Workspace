package Week4day1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ZoomCar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\TestLeaf\\chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(options);
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.zoomcar.com/chennai");
		
		driver.findElement(By.className("search")).click();
		driver.findElement(By.xpath("//div[text()='Popular Pick-up points']/following-sibling::div[1]")).click();
		driver.findElement(By.className("proceed")).click();
		driver.findElementByXPath("//div[@class='days']/div[3]").click();
		driver.findElement(By.className("proceed")).click();
		
		driver.findElement(By.xpath("//button[text()='Done']")).click();
		Thread.sleep(10000);
		//String str = driver.findElement(By.xpath("(//div[@class='car-amount']//div)[1]")).getText();
		List<WebElement> price = new ArrayList <WebElement>(driver.findElementsByXPath("(//div[@class='price'])"));

		for(WebElement carprice:price) {

			String text= carprice.getText();
			String onlyprice = text.replaceAll("₹ ","");
			System.out.println(onlyprice);
			
			//List<String> pricevalue= new ArrayList<String>(carprice.getText());
		}

	}

}
