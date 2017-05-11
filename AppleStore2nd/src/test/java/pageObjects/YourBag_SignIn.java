package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YourBag_SignIn {
	private static WebElement element = null;
	
	public static void WaitForElementPresent(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ac-gn-bag")));
	}


	public static WebElement SignInIcon(WebDriver driver){
		element = driver.findElement(By.id("ac-gn-bag"));
		return element;

	}
	
	public static void WaitForSignlink(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//a[contains(text(), 'Sign in')]")));
	}

	public static WebElement SighInLinkDropDown(WebDriver driver){
		element = driver.findElement(By.xpath(".//a[contains(text(), 'Sign in')]"));
		return element;
	}

}
