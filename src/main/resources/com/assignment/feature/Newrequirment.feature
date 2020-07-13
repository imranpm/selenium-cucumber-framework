# Selenium - Cucumber Assignment by Imran peenamajidsab
@registration @profilevalidation @email
Feature: to register and send mail after successfull validation of profile

  @registration
  Scenario: to register an user
    Given the website is loaded
    And Engilsh is selected as Language on the home page
    When user wants to register
    And mandatory fields are populated
      | firstname | lastname | email              | username | password |
      | imran     | pm       | pmimran7@gmail.com | imran    | imran123 |
    And Clicking on the Register button
    Then display the valid message if registered successfully

  @profilevalidation
  Scenario: to validate name and email
    Given user registered successfully
    When clicked on profile dropdown at top right corner
    Then display profile details such as name and email
    And validate name and email of the user.

  @email
  Scenario: to check user is able to send mail
    Given user wants to send an message to other user
    