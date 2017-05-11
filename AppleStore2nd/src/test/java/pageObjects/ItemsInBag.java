package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ItemsInBag {
	
	private static WebElement element = null;
	
	public static WebElement PageHeader(WebDriver driver){
		element = driver.findElement(By.id("page-header"));
		return element;
	}
	
	public static WebElement CheckOut(WebDriver driver){
		element = driver.findElement(By.id("cart-actions-checkout"));
		return element;
	}
	
	public static WebElement TotalPrice(WebDriver driver){
		element = driver.findElement(By.xpath(".//td[@data-autom='bagtotalvalue']"));
		return element;
	}
	

}
