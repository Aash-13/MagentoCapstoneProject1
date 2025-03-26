package com.Magento.StepDefinition;

import org.testng.Assert;

import com.Magento.Browser.Browser;
import com.Magento.Pages.CreateAccountPage;
import com.Magento.Pages.HomePage;
import com.Magento.Pages.MyAccountPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistrationStepDefinition {
	HomePage HomePage=new HomePage();       //Creating an instance to access methods from that class
	@Given("User Opens the Browser")
	public void user_opens_the_browser() throws Exception {
		//Browser.init("RegistrationExtentReport");
		//Browser.init("SigninExtentReport");
		//Browser.init("LogoutExtentReport");
		//Browser.init("AddToCartExtentReport");
		Browser.init("CheckoutPageExtentReport");
		//Browser.init("AddMultipleProductsExtentReport");
	    Browser.openBrowser();
	}

	@And("User Navigates to the {string} Webpage")
	public void user_navigates_to_the_webpage(String string) throws Exception {
	   Browser.navigateToUrl(string);
	}

	@Then("User Click the link Create an account")
	public void user_click_the_link_create_an_account() throws Exception {
	   HomePage.createAccountLink();
	}

	@When("User Enter {string} FirstName")
	public void user_enter_first_name(String string) {
	   CreateAccountPage.firstName(string);
	}

	@When("User Enter {string} LastName")
	public void user_enter_last_name(String string) {
	    CreateAccountPage.lastName(string);
	}

	@When("User Enter Invalid {string} Email")
	public void user_enter_email(String string) {
		CreateAccountPage.Email(string);
	}

	@When("User Enter {string} Password")
	public void user_enter_password(String string) {
		CreateAccountPage.password(string);
	}

	@When("User Enter {string} ConfirmPassword")
	public void user_enter_confirm_password(String string) {
		CreateAccountPage.confirmPassword(string);
	}

	@Then("User Click on the button Create an Account")
	public void user_click_on_the_button_create_an_account() {
		CreateAccountPage.createAccountButton();
	}

	@And("User Verify Error message apperaed")
	public void user_verify_error_message_apperaed() {
		Assert.assertEquals(CreateAccountPage.RegisterEmailError(), "Please enter a valid email address (Ex: johndoe@domain.com).");
	}

	@And("User reenters Valid {string} Email")
	public void user_reenters_email(String string) {
		CreateAccountPage.Email(string);
	}

	@Then("User Verify Successfully registered or not")
	public void user_verify_successfully_registered_or_not() {
	    Assert.assertEquals(MyAccountPage.successfullyRegistered(), "Thank you for registering with Main Website Store.");
	}

	@Then("User Closes the browser")
	public void user_closes_the_browser() throws Exception {
	   Browser.closeBrowser();
	}

}
