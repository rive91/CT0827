package testCases_SignIn;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonClasses.DriverSetup;
import commonClasses.GlobalVariables;
import navigationPages.HomePage;
import navigationPages.SignInPage;

public class TC_03_SignIn {
	
	//Declarar e inicializar el WebDriver
	WebDriver driver = DriverSetup.setupDriver();
	
	//PageObjects
	HomePage homePage = new HomePage(driver);
	SignInPage signInPage = new SignInPage(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
	}
	
	@Test
	public void TC_03(){
		//Step 1
		homePage.clickLoginBtn();
		//Step 2 
		Assert.assertTrue(signInPage.signIn(GlobalVariables.USER, GlobalVariables.PWD));
	}
	
	@AfterTest
	public void closeDriver() {
		driver.quit();
	}
}
