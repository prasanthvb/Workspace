package Week2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\TestLeaf\\chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://erail.in/");
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS");
		driver.findElement(By.id("txtStationFrom")).sendKeys(Keys.TAB);
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("CBE");
		driver.findElement(By.id("txtStationTo")).sendKeys(Keys.TAB);
		
		
		List<WebElement> trainnames = new ArrayList<WebElement>();
		trainnames=driver.findElements(By.xpath("//*[@id=\'divTrainsList\']/table[1]/tbody/tr"));
		
		int traincount =trainnames.size();
		System.out.println(traincount);

		for(int i =1;i<=traincount;i++) {
			//String names = trainnames.get(i).getText();
			try {
				WebElement Train = driver.findElement(By.xpath("//*[@id=\'divTrainsList\']/table[1]/tbody/tr["+i+"]/td[2]/a"));
				//System.out.println(names);
		System.out.println(Train.getText());
			}catch(Exception e) {
				continue;
			}
			
			
		}
			
		
		//driver.quit();
	
		}
}
