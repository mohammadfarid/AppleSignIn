package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuyIpadPro {
	
	private static WebElement element = null;
	
	public static void WaitForElementPresent(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='select-product']/div/div/div/h1[contains(text(), 'Buy iPad Pro')]")));
	}
	
	public static WebElement Ipad12_9inch(WebDriver driver){
		element = driver.findElement(By.id("Item112_9inch"));
		return element;
	}
	
	public static WebElement Ipad9_7inch(WebDriver driver){
		element = driver.findElement(By.id("Item19_7inch"));
		return element;
	}
	
	public static WebElement IpadFinishGold(WebDriver driver){
		element = driver.findElement(By.id("Item2gold"));
		return element;
	}
	
	public static WebElement IpadStorage(WebDriver driver){
		element = driver.findElement(By.id("Item332gb"));
		return element;
	}
	
	public static void WaitForContinueButton(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='primary']//button[@name='proceed']")));
	}
	public static WebElement Continue(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='primary']//button[@name='proceed']"));
		return element;
	}

}
