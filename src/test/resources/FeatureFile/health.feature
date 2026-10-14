
Feature: Health and Beauty product cart functionality

  Scenario: Verify user can add 77 Bandages to the cart
    When User scrolls & hovers over Health and Beauty menu and click it
    And User selects 77 Bandages product
    And User clicks Add to cart button
    Then  User click the checkout button
