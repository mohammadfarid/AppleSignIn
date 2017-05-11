package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppleHomePageContents {

	private static WebElement element = null;

	public static WebElement HomePage(WebDriver driver){
		element = driver.findElement(By.id("ac-gn-firstfocus"));
		return element;
	}
	
	public static void WaitForElementPresent(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("ac-gn-firstfocus")));
	}


	public static WebElement Mac(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='ac-globalnav']//a[@href='/mac/']"));
		return element;
	}

	public static WebElement Ipad(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='ac-globalnav']//a[@href='/ipad/']"));
		return element;
	}

	public static WebElement Iphone(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='ac-globalnav']//a[@href='/iphone/']"));
		return element;
	}
	
	public static WebElement Watch(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='ac-globalnav']//a[@href='/watch/']"));
		return element;
	}

}




