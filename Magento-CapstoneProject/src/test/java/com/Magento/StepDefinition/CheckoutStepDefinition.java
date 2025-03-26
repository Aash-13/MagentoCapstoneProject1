package com.Magento.StepDefinition;

import org.testng.Assert;

import com.Magento.Pages.CheckoutPage;
import com.Magento.Pages.HomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CheckoutStepDefinition {
	CheckoutPage CheckoutPage=new CheckoutPage();
	HomePage HomePage=new HomePage();
	@And("User Click Proceed to Checkout on Cart Icon")
	public void user_click_proceed_to_checkout_on_cart_icon() {
	    HomePage.clickCartIcon();
	    CheckoutPage.clickCheckout();
	}
	@And("User Click on NewAddress")
	public void user_click_on_new_address() {
	    CheckoutPage.clickNewAddress();
	}
	@When("User Enter {string} Address")
	public void user_enter_address(String string) {
		CheckoutPage.enterAddress(string);
	}

	@When("User Enter {string} City")
	public void user_enter_city(String string) {
		CheckoutPage.enterCity(string);
	}

	@When("User Selects {string} Country")
	public void user_selects_country(String string) {
		CheckoutPage.selectCountry(string);
	}

	@When("User Selects {string} State")
	public void user_selects_state(String string) {
		CheckoutPage.selectState(string);
	}

	@When("User Enter invalid {string} PostalCode")
	public void user_enter_invalid_postal_code(String string) {
		CheckoutPage.enterPostalCode(string);
	}

	@When("User Enter {string} MobileNumber")
	public void user_enter_mobile_number(String string) {
		CheckoutPage.enterMobileNumber(string);
	}

	@And("User Verify Any Error Message")
	public void user_verify_any_error_message() {
		Assert.assertEquals(CheckoutPage.errorMessage(), "Provided Zip/Postal Code seems to be invalid. Example: 123456. If you believe it is the right one you can ignore this notice.");
	}

	@When("User reenters valid {string} PostalCode")
	public void user_reenters_valid_postal_code(String string) {
		CheckoutPage.enterPostalCode(string);
	}

	@And("User Places Order")
	public void user_places_order() {
		CheckoutPage.shiphere();
		CheckoutPage.clickNext();
	    CheckoutPage.placeOrder();
	}

	@And("User Verify order confirmation message is displayed")
	public void user_verify_order_confirmation_message_is_displayed() {
		Assert.assertEquals(CheckoutPage.verifyOrderMessage(), "Checkout");
	}

}
