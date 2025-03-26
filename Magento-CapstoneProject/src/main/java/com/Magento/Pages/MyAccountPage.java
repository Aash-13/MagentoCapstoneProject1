package com.Magento.Pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.Magento.Browser.Browser;
import com.Magento.Locators.MyAccountPageObjects;
import com.aventstack.extentreports.Status;

public class MyAccountPage extends Browser{
	static MyAccountPageObjects obj1;
	//code for successfully registered message after clicking on create account
	public static String successfullyRegistered() {
		obj1=PageFactory.initElements(driver, MyAccountPageObjects.class);
		logger1=extent.createTest("Verify Successfully Registered Message");
		logger1.log(Status.INFO, "Verifying Successfully Registered Message");
		try
		{
			wait.until(ExpectedConditions.visibilityOf(obj1.ThankYouForRegistering));
			logger1.log(Status.PASS, "Verifying Successfully Registered Message");
		}
		catch(Exception e)
		{
			System.out.println("MyAccountPage-While checking Successfully Registered");
			logger1.log(Status.FAIL, "Failed Verifying Successfully Registered Message");
		}
		extent.flush();
		return obj1.ThankYouForRegistering.getText();              //Thank you for registering with Main Website Store.
	}
	//code for checking message that user successfully logged in
	public static String MyAccount() {
		logger1=extent.createTest("Verify MyAccount Text");
		logger1.log(Status.INFO, "Verifying MyAccount Text");
		try
		{
			wait.until(ExpectedConditions.visibilityOf(obj1.myAccount));
			logger1.log(Status.PASS, "Verifying MyAccount Text");
		}
		catch(Exception e)
		{
			System.out.println("MyAccountPage-While checking Text User Successfully Logged in");
			logger1.log(Status.FAIL, "Failed Verifying MyAccount Text");
		}
		extent.flush();
		return obj1.myAccount.getText();
	}
}
