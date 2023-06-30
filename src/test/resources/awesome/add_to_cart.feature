Feature: Add to cart feature
  Scenario: Add a item into the item cart
    Given I go to the first first page
    When I select "Blue Shoe"
    Then I should see 1 "Blue Shoe" in the cart

