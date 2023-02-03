package neoStox_POMClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class Base2 
{
	protected static WebDriver driver;
	public void launchbroswer1() throws IOException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\OneDrive\\Desktop\\selenium\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// use for data provider fatching data by Url
		
		driver.get("https://neostox.com/");
		
		//driver.get(UtilityMethod2.readDataFromPropertyFile("url"));
		
		UtilityMethod2.implicitlywait(1000, driver);
		
		Reporter.log("launching  browser", true);
		
		
		
		//commet2
		
	    
		// commet 3
		
		
		
		
	}
	
	
	

}
