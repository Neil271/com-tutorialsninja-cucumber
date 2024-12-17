Feature: Desktop Menu
  As a user
  I should see

  Background: I am on homepage

  @smoke @author_Payal
  Scenario: Verify Products Price Display High To Low Successfully
    When I mouse hover on “Laptops & Notebooks” Tab and click
    And I call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
    And I Select Sort By "Price (High > Low)"
    Then I should see the Product price will arrange in High to Low order.

  @sanity
  Scenario: Verify That User Place Order Successfully
    When I mouse hover on “Laptops & Notebooks” Tab and click
    And I call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
    And I Select Sort By "Price (High > Low)"
    And I Select Product “MacBook”
    And I should see the text “MacBook”
    And I Click on Add to Cart button
    And I should see the message Success: You have added MacBook to your shopping cart!
    And I Click on link shopping cart display into success message
    And I should see the text "Shopping Cart"
    And I should see the Product name "MacBook"
    And I Change Quantity "2"
    And I Click on “Update” Tab
    And I should see the message Success: You have modified your shopping cart!
    And I should see the Total £737.45
    And I Click on Checkout button
    And I should see the text “Checkout”
    And I should see the Text “New Customer”
    And I Click on Guest Checkout radio button
    And I Click on Continue tab
    And I Fill the mandatory fields
    And I Click on Continue Button
    And I Add Comments About your order into text area
    And I Check the Terms & Conditions check box
    And I Click on the Continue button
    Then I should see the message Warning: Payment method required!
