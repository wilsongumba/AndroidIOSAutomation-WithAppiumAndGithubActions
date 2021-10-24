package runner;

import io.cucumber.testng.CucumberOptions;
import tests.TestBase;

@CucumberOptions(
        plugin = {"pretty"
                , "html:target/cucumber-html-reports.html"
                , "summary", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/resources/features/"
        , glue = {"steps"}
        , monochrome = true)
public class TestRunner extends TestBase {
}
