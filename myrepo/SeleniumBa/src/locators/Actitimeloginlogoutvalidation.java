package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitimeloginlogoutvalidation {

	public static void main(String[] args) throws InterruptedException {
		String driver1 = ".//executables//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driver1);
		WebDriver a = new ChromeDriver();
		a.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		a.get("https://demo.actitime.com/login.do");
		String actualtitle = a.getTitle();
		String expectedtitle = "actiTIME - Login";
		System.out.println("actualtitle: " + actualtitle);
		System.out.println("expectedtitle: " + expectedtitle);
		if (actualtitle.equals(expectedtitle)) {
			System.out.println("actual title pass open ");
		} else {
			System.out.println("actual titlefail ");
		}
		WebElement username = a.findElement(By.id("username"));
		username.sendKeys("trainee");
		WebElement password = a.findElement(By.name("pwd"));
		password.sendKeys("trainee");

		WebElement loginButton = a.findElement(By.id("loginButton"));
		loginButton.click();

		//WebElement logoutButton = a.findElement(By.id("logoutLink"));
		// explicit wait
		
//		WebDriverWait wait = new WebDriverWait(a, 20);
//		wait.until(ExpectedConditions.elementToBeClickable(logoutButton));
		Thread.sleep(10000);//means 1 minutes
		String actaulTitle=a.getTitle();//0-30
		System.out.println("Actuatl HomePage title: "+actaulTitle);
		String expectedtitle1="actiTIME - Enter Time-Track";
		if(actualtitle.equals(expectedtitle1)) {
			System.out.println("Login is successfull and home page title is also varified..");
		}else {
			System.out.println("Either Login is failed or home page title is changed");
			//a.findElement(By.id("logoutLink")).click();
		}
	}
}
