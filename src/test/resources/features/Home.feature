
Feature: Automod app tests

  @wip
  Scenario: user enters the app
    Given user is on the app
    Then user validates the welcome text "Tickets and travel passes"
    When user clicks the later and check button

  @wip
  Scenario: user enters the cms
    Given user goes to havas cms and login with valid credentials