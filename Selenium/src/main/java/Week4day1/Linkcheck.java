package Week4day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcheck {
	public static ChromeDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\TestLeaf\\chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testleaf.herokuapp.com/pages/Link.html");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Approach1
		List<WebElement> alllinks = driver.findElementsByTagName("a");
		for (int i = 0; i < alllinks.size(); i++) {

			alllinks.get(i).click();
			if (driver.getTitle().contains("404")) {

				System.out.println("linkbroken");
				driver.navigate().back();
				alllinks = driver.findElementsByTagName("a");
			} else
				driver.navigate().back();
			alllinks = driver.findElementsByTagName("a");
			{

			}

		}
		driver.close();
	}
}
