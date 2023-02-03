package neoStox_TestClass;

import org.testng.annotations.Test;

import neoStoxBase_1.Base;
import neoStoxPOMclass_3.NeostoxDasboardPage_5;
import neoStoxPOMclass_3.Neostox_HOMEPAGE_1;
import neoStoxPOMclass_3.Neostox_SigninPage_2;
import neoStoxPOMclass_3.Neostox_passwardpage_3;
import neoStoxUtility_2.UtilityMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

//this class excuted by  using listner class or concept


@Listeners(neoStoxTestClass_4.Listener.class)

public class ValidateNeostoxUserName extends Base{
	Neostox_HOMEPAGE_1 home;
	 Neostox_SigninPage_2 signIn;
	 Neostox_passwardpage_3 pwd1;
	 NeostoxDasboardPage_5 dash1;
	 String dip="TCID9730";
	 String dip1="TCID@9730";
	
	 @BeforeClass
	  public void laucnchNeostoxApp() 
	 {
		  launchbroswer();
		  home = new Neostox_HOMEPAGE_1(driver);
		  signIn = new Neostox_SigninPage_2(driver); 
		  pwd1= new Neostox_passwardpage_3(driver);
		 dash1= new NeostoxDasboardPage_5(driver);
	
	  }
	
	 
	 @BeforeMethod
	  public void loginToNeoStox() throws EncryptedDocumentException, InterruptedException, IOException
	  {
		  Thread.sleep(2000);
		  home.clickonsigninbutton();
		 // UtilityMethod.implicitlywait(1000, driver);
		  signIn.sendkeysontextbox(UtilityMethod.readDataFromExcelSheet(0, 0));
		  Thread.sleep(2000);
		  signIn.clickonsigninbutton();
		
		//  UtilityMethod.implicitlywait(1000, driver);
		  pwd1.enteringpassward(UtilityMethod.readDataFromExcelSheet(0, 1));
		  Thread.sleep(2000);
		  pwd1.clickonsubmitbutton();
		
	//	  UtilityMethod.implicitlywait(1000, driver);
		  Thread.sleep(2000);
		  dash1.handlingPopUp(driver);
		 
	  }
	@Test
      public void validatingUsernameNeoStoxApp() throws EncryptedDocumentException, IOException, InterruptedException
	{
		 Thread.sleep(3000);
		 Assert.assertEquals(dash1.actualusernamevalue(), UtilityMethod.readDataFromExcelSheet(0, 2),"Actual and Expected username are not equal TC failed");
		 UtilityMethod.TakeScreenshot(driver, dip);
  }
 
	@Test
	public void validatingAcBalnce() throws IOException, InterruptedException 
	{
		 Thread.sleep(3000);
		 Assert.assertNotNull(dash1.getAcBalance(),"acbalance is null test TC failed");
		 UtilityMethod.TakeScreenshot(driver, dip1);
	}

  @AfterMethod
  public void afterMethod() throws InterruptedException 
  {
	  
	  Thread.sleep(2000);
	  dash1.clickOnUsername();
	  Thread.sleep(2000);
	  dash1.logoutfromNeoStoxApp();
  }

 

  @AfterClass
  public void afterClass() throws InterruptedException 
  {
	  Thread.sleep(2000);
	  driver.close();
	  Reporter.log("closing application", true);
  }

}
