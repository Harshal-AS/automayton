package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class Validationwebbrowser{

	public static void main(String[] args) {
		
		String driverPath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		//step1: set driver executable path by using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath);
		//step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
//		//maximize the browser window
//		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		
		//identify the required element from the UI
		WebElement userNameInputField=driver.findElement(By.id("username"));
//		
		System.out.println("Username input field visibility status is : "+userNameInputField.isDisplayed());
		System.out.println("Username input field editable status is : "+userNameInputField.isEnabled());
		String actualDefaultTextOnUsernameField=userNameInputField.getAttribute("placeholder");
		System.out.println("Default text validation for username field: "+actualDefaultTextOnUsernameField.equals("Username"));
//		perform appropriate action the identified element
		userNameInputField.sendKeys("trainee");
//		
//		//identify the required element from the UI
	WebElement passwordInputField=driver.findElement(By.name("pwd"));
	
	System.out.println("Password input field visibility status is : "+passwordInputField.isDisplayed());
	System.out.println("Password input field editable status is : "+passwordInputField.isEnabled());
	String actualDefaultTextOnPasswordField=passwordInputField.getAttribute("placeholder");
	System.out.println("Default text validation for password field: "+actualDefaultTextOnPasswordField.equals("Password"));
//		//perform appropriate action the identified element
	passwordInputField.sendKeys("trainee");
//		
//		//identify remember check box
		WebElement checkBox=driver.findElement(By.id("keepLoggedInCheckBox"));
//		
		System.out.println("Keep me loggedin checkbox visibility status is : "+checkBox.isDisplayed());
		System.out.println("Keep me loggedin checkbox clickable status is : "+checkBox.isEnabled());
		System.out.println("Keep me loggedin checkbox default status is : "+checkBox.isSelected());
		checkBox.click();
		System.out.println("Keep me loggedin checkbox after click, status is : "+checkBox.isSelected());
//		
//		//identify the required element from the UI
		WebElement loginButton=driver.findElement(By.id("loginButton"));
//		
		System.out.println("Tag name for login button : "+loginButton.getTagName());
//		
		System.out.println("Login button visibility status is : "+loginButton.isDisplayed());
		System.out.println("Login button clickable status is : "+loginButton.isEnabled());
	String actaulButtonName=loginButton.getText();
		System.out.println("Login button name validation: "+actaulButtonName.equals("Login"));
//		//perform appropriate action the identified element
		loginButton.click();	
//		
//		//close browser
		//driver.close();
	}
}