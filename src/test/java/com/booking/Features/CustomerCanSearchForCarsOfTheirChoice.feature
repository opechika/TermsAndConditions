Feature: Search
  As a Customer
  I want the ability to search for a rental Car of my choice
  So that I can book it

  Scenario Outline : Customer can search with various search options
    Given I am on rentalcars homepage
    And I enter a "Location" of my choice
    And I enter the Pick-up Date as "StartDate"
    And I enter Drop off Date as "EndDate"
    When I click on the search button
    Then the results of the rentals cars are displayed
    Examples:
      |Location  |Pick-up Date |Drop off Date|
      |Manchester|16 Feb 2020  |19 Feb 2020  |
      |EC1A 2AL  |24 Feb 2020  |29 Feb 2020  |

  Scenario: Customer can not leave search field  bar empty
      Given I am on rentalcars homepage
      And I leave the location empty
      And I enter the Pick-up Date as "StartDate"
      And I enter Drop off Date as "EndDate"
      When I click on the search button
      Then I am prompted to "Please provide a pick-up location"