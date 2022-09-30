package prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_ChangeTab {

	public static void main(String[] args) throws InterruptedException {
		String exePath = "./src/test/resources/driver/chromedriver.exe";//en Windows aggregar el .exe
		System.setProperty("webdriver.chrome.driver",exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		String originalTab = driver.getWindowHandle();
		System.out.println(originalTab);
		
		Thread.sleep(2000);
		//hacer en el link que abre la pestaña nueva
		WebElement clickHere = driver.findElement(By.xpath("//*[@href = \"../articles_popup.php\"]"));
		clickHere.click();
		Thread.sleep(2000);
		
		for(String tabNueva : driver.getWindowHandles()) {//Estructura "for" simplificada por cada ventana o tab abierta vamos a recorrer una por una
			if(!originalTab.contentEquals(tabNueva)) {
				driver.switchTo().window(tabNueva);
				break;
			}
		}
		Thread.sleep(2000);
		//Enviar email
		WebElement emailtxt = driver.findElement(By.name("emailid"));
		emailtxt.sendKeys("testemal@test.com");

		driver.switchTo().window(originalTab);

	}

}
