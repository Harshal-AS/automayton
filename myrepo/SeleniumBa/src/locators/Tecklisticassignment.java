package locators;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Tecklisticassignment {

	public static void main(String[] args) throws InterruptedException {
		//String driver1 = System.getProperty(key, def)
		System.setProperty("webdriver.chrome.driver", "./executables/chromedriver.exe");
		WebDriver as = new ChromeDriver();
		as.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
         as.get("https://www.techlistic.com/");
         
        // Dimension a=new Dimension(500,700);
       as.manage().window().setSize(new Dimension(500,700));
         as.manage().window().maximize();
         Thread.sleep(20);
         as.get("https://www.techlistic.com/p/java.html/");
         Thread.sleep(20);
        String a=as.getCurrentUrl();
        System.out.println(a);
//         String actualtitle=as.getTitle();
//         String currentur="java-login";
//         System.out.println(actualtitle);
//         System.out.println(currentur);
//         if( actualtitle.equals(currentur)) {
//        	 System.out.println("gettitle pass");
//         }
//         else {
//        	 System.out.println("gettitle fails");
//         }
        as.navigate().back();
         
         Thread.sleep(20);
         as.get("https:///www.techlistic.com/p/selenium-tutorials.html");
        String b=as.getCurrentUrl();
         System.out.println(b);
   //      String a=as.getCurrentUrl();
//         System.out.println(currentur1);
//         String actualtitle1="selenium-login";
//         System.out.println(actualtitle1);
//         if( currentur1.equals(actualtitle1)) {
//        	 System.out.println("gettitle pass");
//         }
//         else {
//        	 System.out.println("gettitle fails");
//         }
         as.navigate().back();
         
         Thread.sleep(20);
         as.get("https://www.techlistic.com/p/bdd-tutorial-with-python-behave.html"); 
         String c=as.getCurrentUrl();
         System.out.println(c);
//         String currentur2=as.getTitle();
//         String actualtitle2="BDD-login";
//         System.out.println(currentur2);
//         System.out.println(actualtitle2);
//         if(currentur2.equals(actualtitle2)) {
//        	 System.out.println("gettitle pass");
//         }
//         else {
//        	 System.out.println("gettitle fails");
//         }
         as.navigate().back();
         
         Thread.sleep(20);
         as.get("https://www.techlistic.com/p/software-testing.html");
         String d=as.getCurrentUrl();
         System.out.println(d);
//         String currentur3=as.getTitle();
//         String actualtitle3="TestNG-login";
//         System.out.println(currentur3);
//         System.out.println(actualtitle3);
//         if(currentur3.equals(actualtitle2)) {
//        	 System.out.println("gettitle pass");
//         }
//         else {
//        	 System.out.println("gettitle fails");
//         }
        // as.close();
	}
}
        
//https://www.techlistic.com/p/selenium-tutorials.html
	//https://www.techlistic.com/p/bdd-tutorial-with-python-behave.html







//https://www.techlistic.com/p/java.html