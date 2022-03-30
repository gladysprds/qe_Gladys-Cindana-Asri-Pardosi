Feature: Login
  As a user
  i want to login
  so that i can access my homepage


  Scenario: As a user i have to be able to login
    Given i am in the login page
    When i input valid username
    And I input valid password
    And click login button
    Then I go to homepage

    Scenario: As a user i cannot login with wrong username
      Given i am in the login page
      When i input wrong username
      And I input valid password
      And click login button
      Then i have error message

  Scenario: As a user i cannot login with wrong password
        Given i am in the login page
        When i input valid username
        Then i input wrong password
        And click login button
        Then i have error message

  Scenario: As a user i cannot login with wrong password and wrong username
    Given i am in the login page
    When i input wrong username
    Then i input wrong password
    And click login button
    Then i have error message

  Scenario: As a user i cannot login with null password
    Given i am in the login page
    When i input valid username
    Then i input null password
    And click login button
    Then i still in login page

  Scenario: As a user i cannot login with null username
    Given i am in the login page
    When i input null username
    Then I input valid password
    And click login button
    Then i still in login page
