package Week2;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class locations {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");
		
		
		//Draggable
		driver.findElementByXPath("//a[text()='Draggable']").click();
		driver.switchTo().frame(0);
		
		WebElement drag = driver.findElementByXPath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']");
		
		Actions builder= new Actions(driver);
		
		builder.clickAndHold(drag).dragAndDropBy(drag, 60, 60).release(drag).perform();
				
		
		
	}

}
