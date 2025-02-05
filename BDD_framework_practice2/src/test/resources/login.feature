Feature: Login Functionality

  Scenario: User logs in successfully with valid credentials from Excel
    Given User is on login page
    When User logs in with data from Excel file
    Then User is logged in successfully
