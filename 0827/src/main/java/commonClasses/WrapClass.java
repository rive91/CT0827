package commonClasses;

import org.openqa.selenium.WebElement;

public class WrapClass {
	
	public static void click(WebElement webE) {
		webE.click();
	}
	
	public static void sendKeys(WebElement webSendKeys, String textTosend) {
		webSendKeys.sendKeys(textTosend);
	}

	public static String getText(WebElement webE) {
		return webE.getText();
	}
	
}
