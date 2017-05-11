package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Accessories {
	private static WebElement element = null;
	
	public static void WaitForElementPresent(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='configuration-form']/div/div/div/h2[contains(text(), 'Accessories for your iPad')]")));
	}
	
	public static WebElement PencilNon(WebDriver driver){
		element = driver.findElement(By.xpath(".//label[@for='ao.pencil.none']/span[@class='as-radiolist-radio']"));
		return element;
	}
	
	public static WebElement ApplePencil(WebDriver driver){
		element = driver.findElement(By.xpath(".//label[@for='ao.pencil.pencil.MK0C2AM/A']/span[@class='as-radiolist-radio']"));
		return element;
	}
	
	public static WebElement ApplePencil2(WebDriver driver){
		element = driver.findElement(By.xpath(".//span[text()='Apple Pencil for iPad Pro']"));
		return element;
	}
	
	public static WebElement ApplePencil3(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='accessories-content']/li/div/div/div/fieldset/ul/li/label[@for='ao.pencil.pencil.MK0C2AM/A']"));
		return element;
	}
	
	public static WebElement ApplePencil4(WebDriver driver){
		element = driver.findElement(By.xpath(".//label[@class='as-radiolist-radiocontainer']/span[text()='Apple Pencil for iPad Pro']/../span[@class='as-radiolist-radio']"));
		return element;
	}

	public static WebElement SmartKeyBrd(WebDriver driver){
		element = driver.findElement(By.xpath(".//label[@for='ao.12_9keyboard.none']/span[@class='as-radiolist-radio']"));
		return element;
	}
	
	public static WebElement AddToBag(WebDriver driver){
		element = driver.findElement(By.xpath(".//button[@name='add-to-cart']"));
		return element;
	}

}
