package neoStox_POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Neostox_passwardpage_3 {

	@FindBy(xpath="//input[@id='txt_accesspin']") private WebElement passwordfield;
	
	@FindBy(xpath="//a[@id='lnk_submitaccesspin']") private WebElement submitbutton;
	
	public Neostox_passwardpage_3(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void enteringpassward(String password) throws InterruptedException 
	{
		Thread.sleep(2000);
		//passwordfield.sendKeys(password);
		passwordfield.sendKeys(password);
		Reporter.log("entering password ", true);
	}
	
	public void clickonsubmitbutton() throws InterruptedException 
	{
		Thread.sleep(1000);
		submitbutton.click();
		Reporter.log("clicking on submit button", true);
	}
	
	
	
	
	
	
}
