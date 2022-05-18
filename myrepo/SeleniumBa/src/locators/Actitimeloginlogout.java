package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimeloginlogout {

	public static void main(String[] args) {
		String driver2 = System.getProperty("user.dir") + "//executables//chromedriver.exe";
		// set driver executable path by using system.setproperty(string key,string
		// value)
		System.setProperty("webdriver.chrome.driver", driver2);
		// instance of the required class
		WebDriver driver = new ChromeDriver();
		//implicit wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				// 2.open https://demo.actitime.com/
				driver.get("https://demo.actitime.com/");
				// 3.get page title name & title length
				String actualtitle = driver.getTitle();
				String expectedtitle = "actitime login page";
				System.out.println("actual title: " + actualtitle);
				System.out.println("expected title: " + expectedtitle);
				// 3.get page title name & title length
				System.out.println("title & length: " + actualtitle.length());

				// 5.get page url &verify if it is a correct page opened
				String actualurl = driver.getCurrentUrl();
				String expectedurl = "https://demo.actitime.com/";
				System.out.println("actual url: " + actualurl);
				System.out.println("expected url: " + expectedurl);

				if (actualurl.contains(expectedurl)) {
					System.out.println("url pass");
				} else {
					System.out.println("url fail");
				}
				// 6.enter the valid username & password
				WebElement findinputelement= driver.findElement(By.id("username"));
				
				findinputelement.sendKeys("admin");// write the text
				findinputelement.clear();// clear means delete
				findinputelement.sendKeys("trainee");// any region wrong username so change

			WebElement findpassword=driver.findElement(By.name("pwd"));
				findpassword.sendKeys("manager");
				findpassword.clear();
				findpassword.sendKeys("trainee");

				// 7.click on login button
				WebElement loginButton = driver.findElement(By.id("loginButton"));
				loginButton.click();
				driver.findElement(By.linkText("Logout")).click(); //0-30
				//driver.findElement(By.id("logoutLink")).click();
				String actualtitle1 = driver.getTitle();
				System.out.println("title name after login page:" + actualtitle1);
				

				
				// 10.close the browser
				//driver.close();
	}

}
