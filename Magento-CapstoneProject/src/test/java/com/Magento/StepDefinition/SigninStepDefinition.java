package com.Magento.StepDefinition;

import org.testng.Assert;
import com.Magento.Browser.Browser;
import com.Magento.Pages.HomePage;
import com.Magento.Pages.SigninPage;
import com.Magento.Screenshot.CaptureTitle;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class SigninStepDefinition {
	HomePage HomePage=new HomePage();
	SigninPage SigninPage=new SigninPage();
	@And("User Click the link SignIn in homepage")
	public void user_click_the_link_sign_in_in_homepage() throws Exception {
		CaptureTitle.screenShot("Title");
	    HomePage.signInLink();
	}

	@When("User Enter invalid {string} Email")
	public void user_enter_invalid_email(String string) {
	    SigninPage.Email(string);
	}
	@When("User Enter Sign {string} Password")
	public void user_enter_sign_password(String string) {
	    SigninPage.Password(string);
	}
	@And("User Clicks on Signin button")
	public void user_clicks_on_signin_button() {
	    SigninPage.SigninButton();
	}

	@And("User Verify Error Message is displayed")
	public void user_verify_error_message_is_displayed() {
	    SigninPage.SignInErrorEmail();
	}

	@And("User reenters valid {string} Email")
	public void user_reenters_valid_email(String string) {
		SigninPage.Email(string);
	}

	@When("User Verify that HomePage is displayed")
	public void user_verify_that_home_page_is_displayed() {
	    Assert.assertEquals(HomePage.homePageText(),"Home Page");
	}

	@And("User Closes the Browser")
	public void user_closes_the_browser() throws Exception {
	   Browser.closeBrowser();
	}

}
