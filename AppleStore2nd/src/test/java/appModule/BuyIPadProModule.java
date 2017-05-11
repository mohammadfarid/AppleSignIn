package appModule;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import pageObjects.BuyIpadPro;
import utility.Log;

public class BuyIPadProModule {
	
	public static void execute(WebDriver driver) throws Exception{
		DOMConfigurator.configure("log4j.xml");
		BuyIpadPro.WaitForElementPresent(driver);
		//BuyIpadPro.Ipad12_9inch(driver).click();
		BuyIpadPro.Ipad9_7inch(driver).click();
		BuyIpadPro.IpadFinishGold(driver).click();
		BuyIpadPro.IpadStorage(driver).click();
		try{
		BuyIpadPro.WaitForContinueButton(driver);
		BuyIpadPro.Continue(driver).click();
		Log.info("Continue to Engraving");
		} catch (Exception e){
			throw(e);
		}
	}


}
