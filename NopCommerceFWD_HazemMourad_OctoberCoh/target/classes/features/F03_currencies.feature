@Smoke
Feature: F03_Currencies | users could change currency and select between two currencies
  Scenario: user could change currency
    Given user select euro currency
    Then categories will be changed to the currency symbol
