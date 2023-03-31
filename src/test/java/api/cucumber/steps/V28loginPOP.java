/*
package api.cucumber.steps;

import api.cucumber.pages.loginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class V28loginPOP {

    WebDriver driver = null;
    loginPage login;

    @Before
    public void inIt(){
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);



    }

    @io.cucumber.java.en.Given("browser is open")
    public void browserIsOpen() {
        System.out.println(" ===== I AM INSIDE BROWSER IS OPEN  ====== ");
 //       WebDriverManager.chromedriver().setup();
 //       driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @io.cucumber.java.en.And("user is on login page")
    public void userIsOnLoginPage() {
        driver.navigate().to("https://example.testproject.io/web/");
    }

    @When("User enter {string} and {string}")
    public void userEnterUsernameAndPassword(String username, String password) throws InterruptedException {
        login = new loginPage(driver);
        login.enterUsername(username);
        login.enterPassword(password);
        Thread.sleep(2000);
    }


    @io.cucumber.java.en.And("user click on login")
    public void userClickOnLogin() {
        login.clickLogin();
    }

    @io.cucumber.java.en.Then("user is navigated to the home page")
    public void userIsNavigatedToTheHomePage() throws InterruptedException {
        Assert.assertTrue(login.checkedLogOutIsDisplayed());
        Thread.sleep(2000);
        driver.close();
    }



}


*/
