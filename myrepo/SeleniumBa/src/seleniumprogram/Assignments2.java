package seleniumprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments2 {

	public static void main(String[] args) {
		/*
		 * 1.launch the web driver.
		 *  2.Open the URL https://www.facebook.com in the
		 * current browser
		 *  3.fetching home page title// fetching= get method title
		 * 4.Verify actual title of the home page with expected title
		 *  5.print page
		 * length on eclipse console close the browser
		 */
		// 1.launch the web driver.
		// relative path
		String driver1 = ".//executables//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driver1);
		WebDriver ref = new ChromeDriver();
		// 2.Open the URL https://www.facebook.com in the current browser
		ref.get("https://www.facebook.com");
		String actualtitle = ref.getTitle();
		String expectedtitle = "facebook login page";
		System.out.println("Actualtitle: " + actualtitle);
		System.out.println("Actualtitle: " + expectedtitle);
		// 3.Get Page Title name & Title length.
		System.out.println("print pahe length eclipse console:" + actualtitle.length());
		// 4.Verify actual title of the home page with expected title
		String actualurl = ref.getCurrentUrl();
		String expectedurl = "https://www.facebook.com";
		if (actualurl.equals(expectedurl)) {
			System.out.println("title valid pass");
		} else {
			System.out.println("title valid failed");
		}
		
		System.out.println("page url: " + actualurl);
		System.out.println("URL length: " + actualurl.length());
		String sourcecontent=ref.getPageSource();
		System.out.println("source content length:"+sourcecontent.length());
		ref.close();
	}

}
