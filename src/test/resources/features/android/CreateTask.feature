Feature: Create New Task - Android

  Scenario: The user can add new task - Android
    Given Click Add new Task - Android
    Given Enter TaskName - Android
    Given Enter TaskDesc - Android
    When Click Save - Android
    Then Task added successfully - Android
