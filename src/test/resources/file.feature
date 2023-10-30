Feature: Add to cart feature
  As a user i want to add a product in the cart

  Background: 
    Given open the browser
    When enter the url "https://www.demoblaze.com/"
    And click on phone option

  Scenario: Test a add to cart by clicking it
    When click on iPhone16
    Then user is in add to cart page
    And user click on ADD to CART
