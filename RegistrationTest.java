package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.Home;
import objects.Registration;
import resources.Constants;

public class RegistrationTest {
	
	private static WebDriver driver;

	@BeforeClass
	public void createDriver () {
        System.setProperty("webdriver.chrome.driver", "C:\\Sellenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void testRegBtn () {
		driver.navigate().to(Constants.URL);
		Home.clickRegBtn(driver);
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = Constants.URL;
		Assert.assertEquals(currentUrl, expectedUrl);
	}
	@Test
	public void testReg ()  {
		driver.navigate().to(Constants.URL);
		Registration.inputUsername(driver, "Djordje");
		Registration.inputPassword(driver, "sifra123");
		Registration.inputConPassword(driver, "sifra123");
		Registration.submit(driver);
		
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "http://demo.guru99.com/test/newtours/register_sucess.php";
		Assert.assertEquals(currentUrl, expectedUrl);
	}
}
