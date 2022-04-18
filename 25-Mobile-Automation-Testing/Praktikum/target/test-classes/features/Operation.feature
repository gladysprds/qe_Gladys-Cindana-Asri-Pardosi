Feature: Calculator

  Scenario: As a User, I want add up 2 numbers
    Given I am on calculator page
    When I click button 1
    And I click operator add button
    And I click button 2
    Then I got 3

  Scenario: As a User, I want subtract 2 numbers
    Given I am on calculator page
    When I click button 1
    And I click operator subtract button
    And I click button 2
    Then I got -1

  Scenario: As a User, I want divide 2 numbers
    Given I am on calculator page
    When I click button 1
    And I click operator divide button
    And I click button 2
    Then I got 0.5

  @Multiply
  Scenario: As a User, I want to multiply 2 numbers
    Given I am on calculator page
    When I click button 1
    And I click operator multiplication button
    And I click button 2
    Then I got 2