package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	
		public static void main(String[] args) throws InterruptedException {
			String driver=".//executables//chromedriver.exe";
			System.setProperty("webdriver.chrome.driver",driver);
			 ChromeDriver cdriver=new ChromeDriver();
			 //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(1000);
			cdriver.get("https://www.amazon.in");
			Thread.sleep(2000);
	//cdriver.manage().window().setSize(new Dimension(50.10,700));
			cdriver.manage().window().maximize();
			String actualtitle=cdriver.getTitle();
			String expectedtitle="amazon-log";
			System.out.println("actualtitle: "+actualtitle);
			System.out.println("expectedtitle: "+expectedtitle);
			WebElement c=cdriver.findElement(By.id("nav-search-submit-button"));
			c.sendKeys("sports shoes for men");
			cdriver.get("https://www.amazon.in/s?k=sports+shoes+for+men&i=todays-deals&crid=2LFT43LKL1L21&sprefix=spo%2Ctodays-deals%2C327&ref=nb_sb_ss_i_1_3");
//				String a=cdriver.getTitle();
//				String expectedurl="https://www.amazon.in/deals?ref_=nav_cs_gb";
//			System.out.println("a:"+a);
//			System.out.println("a:"+expectedurl);
//			cdriver.navigate().back();
//		
//			String actualtitle1=cdriver.getTitle();
//			String expectedtitle1="amazon-log";
//		System.out.println("a:"+actualtitle1);
//			System.out.equals("expectedtitle1:"+expectedtitle1);
//			if(actualtitle1.equals(expectedtitle1)) {
//			System.out.println("URL PASS");
//			
//			}
//			else {
//				System.out.println("URL fail");
			//cdriver.close();//nav-search-submit-button//https://www.amazon.in/deals?ref_=nav_cs_gb
			}
				
			}
	

//idnav-search-submit-button