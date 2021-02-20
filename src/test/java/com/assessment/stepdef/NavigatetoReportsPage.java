package com.assessment.stepdef;

import com.assessment.pages.CreateLeadPage;
import cucumber.api.java.en.Given;

public class NavigatetoReportsPage extends CreateLeadPage {

	@Given("User navigates to Reports Page")
	public void VerifyReportsPage() {
		EnterEmail("makaia@testleaf.com");
		EnterPassword("Bootcamp@123");
		ClickLogin();
		GotoReoportsPage();
		CreateLead();
	}
}
