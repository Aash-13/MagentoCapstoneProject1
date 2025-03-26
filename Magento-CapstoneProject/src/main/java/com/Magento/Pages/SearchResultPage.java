package com.Magento.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.Magento.Browser.Browser;
import com.Magento.Locators.SearchResultPageObjects;
import com.aventstack.extentreports.Status;

public class SearchResultPage extends Browser{
	SearchResultPageObjects obj1;
	JavascriptExecutor js=(JavascriptExecutor)driver;
	//code for selecting product after searching
	public void SelectProduct(String data) {
		obj1=PageFactory.initElements(driver, SearchResultPageObjects.class);
		logger1=extent.createTest("Select product");
		logger1.log(Status.INFO, "Select Product");
		try
		{
			//wait.until(ExpectedConditions.visibilityOfAllElements(obj1.selectProductList));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[3]/div[1]/div[2]/div[2]/ol/li")));
			for(int i=0;i<obj1.selectProductList.size();i++) {
				if(obj1.selectProductList.get(i).getText().contains(data))
				{
					System.out.println(obj1.selectProductList.get(i).getText());
					js.executeScript("arguments[0].scrollIntoView(true);", obj1.selectProductList.get(i));
					js.executeScript("arguments[0].click()",obj1.selectProductList.get(i));
					break;
				}
			}
			logger1.log(Status.PASS, "Selected Product");
		}
		catch(Exception e)
		{
			System.out.println("SearchResultPage-While Selecting a Product.");
			logger1.log(Status.FAIL, "Failed Selecting Product");
		}
	}
	//code for selecting size for selected product
	public void selectSize(String data) {
		logger1=extent.createTest("Select size");
		logger1.log(Status.INFO, "Select size");
		try
		{

			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='product-options-wrapper']/div/div/div[1]/div/div")));
			for(int i=0;i<obj1.sizeList.size();i++) {
				if(obj1.sizeList.get(i).getText().equalsIgnoreCase(data))
				{
					js.executeScript("arguments[0].click()",obj1.sizeList.get(i));
					break;
				}
			}
			logger1.log(Status.PASS, "Select Size");
		}
		catch(Exception e)
		{
			System.out.println("SearchResultPage-While Selecting a Size.");
			logger1.log(Status.FAIL, "Failed Selecting Size");
		}
	}
	//code for selecting color for selected product
	public void selectColor(String data) {
		logger1=extent.createTest("Select color");
		logger1.log(Status.INFO, "select color");
		try
		{
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='product-options-wrapper']/div/div/div[2]/div/div")));
			for(int i=0;i<obj1.colorList.size();i++) {
				if(obj1.colorList.get(i).getDomAttribute("option-label").equalsIgnoreCase(data))
				{
					js.executeScript("arguments[0].click()",obj1.colorList.get(i));
					break;
				}
			}
			logger1.log(Status.PASS, "Select color");
		}
		catch(Exception e)
		{
			System.out.println("SearchResultPage-While Selecting a Color.");
			logger1.log(Status.FAIL, "Failed Selecting Color");
		}
	}
	//code for entering quantity for selected product
	public void enterQuantity(String data) {
		logger1=extent.createTest("Enter Quantity");
		logger1.log(Status.INFO, "Entered Quantity");
		try
		{
			wait.until(ExpectedConditions.visibilityOf(obj1.quantity));
			obj1.quantity.clear();
			obj1.quantity.sendKeys(data);
			logger1.log(Status.PASS, "Entered Quantity");
		}
		catch(Exception e)
		{
			System.out.println("SearchResultPage-While Entering Quantity.");
			logger1.log(Status.FAIL, "Failed Entering Quantity");
		}
	}
	//code for adding product to cart
	public void addToCart() {
		logger1=extent.createTest("Click on Add to cart");
		logger1.log(Status.INFO, "Click on Add to cart");
		try
		{
			wait.until(ExpectedConditions.elementToBeClickable(obj1.addToCart));
			obj1.addToCart.click();
			logger1.log(Status.PASS, "Click on Add to cart");
		}
		catch(Exception e)
		{
			System.out.println("SearchResultPage-While Clicking on Add to Cart.");
			logger1.log(Status.FAIL, "Failed Adding to cart");
		}
	}
	//code for verifying whether product added to cart or not
	public boolean verifyAddedToCartMessage() {
		logger1=extent.createTest("Verify message after adding to cart");
		logger1.log(Status.INFO, "Verify message after adding to cart");
		try
		{
			wait.until(ExpectedConditions.visibilityOf(obj1.verifyAddedToCartMessage));
			logger1.log(Status.PASS, "Verify message after adding to cart");
		}
		catch(Exception e)
		{
			System.out.println("SearchResultPage-While Verifying Cart Message.");
			logger1.log(Status.FAIL, "Failed Verifying message after adding to cart");
		}
		return obj1.verifyAddedToCartMessage.isDisplayed();
	}
}
