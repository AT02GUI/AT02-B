Feature: Widgets
  Scenario: Verify widgets
    Given I Log-in to MACH2 website page
    And I set at02 in user textfield
    And I set Automation123 in password textfield and press Submit button
    And I click on Jalasoft top menu button
    And I click on Board dropdown menu
    And I click on Board Item to create a new Board
    When I click on Widget top menu button
#    Then A new Widgets List should be displayed on the body of MACH2