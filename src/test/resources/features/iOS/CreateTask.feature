Feature: Create New Task - iOS

  Scenario: The user can add new task - iOS
    Given Click Add new Task - iOS
    Given Enter TaskName - iOS
    Given Enter TaskDesc - iOS
    When Click Save - iOS
    Then Task added successfully - iOS
