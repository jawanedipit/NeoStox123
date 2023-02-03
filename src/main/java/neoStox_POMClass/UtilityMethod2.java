package neoStox_POMClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class UtilityMethod2 {
// we reduce reapitative task from Testng class (ValidatingNeoStoxUsername)
	
	//Excel
	//Wait
	//Screenshot
	//ScrollIntoView
	
	//WebDriver driver;
	
	// read data from propertyfile
	
	public static String readDataFromPropertyFile(String key) throws IOException 
	{
		// create object 
		Properties prop = new Properties();
		//create object of FileInputStream
		FileInputStream myFile = new FileInputStream("C:\\Users\\user\\eclipse-workspace\\20_Aug_2023\\myProperty.properties");
		//Data load 
		prop.load(myFile);
		//read data from propertyfile
		String value = prop.getProperty(key);
		return value;
	}
	
	//read data from excel sheet
	// Excel sheet row and cell are vary so we taking in parametrized method
	
//	public static String readDataFromExcelSheet(int row,int cell) throws EncryptedDocumentException, IOException 
//	{
//		File myfiles=new File("C:\\Users\\user\\OneDrive\\Desktop\\selenium\\mock14.xlsx");
//		       Sheet mysheet = WorkbookFactory.create(myfiles).getSheet("sheet8");
//		   String value = mysheet.getRow(row).getCell(cell).getStringCellValue();
//		  Reporter.log("data reading from excel row is " +row+ "cell is " + cell, true);
//		  Reporter.log("data is " +value, true);
//		   return value;
//	}
//	
	// time is vary for Wait so takes as parameterized at this case no driver for this method
	public static void implicitlywait(int time,WebDriver driver)
	{
	   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
	   Reporter.log("waiting for " +time+ " ms", true);
	}
	// take as parameterized by filename
	
	public static void TakeScreenshot( WebDriver driver, String fileName) throws IOException 
	{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\user\\OneDrive\\Desktop\\selenium\\screenshot\\"+fileName+".png");
	FileHandler.copy(src, dest);
	Reporter.log("taking screenshot ", true);
	Reporter.log("taken screenshot and save at "+dest, true);
	}
	
	public static void ScrollIntoView(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		Reporter.log("scroll into view "+element.getText(), true);
	}
	
	
	
	
	
	
	
	
	

}
