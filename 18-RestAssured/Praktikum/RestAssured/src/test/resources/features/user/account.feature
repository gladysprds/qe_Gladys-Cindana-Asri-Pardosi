Feature: User
  As an admin
  I want to get detail user
  So that I can update the user data

  Scenario: POST - As an admin I have to be able to create new user

  Given I set an endpoint for POST new user
    When I request POST detail user
       Then I validate the status code is 201
          And validate the data detail after create user
            And get userId for other request


    Scenario: POST - As a admin I cant create new user with invalid password

      Given I set an endpoint for POST new user
        When I request post detail user with invalid password
          Then I validate the invalid status code is 400
            And I validate the error message

      Scenario: POST - As an admin I cant create new user with exist account

        Given I set an endpoint for POST new user
          When I request POST detail user
            Then I validate the exist status code is 406
               And I validate the exist message

  Scenario: POST - As a user I have to be able to generate token
    Given I set an endpoint for POST generate token
    When I request POST generate token
    Then I validate the status code generate token is 200
    And validate the data detail after generate token
    And get token for other request




  Scenario: GET - As a user I have to be able to get detail user
    Given I set an endpoint for GET detail user
        When I request GET detail user
            Then I validate the status code is 200
                 And validate the data detail


    Scenario: POST - As a user I input input invalid Token
      Given I set an endpoint for POST generate token
        When I request invalid generate Token
          Then I validate the status code invalid generate Token is 200
             And validate the data detail invalid token after generate
