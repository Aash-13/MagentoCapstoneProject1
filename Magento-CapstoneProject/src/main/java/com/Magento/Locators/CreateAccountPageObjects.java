package com.Magento.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPageObjects {
	@FindBy(xpath="//input[@id='firstname']")
	public WebElement firstName;
	
	@FindBy(xpath="//input[@id='lastname']")
	public WebElement lastName;
	
	@FindBy(xpath="//input[@id='email_address']")
	public WebElement email;
	
	@FindBy(xpath="//input[@id='password']")
	public WebElement password;
	
	@FindBy(xpath="//input[@id='password-confirmation']")
	public WebElement confirmPassword;
	
	@FindBy(xpath="//button[@title='Create an Account']")
	public WebElement createAccount;
	
	@FindBy(xpath="//div[@id='email_address-error']")
	public WebElement registerEmailError;
}
