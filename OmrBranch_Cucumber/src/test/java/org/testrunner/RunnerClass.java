package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.reports.Report;

import io.cucumber.core.snippets.SnippetType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = ("@e2r"), glue = "org.stepdefinition", dryRun = !true,monochrome = true,
                 features = "src\\test\\resources\\Feature\\",plugin = {"json:target/name.json","pretty"})
public class RunnerClass {
	
	@AfterClass
	public static void afterClass() {
		Report.getJVMReport("C:\\Users\\Admin\\eclipse-workspace\\OmrBranch_Cucumber\\target\\name.json");
		
	}

}