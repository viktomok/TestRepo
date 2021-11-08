Feature: Logged in user can view third level navigation landing pages

  Background:
    Given That a registered user has opened the "kyowaKirinHub" website
  @Unit
  Scenario: Open and display Therapy Areas - Gastrointestinal - OIC Landing Page
    When They sign into the website
    And They click on Therapy Areas main menu link
    And Then click the Gastrointestinal second Level menu link
    And Then click the Opioid Induced Constipation third level link
    Then The opened page displays Opioid Induced Constipation as title text


  Scenario: Open and display Therapy Areas - Gastrointestinal - CAF Landing Page
    When They sign into the website
    And They click on Therapy Areas main menu link
    And Then click the Gastrointestinal second Level menu link
    And Then click the Chronic Anal Fissure third level link
    Then The opened page displays Chronic Anal Fissure as title text


  Scenario: Open and display Therapy Areas - Oncology - BTcP Landing Page
    When They sign into the website
    And They click on Therapy Areas main menu link
    And Then click the Oncology second Level menu link
    And Then click the Breakthrough Cancer Pain third level link
    Then The opened page displays Breakthrough Cancer Pain as title text


  Scenario: Open and display Therapy Areas - Neurology - BTcP Landing Page
    When They sign into the website
    And They click on Therapy Areas main menu link
    And Then click the Neurology second Level menu link
    And Then click the Parkinsons Disease third level link
    Then The opened page displays Parkinsons Disease as title text


  Scenario: Open and display Our Products - Gastrointestinal - OIC Landing Page
    When They sign into the website
    And They click on the Our Products main menu link
    And Then click the Gastrointestinal second Level menu link
    And Then click the Opioid Induced Constipation third level link for OP
    Then The opened page displays Opioid Induced Constipation as title text for OIC-OP


  Scenario: Open and display Our Products - Gastrointestinal - CAF Landing Page
    When They sign into the website
    And They click on the Our Products main menu link
    And Then click the Gastrointestinal second Level menu link
    And Then click the Chronic Anal Fissure third level link for OP
    Then The opened page displays Chronic Anal Fissure as title text for OIC-OP
