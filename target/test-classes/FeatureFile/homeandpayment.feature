Feature: Home & Kitchen Product purchase and Payment functionality

  Scenario: Verify user add Raptor Claw Bottle Opener & payment options and checkout flow
    Given User navigates to Home and Kitchen
    When User selects the Raptor Claw Bottle Opener & adds the product to the cart
    And User proceeds to checkout & change currency from rupees to Doller
    And User click & verifies the Apple Pay  payment option and cancel it
    And user click and verifies the link pay payment option and cancel it
    And user click and verifies the amazon pay payment option and cancel it
    And User enters the email and shipping details
    And User enters the card details
    | CardNumber| 4012 0000 3333 0026 |
    | Month/year| 02/35               |
    | CVV       | 123                 |
    Then User completes the payment form
