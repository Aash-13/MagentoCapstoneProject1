package com.Magento.Pages;

import com.Magento.Locators.*;
import com.aventstack.extentreports.Status;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.Magento.Browser.Browser;

public class SigninPage extends Browser{
	SigninPageObjects obj1;
	//Code for Emailbox in signinpage
	public void Email(String data) {
		obj1=PageFactory.initElements(driver, SigninPageObjects.class);
		logger1=extent.createTest("Enter Email in SigninPage");
		logger1.log(Status.INFO, "Entering Email in SigninPage");
		try
		{
			wait.until(ExpectedConditions.visibilityOf(obj1.email));
			obj1.email.clear();
			obj1.email.sendKeys(data);
			logger1.log(Status.PASS, "Entered Email in signin");
		}
		catch(Exception e)
		{
			System.out.println("SigninPage-While Entering Email");
			logger1.log(Status.FAIL, "Failed Entering Email");
		}
		extent.flush();
	}
	//code for Password in signinpage
	public void Password(String data) {
		logger1=extent.createTest("Enter Password in SigninPage");
		logger1.log(Status.INFO, "Entering Password in SignPage");
		try
		{
			wait.until(ExpectedConditions.visibilityOf(obj1.password));
			obj1.password.sendKeys(data);
			logger1.log(Status.PASS, "Entered Password in signin");
		}
		catch(Exception e)
		{
			System.out.println("SigninPage-While Entering Password");
			logger1.log(Status.FAIL, "Failed Entering Password");
		}
		extent.flush();
	}
	//code for signinButton 
	public  void SigninButton() {
		obj1=PageFactory.initElements(driver, SigninPageObjects.class);
		logger1=extent.createTest("Click on SigninButton");
		logger1.log(Status.INFO, "Clicking on SigninButon");
		try
		{
			wait.until(ExpectedConditions.elementToBeClickable(obj1.signinbutton));
			obj1.signinbutton.click();
			logger1.log(Status.PASS, "Clicking on SigninButon");
		}
		catch(Exception e)
		{
			System.out.println("SigninPage-While Clicking on SigninButton");
			logger1.log(Status.FAIL, "Failed Clicking on signinbutton");
		}
		extent.flush();
	}
	//code for mailerror while signing in
	public String SignInErrorEmail() {
		logger1=extent.createTest("Verify emailerror in signin");
		logger1.log(Status.INFO, "Verifying emailerror in signin");
		try
		{
			wait.until(ExpectedConditions.visibilityOf(obj1.signinEmailError));
			logger1.log(Status.PASS, "Verifying emailerror in signin");
		}
		catch(Exception e)
		{
			System.out.println("SigninPage-While Checking Email Error");
			logger1.log(Status.FAIL, "Failed Verifying emailerror in signin");
		}
		extent.flush();
		return obj1.signinEmailError.getText();
	}
	//code for search box dynamically
	public void SearchBox(String data) {
		obj1=PageFactory.initElements(driver, SigninPageObjects.class);
		logger1=extent.createTest("Enter text in searchbox");
		logger1.log(Status.INFO, "Enter text in searchbox");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(obj1.searchBox));
			obj1.searchBox.sendKeys(data);
			logger1.log(Status.PASS, "Entered text in searchbox");
		}catch(Exception e)
		{
			System.out.println("SigninPage-While Searching for Product");
			logger1.log(Status.FAIL, "Failed to enter text in searchbox");
		}
	}
	//code for available search box list 
	public void SearchBoxList(String data) {
		obj1=PageFactory.initElements(driver, SigninPageObjects.class);
		logger1=extent.createTest("Select and Search from List displayed");
		logger1.log(Status.INFO, "Selected From List displayed");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@role='listbox']/li")));
			for(int i=0;i<obj1.searchList.size();i++) {
				if(obj1.searchList.get(i).getText().contains(data))
				{
					obj1.searchList.get(i).click();
					break;
				}
			}
			logger1.log(Status.PASS, "selected from list displayed");
			
		}catch(Exception e){
			System.out.println("SigninPage-While Selecting Product from List");
			logger1.log(Status.FAIL, "Failed to select from list");
		}
	}
}
