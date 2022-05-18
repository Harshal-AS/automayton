package calender;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//import utilities.SeleniumUtility;

import org.openqa.selenium.By;
//import org.openqa.selenium.Point;
public class Cssattributevalidation {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver s1=new ChromeDriver();
		//SeleniumUtility s1=new SeleniumUtility();
		//WebDriver driver=s1.setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		s1.get("https://demo.vtiger.com/vtigercrm/index.php");
		WebElement signInButton=s1.findElement(By.cssSelector("button[type='submit']"));
		String fontSize=signInButton.getCssValue("font-size");
		String fontColor=signInButton.getCssValue("color");
		String fontBackgroundColor=signInButton.getCssValue("background-image");//RGBA format color code
		
		System.out.println("Font Size: "+fontSize);
		System.out.println("Font color: "+fontColor);
		System.out.println("Font Background Color: "+fontBackgroundColor);
		
		
		String forgotPasswordLinkColor=s1.findElement(By.cssSelector(".forgotPasswordLink")).getCssValue("color");
		System.out.println("forgotPasswordLink color: "+forgotPasswordLinkColor);//RGBA format color code
	}
}