@Login
Feature: Login
  As a user
  I want to login
  So that I can access my homepage

  Background:
    Given I am on the login page

  @DDT
  Scenario Outline: Login scenario
    When I input "<username>" username
    And I input "<password>" password
    And click login button
    Then I get the "<result>"
    Examples:
      |username|password|result|
      |gladysprds|1!KinoSu#|home page|
      |gladys|1!KinoSu#|Invalid username or password!|
      |gladysprds|KinoSu|Invalid username or password!|
      |gladys|KinoSu|Invalid username or password!|
      |      |1!KinoSu#|Login Page|
      |gladysprds|     |Login Page|





