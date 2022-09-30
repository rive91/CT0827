package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonClasses.WrapClass;

public class SignInPage {
	
	public SignInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//WebElemnts
	@FindBy(id = "email")
	private WebElement userNameTxt;
	@FindBy(id = "passwd")
	private WebElement pwdTxt;
	@FindBy(id = "SubmitLogin")
	private WebElement signInBtn;
	@FindBy(className = "navigation_page")
	private WebElement myAcoountLbl;
	
	public boolean signIn(String user, String pwd) {
		WrapClass.sendKeys(userNameTxt, user);
		WrapClass.sendKeys(pwdTxt, pwd);
		WrapClass.click(signInBtn);
		return WrapClass.getText(myAcoountLbl).contains("My account");
	}
	
	
}
