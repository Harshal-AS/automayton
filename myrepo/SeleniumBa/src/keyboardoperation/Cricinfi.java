package keyboardoperation;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cricinfi {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.espncricinfo.com/");
		Thread.sleep(200);
		////div[@class='ds-flex ds-flex-row']/div/a using xpath expression
		List<WebElement> harsh=driver.findElements(By.xpath("//div[@class='ds-flex ds-flex-row']/div/a"));
		System.out.println("count mainu top:"+harsh.size());
		for(WebElement shitu:harsh) {
			System.out.println(shitu.getText());
			//mousehover
			Thread.sleep(200);
			Actions t=new Actions(driver);
			for(int i=0;i<harsh.size();i++) {
				WebElement pk=harsh.get(i);
                 t.moveToElement(pk).perform();
		}
}}}
