Feature: Logged in user can view first level navigation landing pages

  Background:
  Given That a registered user has opened the "kyowaKirinHub" website


  Scenario: Open and display Therapy Areas Landing Page
    When They sign into the website
    And They click on Therapy Areas main menu link
    Then The opened page displays Therapy Areas as title text


  Scenario: Open and display Our Products Landing Page
    When They sign into the website
    And They click on the Our Products main menu link
    Then The opened page displays Our Products as title text




