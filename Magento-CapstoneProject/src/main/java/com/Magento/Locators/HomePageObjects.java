package com.Magento.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObjects {
	@FindBy(linkText="Create an Account")
	public WebElement createAccountLink;
	
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[2]/a")
	public WebElement signInLink;
	
	@FindBy(xpath="//div[1]/h1/span")
	public WebElement homePageText;
	
	@FindBy(xpath="//header/div[1]/div/ul/li[2]/span/button")
	public WebElement dropdown;
	
	@FindBy(xpath="//header/div[1]/div/ul/li[2]/div/ul/li[3]/a")
	public WebElement SignOut;
	
	@FindBy(xpath="//header/div[2]/div[1]/a")
	public WebElement cartIcon;
	
	@FindBy(xpath="//div[2]/div[2]/div/span/span")
	public WebElement totalPrice;
}
