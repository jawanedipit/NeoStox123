package neoStox_TestClass;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import neoStoxBase_1.Base;
import neoStoxBase_1.Base2;
import neoStoxUtility_2.UtilityMethod;

public class Listener extends Base2 implements ITestListener

{

	@Override
	public void onTestSuccess(ITestResult result)
	{
		Reporter.log("TC" +result.getName()+ "passed" , true);
		try 
		{
			UtilityMethod.TakeScreenshot(driver, result.getName());
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("TC "+result.getName()+"failed", true);
	}
	
	@Override
	public void onTestSkipped(ITestResult result)
	{
		Reporter.log("TC is skipped", true);
	}
	
	
}
