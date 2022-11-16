@Smoke
Feature: F5_hover on category and select a subcategory
  Scenario: user should hover on a random category and select one of subcategories
    Given user hover on category
    When user select a subcategory
    Then page title should contain the name of the subcategory