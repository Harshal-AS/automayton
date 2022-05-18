package seleniumprogram;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Openfirefox {

	public static void main(String[] args) {
		//using system class
		String driverPath3=System.getProperty("user.dir")+"\\executables\\geckodriver.exe";
		//Set the driver executable path using System.setProperty(String key,String value)
		System.setProperty("webdriver.gecko.driver", driverPath3);
		//create an instance of required browser class
		FirefoxDriver fdriver=new FirefoxDriver();
	}

}
