Feature:Validatuion of Facebook with Different Credentials

Scenario Outline:Validation of Facebook with valid Username and Password
Given user Launches the Facebook url
When user Enters the "<username>" and "<password>"
And user clicks the login button
Then user validates the successfull login 

  Examples:
          |username|password|
          |ram@123|abc1234|
          |sarath@345|sara1234|


  
