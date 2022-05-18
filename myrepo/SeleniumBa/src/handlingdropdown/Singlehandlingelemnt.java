package handlingdropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Singlehandlingelemnt {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// enter required application url
		driver.get("https://demosite.executeautomation.com/");
		driver.findElement(By.name("UserName")).sendKeys("execution");
		driver.findElement(By.name("Password")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='Login']")).click();	
		
	
		WebElement as = driver.findElement(By.id("TitleId"));
		// instance of the select class
		Select op = new Select(as);
		System.out.println("multiple dropdown or not: " + op.isMultiple());
//		// count the option
		List<WebElement> harsh = op.getOptions();
		System.out.println("count options: " + harsh.size());

		// print all the options name
		for (int i = 0; i < harsh.size(); i++) {
			System.out.println(harsh.get(i).getText());
		}
		String a = op.getFirstSelectedOption().getText();
		System.out.println(a);

//		//op3: get already selected option
		String selectedValue=op.getFirstSelectedOption().getText();
		System.out.println(selectedValue);
		//op4: select required value from dropdown
		op.selectByVisibleText("Mr."); //or
		//s1.selectByValue("t2");//or
		op.selectByIndex(1);
		//System.out.println(op.getFirstSelectedOption().getText());
		
		
		
		//close current instance of browser
		driver.close();				
}
	}

