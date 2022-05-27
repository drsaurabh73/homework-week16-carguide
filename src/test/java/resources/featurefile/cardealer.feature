Feature: Used Care Test
@Test
  Scenario: user can search used car dealer
    Given I am on homepage
    When  I mouse hover on buy+sell tab of car page
    And   I mouse hover on used car tab
    And   I click on Used Cars  Dealer link  page
    Then  I see the dealer list


      | 3 Point Motors Kew         |
      | 4WD Specialist Group       |
      | 777 Pinoy Auto Sales       |
      | A&Z QUALITY CARS           |
      | ASTORIA HAVAL & GREAT WALL |
      | Adelaide City Jeep         |