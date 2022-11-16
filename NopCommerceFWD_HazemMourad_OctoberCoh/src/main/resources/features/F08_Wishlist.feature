@Smoke
Feature:  F8_wishlist feature
  Background: user should click on add button
    When user click on add button
  Scenario: adding wil cause success message to appear
    Then success message will appear in a green background

  Scenario: adding will cause number of items to be more than zero
    When user click on wishlist
    Then user finds number of items is more than zero