package api.cucumber.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {

    @FindBy(id="logout")
    WebElement btn_logout;

    WebDriver webDriver;

    public HomePage_PF(WebDriver webDriver){
        this.webDriver=webDriver;
        PageFactory.initElements(webDriver,this);
    }

    public boolean checkLogoutIsDisplayed(){
        return btn_logout.isDisplayed();
    }

}
