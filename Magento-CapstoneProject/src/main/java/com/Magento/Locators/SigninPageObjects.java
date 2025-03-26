package com.Magento.Locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class SigninPageObjects {
	@FindBy(xpath="//input[@id='email']")
	public WebElement email;
	
	@FindBy(xpath="//input[@id='pass']")
	public WebElement password;
	
	@FindBy(xpath="//fieldset[@class='fieldset login']/div/div[@class='primary']/button[@id='send2']")
	public WebElement signinbutton;
	
	@FindBy(xpath="//div[@id='email-error']")
	public WebElement signinEmailError;
	
	@FindBy(xpath="//input[@id='search']") 
	public WebElement searchBox;
	
	@FindAll(@FindBy(xpath="//ul[@role='listbox']/li"))
	@CacheLookup
	public List<WebElement> searchList;
}
