package orange.ny.hooks;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import orange.ny.base.BasePage;

public class Hooks extends BasePage {
	
	@BeforeTest
	public void setUp() {
		logger.info("****** Start Automation ******");		
		initializations();	
	}
	
	@AfterTest
	public void tearDown() {
		logger.info("****** End Automation ******");
		driver.quit();
	}
 }

