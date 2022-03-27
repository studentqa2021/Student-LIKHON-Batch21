package orange.ny.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin= {"pretty","json:target/cucumber.json",
				"html:target/report/cucumber.html",
				"json:target/cucumber.json"
				},
		
			
		features = {".//Featatures/"}, 
        glue = {"orange.ny.stepdef","orange.ny.hooks"}, 
		 
		dryRun = false, 
		monochrome = true, 
		strict = false,
		tags = {"@SmokeTest"})

public class MyRunner extends AbstractTestNGCucumberTests {
	
}
