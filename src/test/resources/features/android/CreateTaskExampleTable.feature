Feature: Create New Task - Android (data driven)

  Scenario Outline: The user can add new task - Android
    Given Click add new Task - Android
    Given Enter "<TaskName>" and "<TaskDesc>" - Android
    And Click Save Button - Android
    Then Task Added Successfully - Android

    Examples:
      | TaskName        | TaskDesc       |
      | Cucumber Task 1 | Task 1 Details |
      | Cucumber Task 2 | Task 2 Details |