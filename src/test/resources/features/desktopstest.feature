Feature: Desktop Menu
  As a user
  I should see

  Background: I am on homepage

  @smoke @author_Payal
  Scenario: Verify Product Arrange In AlphaBatical Order
    When I mouse hover on “Desktops” Tab and click
    And I call selectMenu method and pass the menu = “Show All Desktops”
    And I select Sort By position "Name (Z - A)"
    Then I should see the Product will arrange in Descending order.

  @sanity
  Scenario Outline: Verify Product Added To ShoppingCart SuccessFully
    When I Mouse hover on Currency Dropdown and click
    And I Mouse hover on £Pound Sterling and click
    When I mouse hover on “Desktops” Tab and click
    And I call selectMenu method and pass the menu = “Show All Desktops”
    And I select Sort By position "Name (A - Z)"
    And I Select product “<product>”
    And I should see the Text "<product>"
    And I Enter Qty 1 using Select class.
    And I Click on Add to Cart button
    And I should see the Message Success: You have added “<product>” to your shopping cart!
    And I Click on link shopping cart display into success message
    And I should see the text "Shopping Cart"
    And I should see the Product name "<product>"
    And I should see the Model "<model>"
    Then I should see the Total "<price>"

    Examples:
      | product      | model      | price   |
      | HTC Touch HD | Product 1  | £74.73  |
      | iPhone       | product 11 | £75.46  |
      | iPod Classic | product 20 | £74.73  |
      | MacBook      | Product 16 | £368.73 |
      | MacBook Air  | Product 17 | £736.23 |
      | Sony VAIO    | Product 19 | £736.23 |

