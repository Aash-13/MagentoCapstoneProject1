Feature:
Scenario Outline: Checkout Process with Valid and Invalid Data Handling
Given User Opens the Browser
And User Navigates to the "https://magento.softwaretestingboard.com/" Webpage
And User Click the link SignIn in homepage
And User Enter the required details to Login
|SignIn Credentials.xlsx|
And User Clicks on Signin button
And User Click Proceed to Checkout on Cart Icon
And User Click on NewAddress
When User Enter '<Address>' Address
When User Enter '<City>' City
When User Selects '<Country>' Country
When User Selects '<State>' State
When User Enter invalid '<InvalidPostalCode>' PostalCode
When User Enter '<MobileNumber>' MobileNumber
And User Verify Any Error Message 
When User reenters valid '<ValidPostalCode>' PostalCode 
And User Places Order
And User Verify order confirmation message is displayed
And User Closes the Browser
Examples:
|Address|City|Country|State|InvalidPostalCode|MobileNumber|ValidPostalCode|
|25-645-7,Parthasarathi Nagar|Dharmavaram|India|Andhra Pradesh|1234|7569366716|515671|

