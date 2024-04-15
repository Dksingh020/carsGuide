@Two
Feature: Acceptance testing to validate Search Cars Page is working.
  In order to validate that 
  the Used Search Cars page is working
  Performing the Acceptance Testing

  @Search-Cars-Positive
  Scenario: Validate Used  Search Cars Page
    Given I navigate to the  Home Page "https://www.carsguide.com.au" of CarsGuide Website
    #When I validate the page
    #And click on Anymake drop down  Search link
    And select carMaker from AnyMake dropdown
      | carMaker |
      | BMW     |
    And select car model from next dropdown
      | carModel |
      | 7 Series     |
    And select  state
      | state		 |
      | Victoria |
     And select region in state
      | regions		 |
      | Sydney |
    And select price  from Select Min dropdown
      | price |
      | $2000    |
    And select price from Select Max dropdown
      | price  |
      | $4000 |
    Then click on show_used_vehicles button
   