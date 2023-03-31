
package api.cucumber.steps;

//import io.cucumber.datatable.DataTable;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class DataTableLogins {

@Given("User is at login page of the application")
public void user_is_at_login_page_of_the_application() {
    System.out.println("user_is_at_login_page_of_the_application");
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}
@When("User log in with the following username and password")
public void user_log_in_with_the_following_username_and_password(DataTable dataTable) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.

   List <List<String>> list_of_rows = dataTable.asLists(String.class);

    for (List<String> columns : list_of_rows) {
        for (String str : columns){
            System.out.println("Data : " + str);
        }
    }

  //  throw new io.cucumber.java.PendingException();
}
@Then("User should be abble to login with correct username and password")
public void user_should_be_abble_to_login_with_correct_username_and_password() {

    System.out.println("user_should_be_abble_to_login_with_correct_username_and_password");
    // Write code here that turns the phrase above into concrete actions
 //   throw new io.cucumber.java.PendingException();
}
/*
    @Given("User is at login page of the application")
    public void userIsAtLoginPageOfTheApplication() {
    }

    @When("User log in with the following username and password")
    public void userLogInWithTheFollowingUsernameAndPassword() {
    }

    @Then("User should be abble to login with correct username and password")
    public void userShouldBeAbbleToLoginWithCorrectUsernameAndPassword() {
    }*/
}



