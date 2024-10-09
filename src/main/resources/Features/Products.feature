Feature: Products

  Scenario: search for product valid case
    When User search for product
    Then Items of product displayed for user

    Scenario: Add to cart valid case
      When User add products to cart
      Then User get the added products sub total price

      Scenario: Go to cart valid case
        When User click Go to cart button
        Then User get the sub total price