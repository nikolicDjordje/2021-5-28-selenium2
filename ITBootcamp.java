package itBootCamp;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ITBootcamp {

public static final String URL = "https://itbootcamp.rs/";	 
public static void main(String[] args) {


	System.setProperty("webdriver.chrome.driver", "C:\\Sellenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get(URL);
	
	driver.manage().window().maximize();
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl.toString());
	
	String title = driver.getTitle();
	System.out.println(title.toString());
	
	driver.navigate().refresh();
	driver.navigate().to("https://itbootcamp.rs/kontakt/");
	driver.navigate().back();
	driver.navigate().forward();
	
	Dimension d = new Dimension (3826, 764);
	driver.manage().window().setSize(d);
	
	

}
}