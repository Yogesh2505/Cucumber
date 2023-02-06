Feature: To validate the BeautyMNL login functionality
@smock
  Scenario Outline: Validate the login functionality with passing the valid and invalid datas
   
    When User click the signin option
    When User should type valid and invalid username"<Data1>" and passward"<Data2>"
    And User should click the login button

    Examples: 
    
      #  |Syogesh2505@gmail.com|2505gmail.com|
      # |syogesh250@gmail.com|2505gmail.com|
      #  |syogesh2505gmail.com|2505gmail.com|
      # |syogesh2505@gmail com|2505gmail.com|
      # |syogesh2505@gmail.co|2505gmail.com|
      # |syogesh2500@gmail.com|2505gmail.com|
      # |syogesh2505@gmail.com|250gmail.com|
      # |syogesh2505@gmail.com|2505gmail com|
      |Data1|Data2|
      | syogesh2505@gmail.com | 2500gmail.com |
      | syogesh2505@gmail.com | 2505gmail.com |
