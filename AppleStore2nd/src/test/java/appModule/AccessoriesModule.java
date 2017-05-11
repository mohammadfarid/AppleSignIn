package appModule;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import pageObjects.Accessories;
import pageObjects.ItemsInBag;
import utility.Log;

public class AccessoriesModule {
	
	public static void execute(WebDriver driver){
		DOMConfigurator.configure("log4j.xml");
		Accessories.WaitForElementPresent(driver);
		//jse.executeScript("window.scrollBy(0,250)", "");
		//Accessories.ApplePencil2(driver).click();
		//Accessories.ApplePencil4(driver).click();
		Accessories.AddToBag(driver).click();
		boolean baginfo = ItemsInBag.PageHeader(driver).isDisplayed();
		if(baginfo){
			String price = ItemsInBag.TotalPrice(driver).getText();
			System.out.println("Total Price "+price);
			Log.info("Total Price "+price);
		}
	}

}
