package prueba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTestSel {
  @Test
  public void testsel() {
	  String exePath = "./src/test/resources/driver/chromedriver";//en Windows aggregar el .exe
		System.setProperty("webdriver.chrome.driver",exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
  }
}
