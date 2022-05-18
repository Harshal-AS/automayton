package keyboardoperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automationtesting {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(200);
	WebElement a=	driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		a.sendKeys("ritu");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("patil");
		
		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("chahardi");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("yogeshpatip@123");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("1234567890");
	}//input[@type='tel']

}//driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("admin",Keys.chord(Keys.CONTROL,"v"));

