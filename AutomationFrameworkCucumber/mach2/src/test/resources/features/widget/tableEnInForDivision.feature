Feature: Add widget table with Engineer Information search for division

  Scenario: Add widget table with employee information
    Given I am login on Mach2 with credentials
      | user | password      |
      | at02 | Automation123 |
    And I have a board and widget created
    When I select "Table" icon on Widget options
    And I select "Open ERP" service
    And I select "Engineer Information" of Open ERP

    And I select "Cleaning - Night Shift" on "Divisions" option
    And I click on save Button
    Then  I should have the same result using Open ERP web page to search "Cleaning - Night Shift" on "Division" filled