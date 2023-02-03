package neoStox_POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxUtility_2.UtilityMethod;

public class NeostoxDasboardPage_5 {

	
    @FindBy(xpath="(//a[text()='OK'])[2]") private WebElement okbutton;
	
	@FindBy(xpath="(//a[text()='Close'])[5]") private WebElement closebutton;
	
	@FindBy(xpath="//span[@id='lbl_username']")private WebElement username;
    
     @FindBy(id="lbl_curbalancetop")private WebElement acBalance;
	
	//@FindBy(xpath="//span[@id='lbl_username']")private WebElement username1;
	
	@FindBy(xpath="//span[text()='Logout']")private WebElement logoutButton;
	
	
	public NeostoxDasboardPage_5(WebDriver driver) 
	{
	PageFactory.initElements(driver,this);
	}
	
	
	public void handlingPopUp(WebDriver driver) throws InterruptedException 
	{
		Thread.sleep(3000);
		
		//okbutton.click();
		
		if(okbutton.isDisplayed())
		{ 
		
	    Thread.sleep(3000);
		UtilityMethod.ScrollIntoView(driver, okbutton);
		Thread.sleep(1000);
		okbutton.click();
		Reporter.log("click on popup okbutton", true);
		
		Thread.sleep(1000);
		
//		UtilityMethod.ScrollIntoView(driver, closebutton);
//		Thread.sleep(1000);
//	    Reporter.log("clicking on popup closebutton", true);
		
		}
		else 
		{
			
			Reporter.log("there is no popup", true);
		}
	       
		       
	       
	}
	
	
		
	
	public String actualusernamevalue() throws InterruptedException 
	{        
		Thread.sleep(2000);
		String uservalue1 = username.getText();
		//String actualusername = username.getText();
	      Reporter.log("To get actualusername ", true);
	      Reporter.log("take actualusername " + uservalue1, true);
		return uservalue1; 
	
	    //   if(expectedusername.equals(actualusername)) {
//			System.out.println("actualName is macthing with expectedusername test case is passed");
//		}else {
//			System.out.println("actualName is not macthing with expectedusername test case is failed");
//		}
	}
	
	
	//creating method for acbalance element
	public String getAcBalance() throws InterruptedException
	{
		Thread.sleep(2000);
		 String value = acBalance.getText();
		 Reporter.log("get acbalance ", true);
		 Reporter.log("to get acbalance "+ value, true);
		 return value;
		 
		
	}
	
	
	
	public void clickOnUsername() throws InterruptedException 
	{ 
		Thread.sleep(2000);
		username.click();
		Thread.sleep(2000);
		//logout.click();
		
	}
	
	public void logoutfromNeoStoxApp() throws InterruptedException 
	{
		Thread.sleep(1000);
		logoutButton.click();
	    Reporter.log("clicking on logout button", true);
	}
	
	
	
}
