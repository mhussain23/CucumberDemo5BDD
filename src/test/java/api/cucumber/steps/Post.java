package api.cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Post {
    @Given("User should be logged in and should be present on wall")
    public void userShouldBeLoggedInAndShouldBePresentOnWall() {

        System.out.println("Testing Git");
        System.out.println("userShouldBeLoggedInAndShouldBePresentOnWall");
    }

    @When("I type text in the text box")
    public void iTypeTextInTheTextBox() {
        System.out.println("iTypeTextInTheTextBox");
    }

    @And("Click on post button")
    public void clickOnPostButton() {
        System.out.println("clickOnPostButton");
    }

    @Then("The msg should get posted")
    public void theMsgShouldGetPosted() {
        System.out.println("theMsgShouldGetPosted");
    }
}
