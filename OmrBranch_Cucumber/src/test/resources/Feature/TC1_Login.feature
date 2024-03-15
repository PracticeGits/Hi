
Feature: Verifying OMR Branch Login Module

	@e2e
  Scenario Outline: Verifying login Module with valid Credentials
    Given User in OMR branch hotel page
    When User enter "<Username>" and "<Password>"
    Then User should verify after login success message "Welcome Kulasekaran"
    Examples: 
      | Username                  | Password  |
      | praveenraj9747@gmail.com | Mightguy99* |
  @abc
  Scenario Outline: Verifying login Module with valid Credentials using Enter Keyword
    Given User in OMR branch hotel page
    When User enter "<Username>" and "<Password>" with enter key
    Then User should verify after login success message "Welcome Kulasekaran"

    Examples: 
      | Username                  | Password  |
      | praveenraj9747@gmail.com | Mightguy99* |

	@e2ee
  Scenario Outline: Verifying login Module with Invalid Credentials
    Given User in OMR branch hotel page
    When User enter "<Username>" and "<Password>"
    Then User should verify error message after click login button "Invalid Login details or Your Password might have expired. Click here to reset your password"

    Examples: 
      | Username                | Password  |
      | praveenraj9747@gmail.com | Mightguy9* |
