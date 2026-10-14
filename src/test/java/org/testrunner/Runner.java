package org.testrunner;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C:\\Users\\admin\\eclipse-workspace\\InkSpiredBDD\\src\\test\\resources\\FeatureFile",
glue = {"org.hooks","org.stepdefinations"},
tags = "@Negative",
dryRun =false,
plugin = {"pretty",
		"rerun:C:\\Users\\admin\\eclipse-workspace\\InkSpiredBDD\\reports\\Rerun\\inkspired.text",
	    "json:C:\\Users\\admin\\eclipse-workspace\\InkSpiredBDD\\reports\\JsonReports\\inkspired.json"})



public class Runner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		// TODO Auto-generated method stub
		return super.scenarios();
	}

}
