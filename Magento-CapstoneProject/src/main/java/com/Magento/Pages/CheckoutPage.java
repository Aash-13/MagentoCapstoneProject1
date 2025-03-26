package com.Magento.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.Magento.Browser.Browser;
import com.Magento.Locators.CheckoutPageObjects;
import com.aventstack.extentreports.Status;

public class CheckoutPage extends Browser{
	CheckoutPageObjects obj1;
	JavascriptExecutor js=(JavascriptExecutor)driver;
	//Code for clicking on checkout button after adding to cart
	public void clickCheckout() {
		obj1=PageFactory.initElements(driver, CheckoutPageObjects.class);
		logger1=extent.createTest("Click checkout after clicking on carticon");
		logger1.log(Status.INFO, "Click checkout");
		try
		{
			wait.until(ExpectedConditions.elementToBeClickable(obj1.checkoutbutton));
			obj1.checkoutbutton.click();
			logger1.log(Status.PASS, "Clicked on Checkout Successfully");
		}
		catch(Exception e)
		{
			System.out.println("CheckoutPage - While clicking on Checkout");
			logger1.log(Status.FAIL, "Failed clicking on checkout button");
		}
		extent.flush();
	}
	
	//code for entering address after clicking on checkout
	public void enterAddress(String data) {
		logger1=extent.createTest("Address");
		logger1.log(Status.INFO, "Enter Address");
		try
		{
			wait.until(ExpectedConditions.visibilityOf(obj1.address));
			obj1.address.sendKeys(data);
			logger1.log(Status.PASS, "Address Entered Successfully");
		}
		catch(Exception e)
		{
			System.out.println("CheckoutPage - While entering address");
			logger1.log(Status.FAIL, "Failed Entering Address");
		}
		extent.flush();
	}
	
	//code for entering city after clicking on checkout
	public void enterCity(String data) {
		logger1=extent.createTest("City");
		logger1.log(Status.INFO, "Select city");
		try
		{
			wait.until(ExpectedConditions.visibilityOf(obj1.city));
			//js.executeScript("arguments[0].value=arguments[1];", obj1.city, data);
			obj1.city.sendKeys(data);
			logger1.log(Status.PASS, "Entered city Successfully");
		}
		catch(Exception e)
		{
			System.out.println("CheckoutPage - While entering city");
			logger1.log(Status.FAIL, "Failed Entering city");
		}
		extent.flush();
	}
	
