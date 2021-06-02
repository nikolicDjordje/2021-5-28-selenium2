package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import itBootCamp.Search;


   
public class Testiranje {
	public static final String URL_TEST = "https://www.google.com/search?q=testiranje&source=hp&ei=OZmyYM3tE9COlwSDtbPYAw&iflsig=AINFCbYAAAAAYLKnSQctS2Hk40QM0k7EJelEnOkzxc2P&oq=testiranje&gs_lcp=Cgdnd3Mtd2l6EAwyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAUIwDWMEDYJUFaABwAHgAgAGlAYgBtQSSAQMxLjOYAQCgAQGqAQdnd3Mtd2l6&sclient=gws-wiz&ved=0ahUKEwiN7ouU0-_wAhVQx4UKHYPaDDsQ4dUDCAc";

	@BeforeClass
	public void createDriver () {
        System.setProperty("webdriver.chrome.driver", "C:\\Sellenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	private static WebDriver driver;
	
	public void testCheck (WebDriver driver) {
		driver.get(Search.URL);
		driver.findElement(By.name(Search.BUTTON_NAME)).sendKeys("testiranje");
		driver.findElement(By.name(Search.SEARCH_BUTTON_NAME)).click();
	}

	@Test
	public void testRegBtn () {
		testCheck (driver);
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, URL_TEST);
	
}
}