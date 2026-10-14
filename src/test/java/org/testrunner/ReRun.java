package org.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "@C:\\Users\\admin\\eclipse-workspace\\InkSpiredBDD\\reports\\Rerun\\inkspired.text", glue = {
		"org.hooks", "org.stepdefinations" }, dryRun = false, plugin = { "pretty",
		"rerun:C\\Users\\admin\\eclipse-workspace\\InkSpiredBDD\\reports\\Rerun\\inkspired.text" })

public class ReRun extends AbstractTestNGCucumberTests {

}
