package automationFrameWork;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import appModule.AccessoriesModule;
import appModule.BuyIPadProModule;
import appModule.EngravingModule;
import appModule.OpenBrowser;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import pageObjects.IpadHome;
import pageObjects.IpadProHome;
import utility.Constant;
import utility.Log;

public class TC_BuyAnIpad {

	private static WebDriver driver = null;

	@BeforeTest
	public void beforeTest() {
		DOMConfigurator.configure("log4j.xml");
		Log.startTestCase("TC_BuyIpad");
		ChromeDriverManager.getInstance().setup();
		driver = new ChromeDriver();
		OpenBrowser.Load_AppleStorePage(driver, Constant.URL);
		Log.info("Browser Opened");
	}

	@Test
	public void run() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		IpadHome.VerifyIpadHome(driver);
		Log.info("IpadHome Opened");
		IpadHome.IpadPro(driver).click();
		Log.info("Ipad Pro Link is Clicked");
		

		IpadProHome.WaitForElementPresent(driver);
		IpadProHome.IpadBuy(driver).click();
		Log.info("Ipad Buy Link is Clicked");

		BuyIPadProModule.execute(driver);
		EngravingModule.execute(driver);
		Log.info("Moved to Accessories");
		AccessoriesModule.execute(driver);
	}


	@AfterTest
	public void afterTest() {
		driver.quit();
		Log.EndTestCase("TC_BuyIpad");
	}

}
