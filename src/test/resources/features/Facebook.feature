@facebook
@Acceptance



Feature:

  Background:
    Given I am on the "Facebook" page


  @facebook_001 @Debug
  Scenario:Check the login page has create a new account button
    Then I check the login page has "Create new account" button

  @facebook_002
  Scenario:Check the login page has Log In button
    Then I check the login page has "Log In" button

  @facebook_003
  Scenario:Check the login page has email and password button
    Then I check the login page has "email" button
    Then I check the login page has "password" button