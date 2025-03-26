package com.Magento.Pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.Magento.Browser.*;
import com.Magento.Locators.CreateAccountPageObjects;
import com.aventstack.extentreports.Status;

public class CreateAccountPage extends Browser{
	static CreateAccountPageObjects obj1;        //declare PageFactory Object
	
	//Code for FirstName in CreateAccount page
	public static void firstName(String data) {
		obj1=PageFactory.initElements(driver, CreateAccountPageObjects.class);
		logger1=extent.createTest("Enter FirstName");
		logger1.log(Status.INFO, "Entered FirstName");
		try
		{
			wait.until(ExpectedConditions.visibilityOf(obj1.firstName));
			obj1.firstName.sendKeys(data);
			logger1.log(Status.PASS, "Entering FirstName");
		}
		catch(Exception e)
		{
			System.out.println("CreateAccountPage-While Entering FirstName");
			logger1.log(Status.FAIL, "Failed Entering FirstName");
		}
		extent.flush();
	}
	//Code for LastName in CreateAccount page
	public static void lastName(String data) {
		logger1=extent.createTest("Enter LastName");
		logger1.log(Status.INFO, "Entering LastName");
		try
		{
			wait.until(ExpectedConditions.visibilityOf(obj1.lastName));
			obj1.lastName.sendKeys(data);
			logger1.log(Status.PASS, "Entered LastName");
		}
		catch(Exception e)
		{
			System.out.println("CreateAccountPage-While Entering LastName");
			logger1.log(Status.FAIL, "Failed Entering LastName");
		}
		extent.flush();
	}
	//Code for Email in CreateAccount page
	public static void Email(String data) {
		logger1=extent.createTest("Enter Email");
		logger1.log(Status.INFO, "Entering Email");
		try
		{
			wait.until(ExpectedConditions.visibilityOf(obj1.email));
			obj1.email.clear();
			obj1.email.sendKeys(data);
			logger1.log(Status.PASS, "Entered Email");
		}
		catch(Exception e)
		{
			System.out.println("CreateAccountPage-While Entering Email");
			logger1.log(Status.FAIL, "Failed Entering Email");
		}
		extent.flush();
	}
	//Code for Password in CreateAccount page
	public static void password(String data) {
		logger1=extent.createTest("Enter Password");
		logger1.log(Status.INFO, "Entering Password");
		try
		{
			wait.until(ExpectedConditions.visibilityOf(obj1.password));
			obj1.password.sendKeys(data);
			logger1.log(Status.PASS, "Entered Password");
		}
		catch(Exception e)
		{
			System.out.println("CreateAccountPAge-While Entering Password");
			logger1.log(Status.FAIL, "Failed Entering Password");
		}
		extent.flush();
	}
	//Code for ConfirmPassword in CreateAccount page
	public static void confirmPassword(String data) {
		logger1=extent.createTest("Enter ConfirmPassword");
		logger1.log(Status.INFO, "Entering ConfirmPassword");
		try
		{
			wait.until(ExpectedConditions.visibilityOf(obj1.confirmPassword));
			obj1.confirmPassword.sendKeys(data);
			logger1.log(Status.PASS, "Entered ConfirmPassword");
		}
		catch(Exception e)
		{
			System.out.println("CreateAccountPAge-While Entering ConfirmPassword");
			logger1.log(Status.FAIL, "Failed Entering ConfirmPassword");
		}
		extent.flush();
	}
	//Code for Clicking on CreateAccountButton in CreateAccount page
	public static void createAccountButton() {
		logger1=extent.createTest("Click on CreateAccount");
		logger1.log(Status.INFO, "Clicking on Create Account");
		try
		{
			wait.until(ExpectedConditions.elementToBeClickable(obj1.createAccount));
			//js.executeScript("arguments[0].click()",obj1.createAccount);
			obj1.createAccount.click();
			logger1.log(Status.PASS, "Clicked on CreateAccountButton");
			
		}
		catch(Exception e)
		{
			System.out.println("CreateAccountPAge-While Clicking on CreateAccount Button");
			logger1.log(Status.FAIL, "Failed Clicking on CreateAccountButton");
		}
		extent.flush();
	}
	//Code for Emailerror 
	public static String RegisterEmailError() {
		logger1=extent.createTest("Check emailerror in CreateAccount");
		logger1.log(Status.INFO, "Checking emailerror in CreateAccount");
		try
		{
			wait.until(ExpectedConditions.visibilityOf(obj1.registerEmailError));
			logger1.log(Status.PASS, "Passesd Checking email error");
		}
		catch(Exception e)
		{
			System.out.println("Please enter a valid email address (Ex: johndoe@domain.com).");
			logger1.log(Status.FAIL, "Failed Checking emailerror");
		}
		extent.flush();
		return obj1.registerEmailError.getText(); //Please enter a valid email address (Ex: johndoe@domain.com).
	}
}
