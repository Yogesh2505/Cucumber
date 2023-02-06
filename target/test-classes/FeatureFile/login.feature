Feature: Validate the logine functionality of facebook


@Smoke
Scenario: Validate the login functionality with invalid user name and invalid password
When  User should type invalid uesrname and invalid password in the text box
      #without header----1D
      
      |ram|ram123|prem|prem123|anu|anu123|arun|arun123|
And  User should click the login button
Then  User should negative to incorrect credential page

@Sanity
Scenario: Validate the login functionality with valid user name and invalid password
When  User should type valid uesrname and invalid password in the text box
#without header-----2D
         |ram|ram123|prem|prem123|anu|anu123|arun|arun123|
         |ram|ram123|prem|prem123|anu|anu123|arun|arun123|
         |ram|ram123|prem|prem123|anu|anu123|arun|arun123|

And  User should click the login button
Then  User should negative to incorrect credential page

@Regression
Scenario: Validate the login functionality with invalid user name and valid password
When  User should type invalid uesrname and valid password in the text box
#with header------1d

|yogesh|yogesj234|
|renu|renu123|
|ram|ram123|
And  User should click the login button
Then  User should negative to incorrect credential page

@Smoke
Scenario: Validate the login functionality with valid user name and not pass the password
When  User should type valid uesrname and not pass the password in the text box
#with header------2D

          |ram|prem|arun|
          |H1|H2|H3|
          |A1|A2|A3|
And  User should click the login button
Then  User should negative to incorrect credential page

@Unita 
Scenario: Validate the login functionality with inavalid username name and valid password
When  User should type iinavalid the username and valid password 
And  User should click the login button
Then  User should negative to incorrect credential page
