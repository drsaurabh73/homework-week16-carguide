
Feature: Used Care Test

  Scenario Outline: user can search used car
    Given  I am on homepage
    When  I mouse hover on buy+sell tab of car page
    And  I mouse hover on used car tab
    And I click on Used Cars link on usedcar page
    Then I navigate to "Used Cars For Sale" from used car page
    And I select make "<make>" of the car
    And I select model "<model>" of the car
    And I select location "<location>"
    And I select price "<price>" in the field
    And  I click on Find My Next Car tab
    Then I click on Find My Next Car "<make>" tab on page

    Examples:
      | make          | model | location  | price |
      | Audi          | A4    | ACT - All | 40000 |
      | Suzuki        | Alto  | NSW - All | 20000 |
      | Honda         | CR-V  | ACT - All | 25000 |
      | Mercedes-Benz | C220  | NSW - All | 45000 |
      | Nissan        | Note  | VIC - All | 25000 |
      | Toyota        | Prius | NSW - All | 30000 |