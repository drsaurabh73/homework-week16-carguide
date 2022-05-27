
Feature: Search Functionality

  Scenario Outline:User can serach to buy the car with model
    Given  I am on homepage
    When   I mouse hover on buy+sell tab of car page
    And I click on Search Cars link
    Then I navigate to "New & Used Car Search" page
    And I select make "<make>" of the car
    And I select model "<model>" of the car
    And I select location "<location>"
    And I select price "<price>" in the field
    And  I click on Find My Next Car tab
    Then I click on Find My Next Car "<make>" tab on page
    Examples:
      | make          | model | location  | price |
      | Audi          | A1    | NSW - All | 40000 |
      | Suzuki        | Alto  | NSW - All | 20000 |
      | Honda         | CR-V  | ACT - All | 25000 |
      | Mercedes-Benz | C220  | NSW - All | 45000 |
      | Nissan        | Note  | VIC - All | 25000 |
      | Toyota        | Prius | NSW - All | 30000 |


