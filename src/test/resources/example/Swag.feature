Feature: Login page verification

  Scenario Outline: test if user could logs in and add and remove items succesfully
    Given user navigates to swagLab page "https://www.saucedemo.com/"
    When User enters username "<userName>"
    And User enters password "<password>"
    And User clicks on login button
    And user clicks to add items to cart
    And user clicks to remove items from cart
    

    Examples: 
      | userName                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
