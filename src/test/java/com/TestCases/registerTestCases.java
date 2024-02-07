package com.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Resources.baseClass;
import com.Resources.commonMethods;
import com.Resources.constants;

import PageObjectModel.registerPageObjects;

public class registerTestCases extends baseClass {



	@Test
	public void verifyValidRegisteration() throws IOException {
		

		registerPageObjects rpo = new registerPageObjects(driver);

		rpo.clickOnRegister().click();

		rpo.selectGender().click();

		rpo.enterFirstName().sendKeys(constants.firstName);

		rpo.enterLastName().sendKeys(constants.lastName);

		rpo.enterEmail().sendKeys(email); 

		rpo.enterPassword().sendKeys(constants.password);

		rpo.enterConfrimPassword().sendKeys(constants.confirmPassword);

		rpo.clickOnsubmit().click();
	
		commonMethods.handleAssertion(constants.registerValidExpectedText, rpo.successText().getText());

	}

	@Test
	public void verifyInValidRegisteration() throws IOException {

		registerPageObjects rpo = new registerPageObjects(driver);

		rpo.clickOnRegister().click();

		rpo.selectGender().click();

		rpo.enterFirstName().sendKeys(constants.firstName);

		rpo.enterLastName().sendKeys(constants.lastName);

		rpo.enterEmail().sendKeys(constants.invalidEmail);

		rpo.enterPassword().sendKeys(constants.password);

		rpo.enterConfrimPassword().sendKeys(constants.confirmPassword);

		rpo.clickOnsubmit().click();
	
		commonMethods.handleAssertion( constants.registerInValidExpectedText,  rpo.invalidEmailText().getText());
		
	}
}
