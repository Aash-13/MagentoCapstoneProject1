package com.Magento.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPageObjects {
	@FindBy(xpath="//button[@id='top-cart-btn-checkout']")
	public WebElement checkoutbutton;
	
	@FindBy(xpath="//div[@id='checkout-step-shipping']/div[2]/button")
	public WebElement newAddress;
	
	@FindBy(xpath="//fieldset/div/div[1]/div/input")
	public WebElement address;                           
	
	@FindBy(xpath="//form/div/div[4]/div/input")
	public WebElement city;
	
	@FindBy(xpath="//form/div/div[9]/div/input")
	public WebElement mobilenumber;
	
	@FindBy(xpath="//form/div/div[7]/div/input")
	public WebElement postalCode;
	
	@FindBy(xpath="//form/div/div[8]/div/select")
	public WebElement country;
	
	@FindBy(xpath="//div[7]/div/div/span")
	public WebElement errorMessage;
	
	@FindBy(xpath="//form/div/div[5]/div/select")
	public WebElement state;
	
	@FindBy(xpath="//div[2]/footer/button[1]")
	public WebElement shiphere;
	
	@FindBy(xpath="//div[@id='shipping-method-buttons-container']/div/button")
	public WebElement Next;
	
	@FindBy(xpath="//div[4]/div/button")
	public WebElement placeOrder;
	
	@FindBy(xpath="//main[@id='maincontent']/div[1]/h1/span")
	public WebElement verifyOrderMessage;
}
