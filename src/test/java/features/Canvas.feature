Feature: Journey of regular user with Canvas product, and payment is credit card
  @canvas
  @test
  Scenario: User is available to buy Canvas product

    Given User opens Chrome browser, and moving to the meinfoto shop Canvas page
    When User clicks on CTA "upload button" from Canvas teaser
    And User in single upload configurator and clicks to the "Go to the shopingcart" button
    And User in shoppingcart page and clicks On CTA "Order Adrress" button
    And User in loginCheckout page and clicks to the CTA "Proceed to checkout" button
    And User fills in valid data and clicks to the CTA "Choose Payment" button
    And User clicks to the creditcard field, fills in with valid data and clicks to the CTA "Continue" button
#    And User on confirmorder page and clicks to the CTA "Buy Now" button
#    Then User will be redirected on ordersuccessfully page and "check" tracking order