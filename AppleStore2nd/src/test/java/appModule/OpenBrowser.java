package appModule;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class OpenBrowser {
	
	public static void Load_AppleStorePage(WebDriver driver, String baseUrl){
		driver.get(baseUrl);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		String expected_title = "Apple";
		String actual_title = driver.getTitle();
		System.out.println("Home Page Title "+actual_title);
		Assert.assertEquals(actual_title, expected_title);
	}

}
