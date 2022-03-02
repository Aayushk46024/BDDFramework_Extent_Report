package StepDefination;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class Logout extends BaseTest{
	

    @And("^user is click on Welcome user button$")
    public void user_is_click_on_Welcome_user_button()
    {
        driver.findElement(By.id("welcome")).click();
    }

    @Then("^user clicks on the Logout button$")
    public void user_clicks_on_the_Logout_button()
    {
        driver.findElement(By.partialLinkText("Logout")).click();
        driver.close();
    }
    
    @After
    public void quite() {
        driver.quit();
    }
}
