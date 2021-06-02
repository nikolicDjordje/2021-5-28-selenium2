package itBootCamp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {
	
	public static final String URL = "https://www.google.com/";
	public static final String BUTTON_NAME = "q";
	public static final String SEARCH_BUTTON_NAME = "btnK";


	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Sellenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(URL);
		driver.findElement(By.name(BUTTON_NAME)).sendKeys("testiranje");
		driver.findElement(By.name(SEARCH_BUTTON_NAME)).click();
		driver.manage().window().maximize();	
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
			FileUtils.copyFile(scrFile, new File("C:/Users/spaso/Desktop/screenshot/tets.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
