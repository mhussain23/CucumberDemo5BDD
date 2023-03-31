package api.cucumber.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/java/api/cucumber/featuresWithTags" ,glue = {"api.cucumber.steps"},
        dryRun = false ,

      //   tags = "@smoke"
      // tags = "@smoke or @regression"

//        tags = "@smoke and @regression"

        tags = "@smoke and not @regression"



)



public class TagsRunner {
}
