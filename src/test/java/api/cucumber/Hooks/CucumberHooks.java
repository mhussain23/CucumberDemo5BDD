package api.cucumber.Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks {

    @Before
    public void setup(){
        System.out.println("......Befor Hooks........");
    }

    @After
    public void tearDown(){

        System.out.println("......After Hooks........");
    }
}
