package appModule;

import org.openqa.selenium.WebDriver;
import pageObjects.YourBag_SignIn;

public class YourBagModule {
	
	public static void execute(WebDriver driver){
		YourBag_SignIn.WaitForElementPresent(driver);
		YourBag_SignIn.SignInIcon(driver).click();
		YourBag_SignIn.WaitForSignlink(driver);
		YourBag_SignIn.SighInLinkDropDown(driver).click();
	}

}
