package orange.ny.elementpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import orange.ny.base.BasePage;

public class ElementPageFactory extends BasePage {
	
	public ElementPageFactory() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id ="txtUsername")
	@CacheLookup 
	private WebElement enterUserName;
	
	@FindBy(id ="txtPassword")
	@CacheLookup
	private WebElement enterPassword;

	@FindBy(id ="btnLogin")
	@CacheLookup
	private WebElement clickOnLogin;

	public WebElement getEnterUserName() {
		return enterUserName;
	}

	public WebElement getEnterPassword() {
		return enterPassword;
	}

	public WebElement getClickOnLogin() {
		return clickOnLogin;
	}


}
