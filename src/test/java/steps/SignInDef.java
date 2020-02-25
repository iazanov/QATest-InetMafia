package steps;

import Config.UserConfig;
import Pages.SignInPage;
import io.cucumber.java.en.Then;

public class SignInDef {
    SignInPage signInPage= new SignInPage();

    @Then("Input Login")
    public void inputLogin() {
        signInPage.inputLogin(UserConfig.USER_LOGIN);
    }

    @Then("Input Password")
    public void inputPassword() {
        signInPage.inputPassword(UserConfig.USER_PASSWORD);
    }


}
