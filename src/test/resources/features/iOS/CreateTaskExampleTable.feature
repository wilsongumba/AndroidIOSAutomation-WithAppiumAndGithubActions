Feature: Create New Task - iOS (data driven)

  Scenario Outline: The user can add new task - iOS
    Given Click add new Task - iOS
    Given Enter "<TaskName>" and "<TaskDesc>" - iOS
    And Click Save Button - iOS
    Then Task Added Successfully - iOS

    Examples:
      | TaskName        | TaskDesc       |
      | Cucumber Task 1 | Task 1 Details |
      | Cucumber Task 2 | Task 2 Details |