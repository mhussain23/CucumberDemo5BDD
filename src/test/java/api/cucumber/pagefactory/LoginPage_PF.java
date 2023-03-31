package api.cucumber.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage_PF {
    @FindBy(id="name")
    WebElement txt_username;

    @FindBy(id="password")
    WebElement txt_password;

    @FindBy(id="login")
    WebElement btn_login;

  //  @CacheLookup

/*    @FindBy(how= How.ID,using = "name")
            WebElement abc;*/

    WebDriver driver;

    public LoginPage_PF(WebDriver webDriver){

        this.driver=webDriver;
       // PageFactory.initElements(driver,this);

        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,30);
        PageFactory.initElements(factory,this);

    }

    public void enterUsername(String username){
        txt_username.sendKeys(username);
    }

    public void enterPassword(String password){
        txt_password.sendKeys(password);
    }

    public void userClickOnLogin(){
        btn_login.click();
    }
}

