package keyboardoperation;

//import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draggable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/draggable/");
		// frame handling
		WebElement frame=driver.findElement(By.xpath(".demo-frame//a[text()='jQuery UI']"));
		driver.switchTo().frame(frame);
		
	//	Actions har=new Actions(driver);
		
//List<WebElement> g=driver.findElements(By.xpath("//a[text()='jQuery UI']"));
////WebElement target=driver.findElement(By.xpath("//h3[@class='widget-title']"));
//har.dragAndDrop(g.get(0), target).build().perform();
}}
////a[text()='jQuery UI']
/*act.dragAndDrop(sourceElements.get(0), target).build().perform();
Thread.sleep(1000);
act.dragAndDrop(sourceElements.get(1), target).build().perform();
Thread.sleep(1000);
act.dragAndDrop(sourceElements.get(2), target).build().perform();*/


