package com.Magento.Pages;

import com.Magento.Locators.*;
import com.Magento.Screenshot.CaptureTitle;
import com.aventstack.extentreports.Status;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.Magento.Browser.*;

public class HomePage extends Browser{
	public HomePageObjects obj1;
	//code for clicking on create account link
	public void createAccountLink(){
		obj1 = PageFactory.initElements(driver, HomePageObjects.class);
		logger1=extent.createTest("Click on CreateAccountLink");
		logger1.log(Status.INFO, "Clicking on CreateAccountlink");
		try
		{
			wait.until(ExpectedConditions.elementToBeClickable(obj1.createAccountLink));
			obj1.createAccountLink.click();
			logger1.log(Status.PASS, "Clickng on CreateAccountLink");
		}
		catch(Exception e)
		{
			System.out.println("HomePage-While Clicking on CreateAccountLink");
			logger1.log(Status.FAIL, "Failed Clicking on CreateAccountLink");
		}
		extent.flush();
	}
	//code for clicking on signin link
	public void signInLink() throws Exception {
		obj1 = PageFactory.initElements(driver, HomePageObjects.class);
		logger1.addScreenCaptureFromPath(CaptureTitle.screenShot("Title"));
		logger1=extent.createTest("Click on SigninLink");
		logger1.log(Status.INFO, "Clicking on SigninLink");//object has to reintialize in this method because as the page is refreshing it says that object is null pointer,so need to reinitialize to avoid that in other cases as we are working in same page no need to reinitialize object in every method
		try {
			wait.until(ExpectedConditions.elementToBeClickable(obj1.signInLink));
			obj1.signInLink.click();
			logger1.log(Status.PASS, "Clickng on SigninLink");
		}catch(Exception e)
		{
			System.out.println("HomePage-While Clicking on Signin Link");
			logger1.log(Status.FAIL, "Failed Clicking on SigninLink");
		}
		extent.flush();
	}
	//code for verifing HomePage Text after signing in
	public String homePageText() {
		logger1=extent.createTest("Verify HomePage Message");
		logger1.log(Status.INFO, "Verifying HomePage Message");
		try {
			wait.until(ExpectedConditions.visibilityOf(obj1.homePageText));
			logger1.log(Status.PASS, "Verifying Homepage Message");
		}catch(Exception e)
		{
			System.out.println("HomePage-While Clicking on Signin Link");
			logger1.log(Status.FAIL, "Failed verifying HomePage Message");
		}
		extent.flush();
		return obj1.homePageText.getText();
	}
	//code for clicking dropdown to logout
	public void dropDown() {
		logger1=extent.createTest("Click on dropdown");
		logger1.log(Status.INFO, "Clicking on dropdown");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(obj1.dropdown));
			obj1.dropdown.click();
			logger1.log(Status.PASS, "Clickng on dropdown");
		}catch(Exception e)
		{
			System.out.println("HomePage-While Clicking on Dropdown");
			logger1.log(Status.FAIL, "Failed Clickng on dropdown");
		}
		extent.flush();
	}
	//code for clicking on signout after logging in
	public void signOut() {
		logger1=extent.createTest("Click on signout");
		logger1.log(Status.INFO, "clicking on signout");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(obj1.SignOut));
			obj1.SignOut.click();
			logger1.log(Status.PASS, "Clickng on signout");
		}catch(Exception e)
		{
			System.out.println("HomePage-While Clicking on SignOut");
			logger1.log(Status.FAIL, "Failed Clickng on signout");
		}
		extent.flush();
	}
	//code for clicking on cart icon 
	public void clickCartIcon() {
		obj1 = PageFactory.initElements(driver, HomePageObjects.class);
		logger1=extent.createTest("Click on Carticon");
		logger1.log(Status.INFO, "Clicking on carticon");
		try
		{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//header/div[2]/div[1]/a/span[2]")));
			//wait.until(ExpectedConditions.elementToBeClickable(obj1.cartIcon));
			obj1.cartIcon.click();
			logger1.log(Status.PASS, "Clickng on Carticon");
		}
		catch(Exception e)
		{
			System.out.println("HomePage - While clicking on cart icon");
			logger1.log(Status.FAIL, "Failed Clickng on Carticon");
		}
		extent.flush();
	}
	//code for verifying total price is displayed or not after clicking on carticon
	public boolean totalprice() {
		logger1=extent.createTest("Verify total price displayed or not");
		logger1.log(Status.INFO, "Verify Total Price");
		try {
			wait.until(ExpectedConditions.visibilityOf(obj1.totalPrice));
			logger1.log(Status.PASS, "Verified Total Price Displayed");
		}catch(Exception e) {
			System.out.println("HomePage - While Verifying totalprice");
			logger1.log(Status.FAIL, "Failed Verifying Total Price");
		}
		return obj1.totalPrice.isDisplayed();
	}
}
