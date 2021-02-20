package com.assessment.pages;

import org.openqa.selenium.WebElement;

public class CreateLeadPage extends ReportPage{

	public void CreateLead() {
		WebElement CreateBtn = locateElement("xpath", "//div[@class='actions']//input[@id='thePage:rtForm:createButton']");
		click(CreateBtn);
		WebElement Range = locateElement("xpath", "//labe[text()='Range']//img[contains(@class,'x-form-trigger x-form-arrow-trigger x-form-trigger-over')]");
		click(Range);
		WebElement AllTime = locateElement("xpath", "//div[text()='All Time']");
		click(AllTime);
	}

}
