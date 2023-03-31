package api.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(features = {"src/test/java/api/cucumber/featurs/V28loginTestPOM.feature"},glue = {"api.cucumber.steps"},dryRun = false)
public class V28Runner {
}
