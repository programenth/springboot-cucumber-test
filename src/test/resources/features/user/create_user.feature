@functional @user
Feature: Create User

  Scenario: Create a new user
    When I create a user with name "John"
    Then the user should be created successfully
