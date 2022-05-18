package testngproject;

import org.openqa.selenium.By;

//import java.util.List;
//import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG9 {
	@Test
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("Before login page title: " + driver.getTitle());
		// validation using TestNG
		// Assert.assertEquals(driver.getTitle(), "actiTIME - Login"); //or
		Assert.assertEquals(driver.getTitle(), "actiTIME - Login", "Either login page not opened or title got changed");

		// identify the required element from the UI and perform required action 0-30
		WebElement usernameInputField = driver.findElement(By.id("username"));
		Assert.assertTrue(usernameInputField.isDisplayed());
		Assert.assertTrue(usernameInputField.isEnabled(),"User name input field is not functional");
		Assert.assertEquals(usernameInputField.getAttribute("placeholder"),"Username","Username input field placeholder name is changed");

		// identify remember check box
		WebElement checkBox = driver.findElement(By.name("remember"));
		Assert.assertTrue(checkBox.isDisplayed());
		Assert.assertTrue(checkBox.isEnabled(),"Checkbox is not functional");
		Assert.assertFalse(checkBox.isSelected(),"Checkbox is by defualt selected");
		
		checkBox.click();
		Assert.assertTrue(checkBox.isSelected(),"Checkbox is not functional");
		driver.close();
	}
}