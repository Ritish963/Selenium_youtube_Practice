
  Scenario Outline: User should be able to login successfully with valid credentials
    Given  User is on login page
    When User is able to enter valid credentials "<username>" and "<password>"
    Then user is navigated to home page

    Examples:
    username | password
    user1 | pass1
    user2 | pass2
    user3 | pass3