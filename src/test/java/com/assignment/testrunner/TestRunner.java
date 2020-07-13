package com.assignment.testrunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/main/resources/com/assignment/feature" }, glue = {
		"com.assignment.steps", "com.assignment.util" }, plugin = { "pretty", "html:tagret/cucumber-html-report",
				"json:tagret/cucumber-json-report" },

		monochrome = true

)

public class TestRunner extends AbstractTestNGCucumberTests {
	// this class will not have any code
}
