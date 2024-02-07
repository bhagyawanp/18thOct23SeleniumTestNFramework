package com.TestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Resources.baseClass;
import com.Resources.commonMethods;
import com.Resources.constants;

import PageObjectModel.loginPageObjects;

public class loginTestCases extends baseClass {

	@Test(dependsOnMethods = "verifyValidRegisteration")
	public void verifyValidLogin() throws IOException, InterruptedException {

		loginPageObjects lpo = new loginPageObjects(driver);

		lpo.clickOnlogIn().click();

		lpo.enterEmail().sendKeys(email);

		lpo.enterPassword().sendKeys(constants.LoginvalidPassword);

		lpo.clickSubmit().click();

		commonMethods.handleExplicitWAit(driver, 2, lpo.logOutText());
	
		commonMethods.handleAssertion(constants.loginValidExpectedTest, lpo.logOutText().getText());
	}

	@Test
	public void verifyInValidLogin() throws IOException {

		loginPageObjects lpo = new loginPageObjects(driver);

		lpo.clickOnlogIn().click();

		lpo.enterEmail().sendKeys(email); // abc123@gmail.cpm

		lpo.enterPassword().sendKeys(constants.LogininValidPassword);
		
		commonMethods.handleExplicitWAit(driver, 3,lpo.clickSubmit());
	

		lpo.clickSubmit().click();
		
		commonMethods.handleAssertion(constants.LogininValidExpectedTest,  lpo.invalidCredientialsText().getText());
		
	
	}

}
