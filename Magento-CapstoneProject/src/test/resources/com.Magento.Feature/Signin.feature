Feature:
Scenario Outline: Login with Valid & Invalid Credentials
Given User Opens the Browser
And User Navigates to the "https://magento.softwaretestingboard.com/" Webpage
And User Click the link SignIn in homepage
When User Enter invalid '<InvalidEmail>' Email
When User Enter Sign '<Password>' Password
And User Clicks on Signin button
And User Verify Error Message is displayed
And User reenters valid '<ValidEmail>' Email
And User Clicks on Signin button
And User Verify that HomePage is displayed
And User Closes the Browser

Examples:
|InvalidEmail|Password|ValidEmail|
|sreenivas402|Sweety2003|sreenivasaashritha406@gmail.com|