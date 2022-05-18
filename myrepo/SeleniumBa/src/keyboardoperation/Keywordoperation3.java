package keyboardoperation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keywordoperation3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement firstname=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		firstname.sendKeys("raj",Keys.chord(Keys.CONTROL,"a"));
		
		firstname.sendKeys(Keys.chord(Keys.CONTROL,"c"));
	WebElement aakash=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
		aakash.sendKeys(Keys.chord(Keys.CONTROL,"v"));
	}

}
