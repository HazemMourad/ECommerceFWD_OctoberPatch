@Smoke
Feature: F01_Register | users could register with new accounts
  Scenario: guest user could register with valid data successfully
    Given user go to register page
    When user select gender type
    And user enter first name "Hazem" and last name "Mourad"
    And user enter date of birth
    And user enter email "HazemMourad@example.com" field
    And user fills Password fields "P@ssw0rd" "Password"
    And user clicks on register button
    Then success message is displayed
