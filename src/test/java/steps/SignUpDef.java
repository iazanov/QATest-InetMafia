package steps;

import Config.UserConfig;
import org.apache.commons.lang3.RandomStringUtils;
import Pages.SignInPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import static app_context.RunContext.put;
import static app_context.RunContext.get;

public class SignUpDef {
    SignInPage signInPage = new SignInPage();

    @Then("Input Nick")
    public void inputNick() {
        String nick = "Azanov_" + RandomStringUtils.randomAlphabetic(5);
        signInPage.inputNick(nick);
        put("nick",nick);
    }

    @Then("Input Email")
    public void inputEmail() {
        String email = "Auto_" + RandomStringUtils.randomAlphabetic(5) + "@mail.ru";
        signInPage.inputEmail(email);
    }

    @Then("Input New Password")
    public void inputNewPassword() {
        signInPage.inputNewPassword(UserConfig.USER_PASSWORD);
            }

    @Then("Click Enter")
    public void clickEnter() {
        signInPage.clickEnter();
    }

    @Then("Click Change Nick")
    public void clickChangeNick() {
        signInPage.clickChangeNick();
    }

    @Then("Check User Name")
    public void checkUserName() {
        String expectNick = get("nick", String.class);
        String actualNick = signInPage.getNewNick();

        Assert.assertEquals(expectNick,actualNick);
    }
}
