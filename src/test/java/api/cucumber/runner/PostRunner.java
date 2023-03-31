package api.cucumber.runner;

//import io.cucumber.junit.Cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(features = {"src/test/java/api/cucumber/featurs/post.feature"},glue = {"api.cucumber.steps","api.cucumber.Hooks"},dryRun = false)
public class PostRunner {
}
