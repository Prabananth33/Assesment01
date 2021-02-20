package com.assessment.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "src/test/resources/features/ReportsPage/01_NavigateTo_ReportsPage.feature",
		glue = "com.assessment.stepdef"
		)

public class ReportPageRunner extends AbstractTestNGCucumberTests{


}
