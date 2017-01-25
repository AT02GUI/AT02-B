Feature:
  Scenario: Create a note
    Given I navigate to match2
    And I have a new Board
    When I press the menu Widget
    And I press the button Widget showing on the menu
    And I chose the option note on the widget
    And I put the text on the body of the note
    And I press the button Done
    Then I expect that note is saved