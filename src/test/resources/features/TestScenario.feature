Feature: Login, add new employee, delete employee

// Background: User is on the Employee List Page



  @Smoke
  Scenario Outline: User creates new employee

    Given User goes to home page
    And User login with given credentials
    And User goes to Employee Page
    When user clicks create
    And User add "<name>", "<Salary>", "<Duration Worked>", "<Grade>", "<Email>"
    And User clicks create button
    Then User see added emloyee with "<name>", "<Salary>", "<Duration Worked>", "<Grade>", "<Email>"
    Examples:
      |name|Salary|Duration Worked|Grade|Email  |
      |yakup|1500|40|5|yakup@newmail.com  |


# @Smoke
# Scenario Outline: User deletes new employee

#   When user clicks create
#   And User add "<name>", "<Salary>", "<Duration Worked>", "<Grade>", "<Email>"
#   And User clicks create button
#   Then User see added emloyee with "<name>", "<Salary>", "<Duration Worked>", "<Grade>", "<Email>"
#   Examples:
#     |name|Salary|Duration Worked|Grade|Email  |
#     |yakup|1500|40|5|yakupacar@newmail.com  |


  @Smoke
  Scenario: Delete new added user from the employee list
    When User click Employee List
    When User click delete button for new added one
    And User click delete button again
    Then Verify that new added user is deleted successfully "yakup@newmail.com"
    Then Verify that new added user is deleted "yakup"
