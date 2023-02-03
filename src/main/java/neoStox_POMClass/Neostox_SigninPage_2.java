package neoStox_POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Neostox_SigninPage_2 {

@FindBy(xpath=("//input[@id='MainContent_signinsignup_txt_mobilenumber']")) private WebElement textbox;

@FindBy(xpath="(//a[text()='Sign In'])[2]")private WebElement signinbutton;	
	
	public  Neostox_SigninPage_2(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
  public void sendkeysontextbox(String Mobnum)
{
	textbox.sendKeys(Mobnum);
	//textbox.sendKeys(Mobnum);
	Reporter.log("entering mobile number", true);
}
	
public void clickonsigninbutton() 
{
	signinbutton.click();
	Reporter.log("clicking on signin button", true);
}

	
}
