package steps.iOSTests;

import PageObjects.CreateTaskPage;
import PageObjects.TasksListPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tests.TestBase;

import java.net.MalformedURLException;

public class CreateNewTaskiOS extends TestBase {
    CreateTaskPage createTaskPage;
    TasksListPage tasksListPage;

    @Given("Click Add new Task - iOS")
    public void clickAddNewTask() throws MalformedURLException {
        iOS_setUp();
        tasksListPage = new TasksListPage(driver);
        createTaskPage = new CreateTaskPage(driver);
        tasksListPage.clickAddTaskBtn();
    }

    @Given("Enter TaskName - iOS")
    public void enterTaskName() {
        createTaskPage.enterTaskName("Task 1");
    }

    @Given("Enter TaskDesc - iOS")
    public void enterTaskDesc() {
        createTaskPage.enterTaskDesc("Desc 1");
    }

    @When("Click Save - iOS")
    public void clickSave() {
        createTaskPage.clickSaveBtn();
    }

    @Then("Task added successfully - iOS")
    public void taskAddedSuccessfully() {
        driver.hideKeyboard();
        tearDown();
    }
}
