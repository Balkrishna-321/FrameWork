package homework;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v124.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwaglabLoginPOM {
	
	public SwaglabLoginPOM(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user-name")
	private WebElement user textfield;

}
