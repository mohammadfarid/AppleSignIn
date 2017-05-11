package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EngravingItem {
	
	private static WebElement element = null;
	
	public static void WaitForElementPresent(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='engraving_form']/div/div/div/h1[contains(text(), 'Personalize your iPad with free engraving')]")));
	}
	
	
	public static WebElement SkipEngraving(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='engraving_form']//div[text()='Skip Engraving']"));
		return element;
	}
	
	public static WebElement Continue(WebDriver driver){
		element = driver.findElement(By.id("select_button"));
		return element;
	}

}
