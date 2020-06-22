Feature: Todoist Login

  Scenario: User us able to login with email credentials
    Given I have the correct email credentials
    When I navigate to todoist site
    Then I will be in the todoist Page

  Scenario: User can login with google credentials
    Given I have a google account
    When I click on continue with google button
    Then I will be in the todoist Page

