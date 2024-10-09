package Runners;

import Tests.TestBase;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(glue = "StepDefinitions",
features = "src/main/resources/Features",
plugin = {"pretty",
        "html:target/cucumber-reports/Cucumber.html",
        "json:target/cucumber-reports/Cucumber.json",
        "junit:target/cucumber-reports/Cucumber.xml"})
public class TestRunner extends TestBase {
}
