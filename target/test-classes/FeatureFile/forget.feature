Feature: To validate the forget password functionality of facebook
@Unit
Scenario: validate the  invalid email address 

When User should click the forget password button
And  User should type the invalid email address in text box
And User should click the search button
Then   Should negative to incorrect credential page



