Feature: Logged in user can view second level navigation landing pages

  Background:
    Given That a registered user has opened the "kyowaKirinHub" website
  
    Scenario: Open and display Therapy Areas - Gastrointestinal Landing Page
      When They sign into the website
      And They click on Therapy Areas main menu link
      And Then click the Gastrointestinal second Level menu link
      Then The opened page displays Gastrointestinal as title text

    Scenario: Open and display Therapy - Areas Oncology Landing Page
      When They sign into the website
      And They click on Therapy Areas main menu link
      And Then click the Oncology second Level menu link
      Then The opened page displays Oncology as title text


  Scenario: Open and display Therapy Areas - Neurology Landing Page
    When They sign into the website
    And They click on Therapy Areas main menu link
    And Then click the Neurology second Level menu link
    Then The opened page displays Neurology as title text


  Scenario: Open and display Our Products - Gastrointestinal Landing Page
    When They sign into the website
    And They click on the Our Products main menu link
    And Then click the OPGastrointestinal second Level menu link
    Then The opened page displays Gastrointestinal(OP) as title text


  Scenario: Open and display Our Products - Oncology Landing Page
    When They sign into the website
    And They click on the Our Products main menu link
    And Then click the OPOncology second Level menu link
    Then The opened page displays Oncology(OP) as title text