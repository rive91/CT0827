package prueba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		String exePath = "./src/test/resources/driver/chromedriver";//en Windows aggregar el .exe
		System.setProperty("webdriver.chrome.driver",exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.https://www.cooltesters.com/tienda-de-cursos/selenium-con-java.com");
	}

}
