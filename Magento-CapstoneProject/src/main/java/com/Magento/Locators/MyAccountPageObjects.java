package com.Magento.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPageObjects {
	
	@FindBy(xpath="//div[1]/div[2]/div/div/div")
	public WebElement ThankYouForRegistering;
	
	@FindBy(xpath="//div[2]/div[1]/div[1]/h1/span")
	public WebElement myAccount;
}