	//code for entering mobilenumber after clicking on checkout
	public void enterMobileNumber(String data) {
		logger1=extent.createTest("MobileNumber");
		logger1.log(Status.INFO, "Enter mobilenumber");
		try
		{
			wait.until(ExpectedConditions.visibilityOf(obj1.mobilenumber));
			obj1.mobilenumber.sendKeys(data);
			logger1.log(Status.PASS, "MobileNumber Entered SUccessfully");
		}
		catch(Exception e)
		{
			System.out.println("CheckoutPage - While entering mobilenumber");
			logger1.log(Status.FAIL, "Failed Entering Mobilenumber");
		}
		extent.flush();
	}
	//code for entering zip/postalcode after clicking on checkout
	public void enterPostalCode(String data) {
		logger1=extent.createTest("Postalcode");
		logger1.log(Status.INFO, "Enter Postalcode");
		try
		{
			wait.until(ExpectedConditions.visibilityOf(obj1.postalCode));
			obj1.postalCode.clear();
			obj1.postalCode.sendKeys(data);
			logger1.log(Status.PASS, "Postalcode Entered SUccessfully");
		}
		catch(Exception e)
		{
			System.out.println("CheckoutPage - While entering postalcode");
			logger1.log(Status.FAIL, "Failed Entering postalcode");
		}
		extent.flush();
	}
	//code for selecting country after clicking on checkout
	public void selectCountry(String data) {
		logger1=extent.createTest("Country");
		logger1.log(Status.INFO, "select country");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(obj1.country));
			Select selectcountry=new Select(obj1.country);
			selectcountry.selectByVisibleText(data);
			logger1.log(Status.PASS, "Selected country  Successfully");
		}catch(Exception e) {
			System.out.println("CheckoutPage - While selecting country");
			logger1.log(Status.FAIL, "Failed selecting country");
		}
		extent.flush();
	}
	//code for selecting state after clicking on checkout
	public void selectState(String data) {
		logger1=extent.createTest("State");
		logger1.log(Status.INFO, "Select state");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(obj1.state));
			Select selectstate=new Select(obj1.state);
			selectstate.selectByVisibleText(data);
			logger1.log(Status.PASS, "Selected state Successfully");
		}catch(Exception e) {
			System.out.println("CheckoutPage - While selecting state");
			logger1.log(Status.FAIL, "Failed selecting state");
		}
		extent.flush();
	}
	//code for clicking on next button after entering details
	public  void clickNext() {
		logger1=extent.createTest("Click Next");
		logger1.log(Status.INFO, "Click on next");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(obj1.Next));
			js.executeScript("arguments[0].click()",obj1.Next);
			logger1.log(Status.PASS, "Clicked on next button Sccessfully");
		}
		catch(Exception e)
		{
			System.out.println("CheckoutPage - While clicking on nextbutton");
			logger1.log(Status.FAIL, "Failed clicking on next");
		}
		extent.flush();
	}
	//code for clicking on placeorder button after entering details
	public void placeOrder() {
		logger1=extent.createTest("Click on placeorder");
		logger1.log(Status.INFO, "click on placeorder");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(obj1.placeOrder));
			js.executeScript("arguments[0].click()",obj1.placeOrder);
			logger1.log(Status.PASS, "clicked on placeorder Successfully");
		}
		catch(Exception e)
		{
			System.out.println("CheckoutPage - While clicking on place order button");
			logger1.log(Status.FAIL, "Failed clicking on placeorder");
		}
		extent.flush();
	}
	//code to click on new address and enter new details to place order ,this button appears when you try to login with the same email after once entering address
	public void clickNewAddress() {
		obj1=PageFactory.initElements(driver, CheckoutPageObjects.class);
		logger1=extent.createTest("click on NewAddress");
		logger1.log(Status.INFO, "click on NewAddress");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(obj1.newAddress));
			js.executeScript("arguments[0].scrollIntoView(true);", obj1.newAddress);
			js.executeScript("arguments[0].click()",obj1.newAddress);
			logger1.log(Status.PASS, "Clicked on NewAddress Successfully");
		}
		catch(Exception e)
		{
			System.out.println("CheckoutPage - While clicking on NewAddress button");
			logger1.log(Status.FAIL, "Failed clicking on newaddress");
		}
		extent.flush();
	}
	//code for clicking on shiphere button
	public void shiphere() {
		logger1=extent.createTest("click on Shiphere");
		logger1.log(Status.INFO, "click on Shiphere");
		try {
			wait.until(ExpectedConditions.visibilityOf(obj1.shiphere));
			obj1.shiphere.click();
			logger1.log(Status.PASS, "Clicked on Shiphere Successfully");
		}
		catch(Exception e)
		{
			System.out.println("CheckoutPage - While clicking on Ship here button");
			logger1.log(Status.FAIL, "Failed clicking on shiphere");
		}
		extent.flush();
	}
	//code for verifying error message for postalcode 
	public String errorMessage() {
		logger1=extent.createTest("Verify error message  of postalcode");
		logger1.log(Status.INFO, "Verifying error message  of postalcode");
		try {
			wait.until(ExpectedConditions.visibilityOf(obj1.errorMessage));
			logger1.log(Status.PASS, "Verifying error message Successfully");
		}
		catch(Exception e)
		{
			System.out.println("CheckoutPage - While Checking Error Message");
			logger1.log(Status.FAIL, "Failed verifying error message");
		}
		extent.flush();
		return obj1.errorMessage.getText();
	}
	//code for verifying message after placing order.
	public String verifyOrderMessage() {
		logger1=extent.createTest("Verify ordered message");
		logger1.log(Status.INFO, "Verifying ordered message");
		try {
			wait.until(ExpectedConditions.visibilityOf(obj1.verifyOrderMessage));	
			logger1.log(Status.PASS, "Verifying ordered message Successfully");
		}
		catch(Exception e)
		{
			System.out.println("CheckoutPage - While Verifying Order Confirmation Message");
			logger1.log(Status.FAIL, "Failed verifying order message");
		}
		extent.flush();
		return obj1.verifyOrderMessage.getText();
	}
}
