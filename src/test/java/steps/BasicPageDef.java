package steps;

import Pages.BasicPage;
import io.cucumber.java.en.Then;

public class BasicPageDef {
    BasicPage basicPage = new BasicPage();

    @Then("Click {string} Button")
    public void clickButton(String arg0) {
    basicPage.clickButton(arg0);
    }

    @Then("Click Button {string}")
    public void clickButtonEnter(String arg0) {
        basicPage.clickButtonEnter(arg0);
    }

    @Then("Click Profile")
    public void clickProfile() {
        basicPage.clickProfile();
    }

    @Then("Content with {string} visible")
    public void contentWithVisible(String arg0) {
        basicPage.contentIsVisible(arg0);
    }
}
