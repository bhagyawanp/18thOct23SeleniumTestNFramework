package com.TestCases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Resources.baseClass;
import com.Resources.constants;

import PageObjectModel.productCartPageObjects;

public class productCartTestCases extends baseClass {

	@Test
	public void verifyProductPrice() throws IOException {

		productCartPageObjects pco = new productCartPageObjects(driver);

		pco.searchItem().sendKeys(constants.product);
		pco.clickOnSearch().click();

		List<WebElement> product = pco.chooseProduct();
		List<WebElement> price = pco.choosePrice();

		List<WebElement> cart = pco.addToCart();
		String pricebeforeCart = "";
		for (int i = 0; i < product.size(); i++) {

			if (product.get(i).getText().equalsIgnoreCase(constants.productName)) {

				pricebeforeCart = price.get(i).getText();
				cart.get(i).click();
				break;

			}

		}

		System.out.println(pricebeforeCart);

		// processor
		// add to cart --
		// capture the message ---
		// click on cross
		// click on shopping cart- on top-
		// capture the total --(after addingto cart)== 800

		// pricebeforeCart ----after addingto cart==

	}

}
