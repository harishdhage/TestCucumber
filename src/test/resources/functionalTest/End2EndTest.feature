Feature: Automated End2End test
  Purpose of this feature is to test End 2 End integration

  Scenario Outline: Customer place the order by purchasing the item from online

    Given user is at Home page
    When he searches for "dress"
    And choose to buy the first item
    And moves the check out from mini cart
    And enters the "<customer>" details in checkout page
    And place the order
    Then verify order details

    Examples:
    | customer |
    | Lakshay  |