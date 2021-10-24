package steps.iOSTests;

import PageObjects.CreateTaskPage;
import PageObjects.TasksListPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import tests.TestBase;

import java.net.MalformedURLException;

public class CreateNewTaskWithDataiOS extends TestBase {

    CreateTaskPage createTaskPage;
    TasksListPage tasksListPage;

    @Given("Click add new Task - iOS")
    public void clickAddNewTask() throws MalformedURLException {
        iOS_setUp();
        tasksListPage = new TasksListPage(driver);
        createTaskPage = new CreateTaskPage(driver);
        tasksListPage.clickAddTaskBtn();
    }

    @Given("Enter {string} and {string} - iOS")
    public void enterAnd(String taskName, String taskDesc) {
        createTaskPage.enterTaskName(taskName);
        createTaskPage.enterTaskDesc(taskDesc);
    }

    @And("Click Save Button - iOS")
    public void clickSaveButton() {
        createTaskPage.clickSaveBtn();
    }

    @Then("Task Added Successfully - iOS")
    public void taskAddedSuccessfully() {
        driver.hideKeyboard();
        tearDown();
    }
}
