package Handlingjavascriptswitchalert;
import java.util.Iterator;
import java.util.Set;
//import java.util.Iterator;
//import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//import utilities.SeleniumUtility;

public class HandlingWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		// get current window unique id
		String homePageWinId = driver.getWindowHandle();//T1
		System.out.println("Home page window ID: " + homePageWinId);

		// performing click operation to open Linkedin page in new tab
		WebElement a=driver.findElement(By.cssSelector("i[class='fa fa-linkedin']"));
a.click();//
		// get all windows unique IDs which are opened by selenium current instance
		Set<String> allWinIds = driver.getWindowHandles();
		System.out.println("All windows ID: " + allWinIds);//T1,T2

		// remove home window id from all window id dn you will get child window id
		allWinIds.remove(homePageWinId);//T2
		System.out.println("After remoing homeWinID, all windows ID: " + allWinIds);

		// get child window id using iterator
		Iterator<String> itr = allWinIds.iterator();
		String childWinId = itr.next();
		driver.switchTo().window(childWinId);
				//or
		// switch control to child window
		//driver.switchTo().window(allWinIds.iterator().next());
		
		// now you are allow to identify any element from child window
		System.out.println("Linkedin page title: " + driver.getTitle());
		System.out.println("Linkedin page ulr: " + driver.getCurrentUrl());

		// close current instance of browser
		driver.close();
		//driver.quit();//comment below code
		
		 
		// switch back to home page window in order to perform any required operation on that
		driver.switchTo().window(homePageWinId);
		// now you are allow to identify any element from home window
		System.out.println("etrain page title: " + driver.getTitle());
		System.out.println("etrain page ulr: " + driver.getCurrentUrl());
		// close current instance of browser
		driver.close();
		// close all the driver instances opened by webdriver
		//driver.quit();
	}//nav[class='nav focus-page__nav']>a>icon>svg>*:nth-of-type(2)]

}