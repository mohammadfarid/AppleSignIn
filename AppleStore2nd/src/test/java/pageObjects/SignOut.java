package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignOut {
	
	private static WebElement element = null;
	
	public static void WaitForElementPresent(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='ac-gn-bagview-content']//a[contains(text(), 'Sign out')]")));
	}
	
	public static WebElement SignOutDropDown(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='ac-gn-bagview-content']//a[contains(text(), 'Sign out')]"));
		return element;
	}

}
