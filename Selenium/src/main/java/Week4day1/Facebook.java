package Week4day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\TestLeaf\\chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//input[@class='inputtext'])[1]")).sendKeys("prasanthvb");
		driver.findElement(By.xpath("(//input[@class='inputtext'])[2]")).sendKeys("prasanthvb");
		driver.findElement(By.xpath("//label[@class='uiButton uiButtonConfirm']")).click();
		Thread.sleep(10000);

		// driver.switchTo().alert().dismiss();

		driver.findElement(By.xpath("(//input[@placeholder='Search'])[1]")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//button[@type='submit']//i)[1]")).click();
		String Testlf = driver.findElement(By.xpath("//div[contains(@id,'xt_uniq')]/div/div/div/div/div/div/div/div/a"))
				.getText();

		System.out.println(Testlf);
		if (Testlf.contains("TestLeaf")) {
			String Liketext = driver.findElement(By.xpath("(//button[contains(@class,'')]//i)[2]")).getText();
			System.out.println(Liketext);
			if (Liketext == "Like") {
				System.out.println("Yet to Like TestLeaf");
				driver.findElement(By.xpath("(//button[contains(@class,'')]//i)[2]")).click();

			} else
				;
			System.out.println("TestLeaf is Liked");
		}

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@id,'xt_uniq')]/div/div/div/div/div/div/div/div/a")).click();
		String likevalue = driver.findElement(By.xpath(
				"//div[@id='PagesProfileHomeSecondaryColumnPagelet']/div/div[2]/div/div[2]/div[3]/div/div[2]/div"))
				.getText();

		System.out.println(likevalue);

		driver.close();
	}
}
