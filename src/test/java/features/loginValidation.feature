Feature: Registered user login process

  Background:
  Given That a registered user has opened the "kyowaKirinHub" website


  Scenario: Successful login with valid credentials
      When they click on the Homepage "LoginRegister" button
      And they enter a valid "userEmail"
      And they now enter a valid "password"
      And they click "Continue" button
      Then The home page displays user status name




