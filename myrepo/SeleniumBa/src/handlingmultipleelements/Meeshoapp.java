package handlingmultipleelements;

import java.util.List;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Meeshoapp {

	public static void main(String[] args) {
		String driver1=".//executables//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver1);
		WebDriver megha=new ChromeDriver();
		megha.manage().window().maximize();
		megha.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		megha.get("https://www.google.com");
		//String neha=megha.getTitle();	
		System.out.println("neha: "+megha.getTitle());
	//String pranjali=megha.getCurrentUrl();
	System.out.println("pranjali: "+megha.getCurrentUrl());
	
	     List<WebElement> devicename=  megha.findElements(By.cssSelector("ul.erkvQe>div>ul>li>div>div:nth-of-type(2)>div:nth-of-type(1)>span"));
	     System.out.println(devicename.size());
			for(int i=0;i<devicename.size();i++) {
			System.out.println(devicename.get(i).getText());
	     }
	}
}
	      //   shital.click();
	            
	
	
	
//		
//		
		//ul[class='erkvQe']li>div>div>span
	//ul.erkvQe>div>ul>li>div>div:nth-of-type(2)>div:nth-of-type(1)>span


