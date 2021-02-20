package com.assessment.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import com.assesment.base.PSM;

public class ReportPage extends PSM {

	public void EnterEmail(String Username) {
		startApp();
		WebElement uname = locateElement("xpath", "//input[@type='email']");
		type(uname, Username);
	}

	public void EnterPassword(String Password) {
		WebElement pword = locateElement("xpath", "//input[@type='password']");
		type(pword, Password);
	}

	public void ClickLogin() {
		WebElement loginbtn = locateElement("xpath", "//input[@value='Log In']");
		click(loginbtn);
	}

	public void GotoReoportsPage() {
		WebElement AppLauncher = locateElement("xpath", "//div[@class='slds-icon-waffle']");
		click(AppLauncher);
		WebElement Service = locateElement("xpath", "//p[text()='Service']");
		clickable("xpath", "//p[text()='Service']");
		click(Service);
		WebElement Reports = locateElement("xpath", "//a[@title='Reports']");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Reports);
		WebElement NewReport = locateElement("xpath", "//div[@title='New Report (Salesforce Classic)']");
		click(NewReport);
//		clickable("xpath","//a[@class='x-tree-node-anchor']//span[text()='Leads']");
//		WebElement Leads = locateElement("xpath","//a[@class='x-tree-node-anchor']//span[text()='Leads']"); 
//		click(Leads);

	}

}
