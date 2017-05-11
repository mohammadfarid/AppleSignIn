package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {
	
	private static WebElement element = null;
	
	public static void WaitForElementPresent(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='account-page-header']/h1[text()='Please Sign In']")));
	}
	
	public static WebElement AppleID(WebDriver driver){
		element = driver.findElement(By.xpath(".//input[@id='login-appleId']"));
		return element;
	}

	public static WebElement ApplePassword(WebDriver driver){
		element = driver.findElement(By.id("login-password"));
		return element;
	}

	public static WebElement SignInLink(WebDriver driver){
		element = driver.findElement(By.id("sign-in"));
		return element;
	}

}
