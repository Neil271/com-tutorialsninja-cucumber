Feature: My Account
  As a user
  I I should successful create Account

  Background:  I am on homepage

  @smoke @author_Payal
  Scenario: Verify User Should Navigate To Register PageSuccessfully
    When I click on My Account Link.
    And I call the method “selectMyAccountOptions” method and pass the parameter “Register”
    Then I should see the text “Register Account”.


  @sanity
  Scenario: Verify User Should Navigate To LoginPage Successfully
    When I click on My Account Link.
    And I call the method “selectMyAccountOptions” method and pass the parameter “Login”
    Then I should see the text “Returning Customer”.

  @regression
  Scenario: Verify That User Register Account Successfully
    When I click on My Account Link.
    And I call the method “selectMyAccountOptions” method and pass the parameter “Register”
    And I Enter First Name
    And I Enter Last Name
    And I Enter Email
    And I Enter Telephone
    And I Enter Password
    And I Enter Password Confirm
    And I select Subscribe Yes radio button
    And I click on Privacy Policy check box
    And I click on Continue button
    And I click on Continue Successfully button
    And I click on My Account Link.
    And I call the method “selectMyAccountOptions” method and pass the parameter “Logout”
    And I should see the text “Account Logout”
    Then I click on Continue Last button

  @regression
  Scenario: Verify That User Should Login And Logout Successfully
    When I click on My Account Link.
    And I call the method “selectMyAccountOptions” method and pass the parameter “Login”
    And I Enter Email
    And I Enter Password
    And I click on Login button
    And I should see the text “My Account”
    And I click on My Account Link.
    And I call the method “selectMyAccountOptions” method and pass the parameter “Logout”
    And I should see the text “Account Logout”
    Then I click on Continue Last button