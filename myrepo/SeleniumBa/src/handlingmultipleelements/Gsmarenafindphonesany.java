package handlingmultipleelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gsmarenafindphonesany {

	public static void main(String[] args) {
		//relative path
				//String driver1=".//executables//chromedriver.exe";
				//system path
				String driver2=System.getProperty("user.dir")+".//executables//chromedriver.exe";
				//set driver executalbes path in System.set(String key,value);
				System.setProperty("webdriver.chrome.driver", driver2);
			    // instance of required application
				WebDriver harshal=new ChromeDriver();
				//implicit wait
				harshal.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				//browser operation maximize
				harshal.manage().window().maximize();
				//launch the url
				harshal.get("https://www.gsmarena.com");
				System.out.println("title: "+harshal.getTitle());
				System.out.println("current url: "+harshal.getCurrentUrl());
				// harshal.findElement(by.)
			List <WebElement> phones=harshal.findElements(By.cssSelector("div#social-connect>a>i"));
		    System.out.println("count phones mainu :"+phones.size());	
			for(WebElement as:phones) {
				System.out.println(as.getText());
				
			}
		//	harshal.close();
	}}

//div#social-connect>a>i
