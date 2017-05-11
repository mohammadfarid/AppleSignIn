package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IpadProHome {
	private static WebElement element = null;
	
	public static void WaitForElementPresent(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='ac-localnav']/div/div/h2/a[text()='iPad Pro']")));
	}
	
	public static WebElement IpadBuy(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='ac-localnav']//a[text()='Buy']"));
		return element;
	}

}
