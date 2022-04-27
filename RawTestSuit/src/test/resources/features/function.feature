
Feature: Multiplier Test suite

  Scenario Outline: Verify the multiplier of given number array 
    Given I want to pass numbers list
    When I pass <num> as the number
    Then I see the message '<message>'
    Examples:
     | num | message                  |
     | 4   | 4 is multiplier by 4 or 6|
     | 6   | 6 is multiplier by 4 or 6|
     | 18  | 18 is multiplier by 4 or 6|
     | 16  | 16 is multiplier by 4 or 6|
     | 12  | 12 is multiplier by 4 or 6 and both|
     | 2   | 2 is not multiplier of 4 or 6|