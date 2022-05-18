package handlingdropdown;

import java.awt.Dimension;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multipledropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait
		Dimension megha=new Dimension (30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(megha);
		//enter required application url
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.switchTo().frame("iframeResult");
		//identify dropdown
		WebElement as=driver.findElement(By.name("cars"));

		//instance of select 
		Select a=new Select(as);
		// multipledropdown list or not
		System.out.println(" is multiple dropdown:"+a.isMultiple());
		//count the options present in dropdown
		List<WebElement> w=a.getOptions();
		System.out.println("count: "+w.size());
		//select required value of dropdown
		for(int i=0;i<w.size();i++) {
		System.out.println(w.get(i).getText());
		//op4: select required value from dropdown
		a.selectByVisibleText("Volvo"); //or
		a.selectByValue("opel");//or
		a.selectByIndex(3);
		//Op5: get only selected options
		List<WebElement> selectedOption=a.getAllSelectedOptions();
		System.out.println(w.size());
		for(int v=0;v<w.size();v++) {
			System.out.println(selectedOption.get(v).getText());
		}
		//op6: unselecting the selected options
		//s1.deselectByVisibleText("Volvo"); //or
		//s1.deselectByValue("html");//or
		//s1.deselectByIndex(7);
		a.deselectAll();		
		
		//close current instance of browser
		driver.close();				
}

		
		}	
	}


