package appModule;

import org.openqa.selenium.WebDriver;

import pageObjects.SignInPage;
import utility.Constant;
import utility.ExcelUtils;

public class AllSignInSteps {
	//one way
	//public static void execute(WebDriver driver, String username, String password) throws Exception{
	
	//2nd way
	public static void execute(WebDriver driver) throws Exception{
		//one way
		//SignIn.AppleID(driver).sendKeys(username);
		//SignIn.ApplePassword(driver).sendKeys(password);
		
		//2nd way
		SignInPage.WaitForElementPresent(driver);
		String username = ExcelUtils.GetCellData(Constant.Path_TestData, "Sheet1", 1, 1);
		SignInPage.AppleID(driver).sendKeys(username);
		String password = ExcelUtils.GetCellData(Constant.Path_TestData, "Sheet1", 1, 2);
		SignInPage.ApplePassword(driver).sendKeys(password);
		SignInPage.SignInLink(driver).click();
		Thread.sleep(10000);
		
	}

}
