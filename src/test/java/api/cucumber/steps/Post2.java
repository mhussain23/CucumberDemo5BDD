package api.cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Post2 {
    @Given("User should be logged in and should be present on his wall")
    public void userShouldBeLoggedInAndShouldBePresentOnHisWall() {


        System.out.println("userShouldBeLoggedInAndShouldBePresentOnHisWall");
    }

    @When("I type text as {string} in the text box")
    public void iTypeTextAsInTheTextBox(String arg0) {
        System.out.println("iTypeTextAsInTheTextBox");
    }

    @And("click on post button")
    public void clickOnPostButton1() {
        System.out.println("clickOnPostButton1");
    }

    @Then("The message should get posted")
    public void theMessageShouldGetPosted() {
        System.out.println("theMessageShouldGetPosted");
    }

    @When("User supply you tube link as {string} in the text box")
    public void userSupplyYouTubeLinkAsInTheTextBox(String arg0) {
        System.out.println("userSupplyYouTubeLinkAsInTheTextBox");
    }

    @And("Click on post button.")
    public void clickOnPostButton() {
        System.out.println("clickOnPostButton");

    }

    @Then("The video should have proper thumbnail.")
    public void theVideoShouldHaveProperThumbnail() {
        System.out.println("theVideoShouldHaveProperThumbnail");

    }
}
