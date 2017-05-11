package automationFrameWork;

import org.testng.annotations.Test;
import appModule.AllSignInSteps;
import appModule.AllSignOutSteps;
import appModule.OpenBrowser;
import appModule.YourBagModule;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import utility.Constant;
import utility.Log;

import org.testng.annotations.BeforeTest;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TC_SignIn {

	private static WebDriver driver = null;

	@BeforeTest
	public void beforeTest() {
		DOMConfigurator.configure("log4j.xml");
		Log.startTestCase("Sign In_TC");
		ChromeDriverManager.getInstance().setup();
		driver = new ChromeDriver();
		OpenBrowser.Load_AppleStorePage(driver, Constant.URL);
	}

	@Test
	public void run() throws Exception {
		//Sign in and out
		
		//one way
		/*
		 
		//AllSignInSteps.execute(driver, Constant.UserName, Constant.Password);
		//AllSignOutSteps.execute(driver);
		
		*/
		
		
		//2nd way
		YourBagModule.execute(driver);
		AllSignInSteps.execute(driver);
		AllSignOutSteps.execute(driver);
		
		
		/*
		IpadHome.VerifyIpadHome(driver);
		IpadHome.IpadPro(driver).click();
		
		IpadProHome.WaitForElementPresent(driver);
		IpadProHome.IpadBuy(driver).click();
		
		BuyIPadProModule.execute(driver);
		EngravingModule.execute(driver);
		AccessoriesModule.execute(driver);
		*/
	}


	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
