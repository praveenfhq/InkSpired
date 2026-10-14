
Feature: Pantry and Grocery product purchase

  Scenario: View product shipping details and add tea product to cart
    When I select the Pantry and Grocery category
    And I select the Honey Lemon Throat Comfort Tea product
    And I open the Shipping and Returns section
    And  I should fetch and display the Shipping and Returns details
    Then   I add the product to the cart and checkout
      
