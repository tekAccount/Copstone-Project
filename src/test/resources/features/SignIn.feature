Feature: Sign In Feature

  @SignIn
  Scenario: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'shaheera.gh@gmail.com' and password 'Usa@1414'
    And User click on login button
    Then User should be logged in into Account

  @Account
  Scenario: Verify user can create an account into Retail Website
    Given User is on retail website
    When User click on Sign in option
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name     | email            | password  | confirmPassword |
      | panthers | karimi14@gmail.com | Tek@22345 | Tek@22345       |
    And User click on SignUp button
    Then User should be logged into account page

    
    #you need to change the email whenever you try to create new account and run Account scenario.