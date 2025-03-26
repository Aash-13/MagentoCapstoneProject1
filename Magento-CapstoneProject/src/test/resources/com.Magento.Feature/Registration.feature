Feature:

Scenario Outline: To Check User Registration with Valid and Invalid Data Handling

Given User Opens the Browser
And User Navigates to the "https://magento.softwaretestingboard.com/" Webpage
Then User Click the link Create an account
When User Enter '<FirstName>' FirstName
When User Enter '<LastName>' LastName
When User Enter Invalid '<InvalidEmail>' Email
When User Enter '<Password>' Password
When User Enter '<ConfirmPassword>' ConfirmPassword
Then User Click on the button Create an Account
And User Verify Error message apperaed
And User reenters Valid '<ValidEmail>' Email
Then User Click on the button Create an Account
Then User Verify Successfully registered or not
And User Closes the browser
Examples:
|FirstName|LastName|InvalidEmail|Password|ConfirmPassword|ValidEmail|
|Aashritha|Kappala|sreenivasaashritha402|Sweety2003|Sweety2003|sreenivasaashritha454@gmail.com|
