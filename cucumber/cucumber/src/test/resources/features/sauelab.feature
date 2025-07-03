@SmokeTest
Feature: Order item from SauceDemo

  @AddToCart
  Scenario: Successful order on SauceDemo
    Given user launches SauceDemo website
    When user logs in with valid credentials
    And adds a bike light to the cart
    And proceeds to checkout with customer details
    Then order should be placed successfully

 