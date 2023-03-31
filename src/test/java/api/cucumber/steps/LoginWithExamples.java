package api.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithExamples {

    private WebDriver driver;

/*
    @Before
    public void inIt(){
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);



    }
*/


    @Given("User is on Home Page")
    public void user_is_on_home_page()  throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }
    @When("User navigate to Login page")
    public void user_navigate_to_login_page()  throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user_navigate_to_login_page");
        //throw new io.cucumber.java.PendingException();
    }
    @When("User enters {string} and {string}")
    public void user_enters_and(String username, String password)  throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();



        System.out.println("User name is " + username + " password is " + password);
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
    }
    @Then("Message displayed Login successfully")
    public void message_displayed_login_successfully() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();



        System.out.println("message_displayed_login_successfully");
        Thread.sleep(2000);
        driver.close();

    }

}
