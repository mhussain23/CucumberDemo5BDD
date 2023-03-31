package api.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)

@CucumberOptions(features = {"src/test/java/api/cucumber/featurs/Post2.feature"},glue = {"api.cucumber.steps"},dryRun = false ,
      //  plugin = {"pretty","html:target/HtmlReports"})
      //  plugin = {"pretty","json:target/report.json"})
      //  plugin = {"pretty","junit:target/report.xml"})
        plugin = {"pretty","junit:target/report.xml"}, tags = "@SmokeTest")


public class Post2Runner {
}
