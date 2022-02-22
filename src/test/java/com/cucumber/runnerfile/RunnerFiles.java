package com.cucumber.runnerfile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		plugin= {// report
				"html:target/report/cucumber.html",
				"json:target/cucumber.json"
				
		},
		
		features = {"src/test/resources/OrbisLogin.feature" },//path	
		glue = { "com.cucumber.stepdef" }//stepdef package name		

			
			
			)

	public class RunnerFiles extends AbstractTestNGCucumberTests {
		
	}
	

