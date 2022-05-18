package mouseoperation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouseoperatons {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get("https://www.globalsqa.com/demo-site/");
        List<WebElement> mainMenu=driver.findElements(By.xpath("//div[@id='menu']/ul/li/a"));
		System.out.println("Main Menu option count: "+mainMenu.size());
		Actions a=new Actions(driver);
		
		for(int i=0;i<mainMenu.size();i++) {
			WebElement option=mainMenu.get(i);
			a.moveToElement(option).perform();
			Thread.sleep(1000);
		}
	}

}
////li[@id='menu-item-1513']////li[@id='menu-item-2822']////li[@id='menu-item-1513']/a