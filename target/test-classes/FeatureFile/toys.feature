

Feature: Product search and cart functionality

  @Positive
  Scenario Outline: Search for valid products and perform cart operations
    When I search for "<product>" and i select the product
    And I increase the product quantity by 8
    And I add the product to the cart
    And I remove the product from the cart
    And I close the cart
    And I decrease the product quantity by 8
    And I add the product to the cart
    Then  I proceed to checkout

    Examples:
      | product                          |
      | Street Fighter II Ryu 6" Figure  |
      
      

  @Negative
  Scenario Outline: Search with invalid product data
    When I search for "<product>" and i select the product
    Then I should see the message "<expectedMessage>"

    Examples:
      | product                  | expectedMessage   |
      | flower                   | No matches        |
      | ship                     | No matches        |
      | milk                     | No matches        |

