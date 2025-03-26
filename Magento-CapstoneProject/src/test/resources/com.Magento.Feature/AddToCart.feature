Feature:
Scenario Outline: Login, Product Search and Add to Cart
Given User Opens the Browser
And User Navigates to the "https://magento.softwaretestingboard.com/" Webpage
And User Click the link SignIn in homepage
And User Enter the required details to Login
|SignIn Credentials.xlsx|
And User Clicks on Signin button
And User Search for a '<Name>' Product
And User Select autosuggestion '<AutoSuggested>' from List displayed
And User Select Product '<Product1>' in nextpage
And User Selects the Size,Color,Quantity in Search result page
|ProductDetails.xlsx|
And User Click on Add to Cart
And User Verify that the product is added to the cart
And User Closes the Browser
Examples:
|Name|AutoSuggested|Product1|
|Shirts|men|Jacket|