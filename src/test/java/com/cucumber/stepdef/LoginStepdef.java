package com.cucumber.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.generic.PageFactoryLogin;
import com.util.BaseConfig;
import com.util.ScreenShot;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepdef {
	WebDriver driver;
	PageFactoryLogin obj;
	@Given("Open browser")
	public void getBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Given("go to Application URL")
	public void getURL() throws Exception {
		driver.get(BaseConfig.getValue("URL"));
		driver.manage().window().maximize();
	}

	@When("put valid user name")
	public void getUsername() throws Exception {
		obj = new PageFactoryLogin(driver);
		obj.getUser().sendKeys(BaseConfig.getValue("User"));
	}

	@When("put valid password")
	public void getPassword() throws Exception {
		obj.getPassword().sendKeys(BaseConfig.getValue("password"));
		
	}

	@When("click signin button")
	public void clickSignin() {
		obj.getSubmitButton().click();
		
	}

	@Then("login should be successfull and showed sign out button")
	public void checkSigninvalidation() throws Throwable {
		ScreenShot.getScreenShot(driver, "Login Test status");
		Assert.assertEquals(obj.getLoginStatusSuccessMsg().getText(), "Login Successfully");// fail=stop
		Assert.assertTrue(obj.getSignOffList().get(7).isDisplayed());// stopped here

		SoftAssert soft = new SoftAssert();
		soft.assertTrue(obj.getSignOffList().get(7).isDisplayed());

		soft.assertAll();
	}

	@Then("close browser")
	public void closeBrowser() {

		driver.quit();
	}
}