@Smoke
Feature: F02_Login | users login to his account
  Scenario: the user login to his account
    Given user go to login page
    When user login with "valid" "HazemMourad@example.com" and "P@ssw0rd"
    And user press on login button
  Scenario: the user  can't login to his account
    When user login with "invalid" "wrong@example.com" and "P@ssw0rd"
    Then user could not login to the system
