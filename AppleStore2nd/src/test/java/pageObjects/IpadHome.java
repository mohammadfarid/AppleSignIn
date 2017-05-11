package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class IpadHome {

	private static WebElement element = null;

	public static void VerifyIpadHome(WebDriver driver){
		AppleHomePageContents.Ipad(driver).click();
		String expectedTitle = "iPad - Apple";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	
	}

	public static WebElement IpadPro(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='chapternav']//span[text()='iPad Pro']"));
		return element;
	}

}
