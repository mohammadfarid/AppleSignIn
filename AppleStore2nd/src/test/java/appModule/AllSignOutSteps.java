package appModule;

import org.openqa.selenium.WebDriver;

import pageObjects.YourBag_SignIn;
import pageObjects.SignOut;

public class AllSignOutSteps {

	public static void execute(WebDriver driver){
		YourBag_SignIn.WaitForElementPresent(driver);
		YourBag_SignIn.SignInIcon(driver).click();
		SignOut.WaitForElementPresent(driver);
		//verify the object is present on the page
		boolean sigount = SignOut.SignOutDropDown(driver).isDisplayed();
		if(sigount){
			System.out.println("Sign out link is displayed.");
			SignOut.SignOutDropDown(driver).click();
		} 

	}

}
