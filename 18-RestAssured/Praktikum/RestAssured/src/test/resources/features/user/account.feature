Feature: account
As a user
  i want to register
    so that i have an account

  Scenario: POST - As a user i want to create my account
    Given I set an endpoint to create user
      When  I request POST create user
        Then I validate the status code is 201
          And I validate the data that just created


