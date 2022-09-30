package testCases_Search;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonClasses.DriverSetup;
import commonClasses.GlobalVariables;
import navigationPages.HomePage;
import navigationPages.SearchResultsPage;

public class TC_02_SearchBlouse {
	//Declarar e inicializar el WebDriver
	WebDriver driver = DriverSetup.setupDriver();
	
	//PageObjects
	HomePage homePage = new HomePage(driver);
	SearchResultsPage searchPage = new SearchResultsPage(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
	}
	
	@Test
	public void TC_02() {
		homePage.search("Blouse");
		boolean visibleText = searchPage.getPrdText("Blouse");
		Assert.assertTrue(visibleText,"El text Blouse no esta deplegado");
	}
	
	@AfterTest
	public void closeDriver() {
		driver.quit();
	}
}
