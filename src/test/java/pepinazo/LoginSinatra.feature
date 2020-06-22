Feature: Sinatra Login

  Scenario: Login Happy path

    Given I have the correct credentials
    When I navigate to sinatra site
    And I enter the correct credentials
    Then I will be in the Songs Page
    And I will see a welcome message

  Scenario: Incorrect Login

    Given I have incorrect credentials
    When I navigate to sinatra site
    And I enter incorrect credentials
    Then I will be in the login page
    And I will receive an error message

  Scenario: Login No User

    Given I have no user
    When I navigate to sinatra site
    And I try to login with no user data
    Then I will be in the login page
    And I will get an error message

  Scenario: Login No Password

    Given I have no password
    When I navigate to sinatra site
    And I try to login with no password
    Then I will be in the login page
    And I will get an error message


