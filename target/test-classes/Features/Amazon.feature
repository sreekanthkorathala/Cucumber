Feature: Login to amazon accpont and add the item to cart

  @tag1
  Scenario: Login to amazon application
    Given Open the browser and navigate to amazon
    When user login to amazon account
    And add the item int cart
    Then logout to application


