@smoke
Feature: F4_Search feature
  Background: user get to search box
    Given user click on search box
  Scenario Outline:user could search using product name
    When user enter product "<name>"
    Then results should have the same "<keyword>"
    Examples:
      |name  |keyword|
      |book  |book   |
      |laptop|laptop |
      |nike  |nike   |
  Scenario Outline:user could search using sku
    When user enter product "<sku>"
    And user click on the product
    Then result should have the same "<skuKeyword>"
    Examples:
      |sku  |skuKeyword|
      |SCI_FAITH  |SCI_FAITH|
      |APPLE_CAM  |APPLE_CAM|
      |SF_PRO_11  |SF_PRO_11|
