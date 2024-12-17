Feature: TopMenu Feature
  As a user
  I I should select Topmenu tab

  Background:  I am on homepage

  @smoke @author_Payal
  Scenario: Verify User Should Navigate To DesktopsPage Successfully
    When I mouse hover on “Desktops” Tab and click
    And I call selectMenu method and pass the menu = “Show All Desktops”
    Then I should see the text ‘Desktops’

  @sanity
  Scenario: Verify User Should Navigate To Laptops And NotebooksPage Successfully
    When I mouse hover on “Laptops & Notebooks” Tab and click
    And I call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
    Then I should see the text ‘Laptops & Notebooks’

  @regression
  Scenario: Verify User Should Navigate To Components Page Successfully
    When I Mouse hover on “Components” Tab and click
    And I call selectMenu method and pass the menu = “Show All Components”
    Then I should see the text ‘Components’