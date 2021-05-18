
Feature: Checks the registration functionality
  
  Scenario: Verify that customer can able to generate the customer id.
    Given Customer is on telecom page.
		When Customer enters the user details  
    And Customer enters the mob no and clicks the submit button
    Then The message displayed customer id is generated successfully.
