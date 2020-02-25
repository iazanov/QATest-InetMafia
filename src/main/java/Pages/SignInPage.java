package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignInPage {
    private SelenideElement loginInput = $(By.name("nick"));
    private SelenideElement passwordInput = $(By.name("pass"));
    private SelenideElement nickInput = $(By.xpath("//*[@id=\"popup\"]/div/div[2]/div/form/input[1]"));
    private SelenideElement emailInput = $(By.xpath("//*[@id=\"popup\"]/div/div[2]/div/form/input[2]"));
    private SelenideElement newPasswordInput = $(By.xpath("//*[@id=\"popup\"]/div/div[2]/div/form/input[3]"));
    private SelenideElement changeNick = $(By.xpath("//*[@id=\"profile\"]/table/tbody/tr[2]/td[1]/ul/li[7]/a"));
    private SelenideElement NewNick = $(By.xpath("//*[@id=\"profile\"]/table/tbody/tr[2]/td[2]/div/form/input[1]"));


    public void inputLogin(String text) {
        this.loginInput.val(text);
    }

    public void inputPassword(String text) {
        this.passwordInput.val(text);
    }

    public void inputNick(String text) {
        this.nickInput.val(text);
    }

    public void inputEmail(String text) {
        this.emailInput.val(text);
    }

    public void inputNewPassword(String text) {
        this.newPasswordInput.val(text);
    }

    public void clickEnter() {
        newPasswordInput.pressEnter();
    }

    public void clickChangeNick() {
        changeNick.click();
    }

    public String getNewNick() {
        return NewNick.getValue();
    }
}
