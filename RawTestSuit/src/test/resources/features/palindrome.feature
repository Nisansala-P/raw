
Feature: Palindrome suite

  Scenario: Verify the palindrome of given string in lower case
    Given I want to pass words to palindrome
    When I pass 'ata'
    Then I see the Assertion is success

  Scenario: Verify the palindrome of given string in Upper case
    Given I want to pass words to palindrome
    When I pass 'MALAYALAM'
    Then I see the Assertion is success
    
  Scenario: Verify the palindrome of given string in toggle case
    Given I want to pass words to palindrome
    When I pass 'Malayalam'
    Then I see the Assertion is success
  
 Scenario: Verify the text is not palindrome 
    Given I want to pass words to palindrome
    When I pass 'atam'
    Then I see the Assertion is success
  