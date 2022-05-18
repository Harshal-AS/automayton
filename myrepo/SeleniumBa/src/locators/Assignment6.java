package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Assignment6 {

	public static void main(String[] driver1) {
		String driver4=".//executables//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver4);
		WebDriver cdriver=new ChromeDriver();
		cdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		cdriver.get("https://demo.vtiger.com/vtigercrm/index.php");
		String actualtitle=cdriver.getTitle();
		String expectedtitle="vtiger";
		System.out.println("actualtitle: "+actualtitle);
		System.out.println(" expectedtitle: "+ expectedtitle);
		if(actualtitle.contains(expectedtitle)){
			System.out.println("url pass");
		}
		else {
			System.out.println("url failed");
		}
		cdriver.findElement(By.className("buttonBlue")).click();
		WebElement b=cdriver.findElement(By.id("username"));
		b.sendKeys("admin");
		
		WebElement c=cdriver.findElement(By.id("password"));
		c.sendKeys("Test@123");
		//WebElement loginutton=cdriver.findElement(By.className("buttonBlue"));
		//loginutton.click();
		WebElement logoutButton=cdriver.findElement(By.linkText("logout"));
		
		
		WebDriverWait wait = new WebDriverWait(cdriver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(logoutButton));
	String actualtitle1=cdriver.getTitle();
	String expectedtitle1="vtiger";
	System.out.println("actualtitle: "+actualtitle1);
		System.out.println(" expectedtitle: "+ expectedtitle1);
//		if(actualtitle.contains(expectedtitle)){
//			System.out.println("url pass");
//		}
//		else {
//			System.out.println("url failed");
//		}
//
//		
	}

}
