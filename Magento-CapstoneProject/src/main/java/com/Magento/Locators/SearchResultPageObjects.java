package com.Magento.Locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class SearchResultPageObjects {
	@FindAll(@FindBy(xpath="//ol/li/div/div/strong/a"))
	@CacheLookup
	public List<WebElement> selectProductList;
	
	@FindAll(@FindBy(xpath="//div[@id='product-options-wrapper']/div/div/div[1]/div/div"))
	public List<WebElement> sizeList;
	
	@FindAll(@FindBy(xpath="//div[@id='product-options-wrapper']/div/div/div[2]/div/div"))
	public List<WebElement> colorList;
	
	@FindBy(xpath="//input[@id='qty']")
	public WebElement quantity;
	
	@FindBy(xpath="//button[@id='product-addtocart-button']")
	public WebElement addToCart;
	
	@FindBy(xpath="//main[@id='maincontent']/div[1]/div[2]/div/div/div")
	public WebElement verifyAddedToCartMessage;
}
