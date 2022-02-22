package com.generic;

import java.util.logging.Level;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.util.BaseConfig;
import com.util.HandleClick;
import com.util.Highlighter;
import com.util.ScreenShot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseLogin {

	Logger log = Logger.getLogger(BaseLogin.class.getName());

	public void getLogin() throws Throwable {

		// System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");				
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.silentOutput", "true");
		java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
		WebDriver driver = new ChromeDriver();

		
		driver.get(BaseConfig.getValue("URL"));// any website
		driver.manage().window().maximize();
		log.info("Home page opened");
		PageFactoryLogin obj = new PageFactoryLogin(driver);

		Highlighter.getColor(obj.getUser(), driver, "red");
		obj.getUser().sendKeys(BaseConfig.getValue("user"));
		Highlighter.getColor(obj.getPassword(), driver);
		obj.getPassword().sendKeys(BaseConfig.getValue("password"));
		Highlighter.getColor(obj.getSubmitButton(), driver);
		// obj.getSubmitButton().click();
		HandleClick.getJSEClick(driver, obj.getSubmitButton());

		ScreenShot.getScreenShot(driver, "Login Test status");

		Assert.assertEquals(obj.getLoginStatusSuccessMsg().getText(), "Login Successfully");// fail=stop
		Assert.assertTrue(obj.getSignOffList().get(7).isDisplayed());// stopped here

		SoftAssert soft = new SoftAssert();
		// soft.assertEquals(obj.getLoginStatusSuccessMsg().getText(), "Login
		// Fail");//fail
		soft.assertTrue(obj.getSignOffList().get(7).isDisplayed());

		driver.quit();// came
		soft.assertAll();
	}

}
