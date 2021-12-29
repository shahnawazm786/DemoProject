#Feature
# Scenario | Scenario Outline
# Given
# When
# And
# Then
# Rule
# But - Negative scenario
Feature: Add Item into the cart

  Scenario Outline: Add to cart
    Given You Logged into web apps
    When you click to the item
    Then item added into cart
    And view cart link displayed
    And "<step>" missed "<out>"
    Examples:
    |step|out|
    
    |a|b|