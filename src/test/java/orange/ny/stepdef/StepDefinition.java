package orange.ny.stepdef;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import orange.ny.base.BasePage;
import orange.ny.elementpage.ElementPageFactory;
import orange.ny.utility.CommonUtility;

public class StepDefinition extends BasePage {

	ElementPageFactory pf;

	@Given("^User enter the userName and password$")
	public void user_enter_the_userName_and_password()  {
		BasePage.initializations();
		pf = PageFactory.initElements(driver, ElementPageFactory.class);
		// pf = new ZooplaElementsPage(driver);
		logger.info("****** Entered Username ******");
		CommonUtility.waitForElement(pf.getEnterUserName(), 30);
		pf.getEnterUserName().sendKeys(prop.getProperty("userName"));
		logger.info("****** Entered Password ******");
		CommonUtility.waitForElement(pf.getEnterPassword(), 30);
		pf.getEnterPassword().sendKeys(prop.getProperty("password"));
		
	}

	@When("^User click on the login button$")
	public void user_click_on_the_login_button() {
		CommonUtility.waitForElement(pf.getClickOnLogin(),30);
		logger.info("****** Sign In Application ******");
		pf.getClickOnLogin().click();
		
	}

	@Then("^User login successfull & verify the homepage$")
	public void user_login_successfull_verify_the_homepage() {
		logger.info("****** Verify the page title ******");
		String expected = "OrangeHRM";
		String actual = driver.getTitle();
	
		Assert.assertEquals(actual, expected);
		System.out.println("The title of the page is :" + actual);
	}
}

