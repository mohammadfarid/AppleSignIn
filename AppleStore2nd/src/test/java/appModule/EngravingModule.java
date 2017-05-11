package appModule;

import org.openqa.selenium.WebDriver;
import pageObjects.EngravingItem;

public class EngravingModule {
	
	public static void execute(WebDriver driver){
		EngravingItem.WaitForElementPresent(driver);
		EngravingItem.SkipEngraving(driver).click();
		EngravingItem.Continue(driver).click();
	}


}
