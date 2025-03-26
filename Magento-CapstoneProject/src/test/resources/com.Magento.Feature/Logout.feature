Feature:
Scenario Outline: Logging Out and Verifying Session End
Given User Opens the Browser
And User Navigates to the "https://magento.softwaretestingboard.com/" Webpage
And User Click the link SignIn
And User Enter the required details to Login
|SignIn Credentials.xlsx|
And User Clicks on Signin button
And User Click Logout from Home Page
And User Verify that the session ends and the user is redirected to the homepage.
And User Closes the Browser