package keyboardoperation;

//import java.awt.Dimension;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		//pop off
		Thread.sleep(200);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		//driver.navigate().back();
		
	List<WebElement> a=	driver.findElements(By.cssSelector("div._37M3Pb>div>a"));
		System.out.println("count main top mainu"+a.size());
		
		//for(WebElement as:a) {
			//System.out.println(as.getText());
		//}
		for(int i=0;i<a.size();i++) {
			Thread.sleep(200);
			System.out.println(a.get(i).getText());
		}
			//mousehover
			Actions t=new Actions(driver);
			for(int i=0;i<a.size();i++) {
				WebElement harsh=a.get(i);
                 t.moveToElement(harsh).perform();
                // mouseHoverWithCords(t, a.get(1));
                 //driver.close();
		}
		
	}

	
	}
//mouseHover(act, mainMenu);


	//	mouseHoverWithCords(act, mainMenu.get(1));
		
		//rightClick(act, mainMenu.get(1));

//driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);