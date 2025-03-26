package com.Magento.StepDefinition;

import org.testng.Assert;

import com.Magento.Pages.HomePage;

import io.cucumber.java.en.And;

public class AddMultipleProductsStepDefinition {
	HomePage HomePage=new HomePage();
	@And("User Navigate to the cart page")
	public void user_navigate_to_the_cart_page() {
	    HomePage.clickCartIcon();
	}

	@And("User Verify that the correct products and total price are displayed.")
	public void user_verify_that_the_correct_products_and_total_price_are_displayed() {
	    Assert.assertEquals(HomePage.totalprice(), true);
	}

}
