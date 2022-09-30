package prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Ejercicio1 {

	public static void main(String[] args) throws InterruptedException {
		String exePath = "./src/test/resources/driver/chromedriver.exe";//en Windows aggregar el .exe
		System.setProperty("webdriver.chrome.driver",exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Click en Sign In
		WebElement signIntbn =  driver.findElement(By.className("login"));
		signIntbn.click();
		
		//WebElements para el login
		WebElement userTxt =  driver.findElement(By.id("email"));
		WebElement pwdTxt =  driver.findElement(By.id("passwd"));
		WebElement signinBtnLogin =  driver.findElement(By.id("SubmitLogin"));
		
		userTxt.sendKeys("cooltesters0827@mailinator.com");
		pwdTxt.sendKeys("Test123!");
		signinBtnLogin.click();
		Thread.sleep(4000);
		
		String urlMyAccount = driver.getCurrentUrl();
		if(urlMyAccount.contains("my-account")) {
			System.out.println("La URL es correcta");
		}

		String signIntext = driver.findElement(By.className("navigation_page")).getText();
		if(signIntext.contains("My account")){
			System.out.println("El elemento con el test My Account esta desplegado");
		}
		
		driver.quit();

	}

}
