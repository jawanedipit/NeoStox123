package neoStox_POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class Neostox_HOMEPAGE_1 {

	
	//1. Data member should be declared globally with access level private using @findBy Annotation
	
	@FindBy(xpath="(//a[text()='Sign In'])[1]") private WebElement signinButton;
	
	//2.Initialize within a constructor with access level public using pagefactory
	
	public Neostox_HOMEPAGE_1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//3 Utilize within a method with access level public
	
	public void clickonsigninbutton() throws InterruptedException
	{
		Thread.sleep(2000);
		signinButton.click();
		Reporter.log("clicking on sign in button",true);
		
		
		// commit1
		
		// commit2
	}
	
}
