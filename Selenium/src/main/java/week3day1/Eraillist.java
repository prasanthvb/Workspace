package week3day1;

import java.util.ArrayList;
//import java.util.HashSet;
import java.util.List;
//import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eraillist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\TestLeaf\\chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://erail.in/trains-between-stations/mgr-chennai-ctr-MAS/ksr-bengaluru-SBC");
		
		List<WebElement> trainnames = new ArrayList<WebElement>();
		trainnames=driver.findElements(By.xpath("//*[@id=\'divTrainsList\']/table[1]/tbody/tr"));
		
		int count= trainnames.size();
				System.out.println("Size:" + count);
				
				for(int i=1;i<=count;i++) {
				try {
					
					WebElement Names=driver.findElement(By.xpath("//*[@id=\'divTrainsList\']/table[1]/tbody/tr["+i+"]/td[2]/a"));
					System.out.println(Names.getText());
				}catch(Exception e) {
					continue;
				}
				
				//List<WebElement> trainnumber = new HashSet<String>();
				//trainnumber= driver.findElements(By.xpath("//*[@id=\'divTrainsList\']/table[1]/tbody/tr"));
				
					}
				
				
				
	}

}
