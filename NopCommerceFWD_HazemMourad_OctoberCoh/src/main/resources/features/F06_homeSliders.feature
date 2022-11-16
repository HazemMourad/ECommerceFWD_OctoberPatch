@Smoke
Feature: F6_home page sliders
  Scenario: first slider redirect to the required url
    Given user select first slider
    When user click on the image
    Then url should be referring to product url "https://demo.nopcommerce.com/nokia-lumia-1020"

  Scenario: second slider redirect to the required url
    Given user select second slider
    When user click on the image
    Then url should be referring to product url "https://demo.nopcommerce.com/iphone-6"