package swaglab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v126.dom.DOM.GetElementByRelationRelation;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	public Login (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user-name")
	private WebElement usertextfield;
	
	@FindBy(id="password")
	private WebElement passwordtextfield;
	
	@FindBy(id="login")
	private WebElement loginbutton;
		
	
	public WebElement getusertextfield() {
		return usertextfield;
	}
	
	public WebElement getpasswordtextfield() {
		return passwordtextfield;		
	}
	
	public WebElement getloginbutton() {
		return loginbutton;
	}
	
	public void logintoapplication(string username,string password)
		

	}

