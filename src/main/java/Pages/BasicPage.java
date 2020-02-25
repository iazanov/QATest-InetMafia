package Pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasicPage {
    public void clickButton(String text){
            $(By.xpath("//td[@class='login']")).click();
    }
    public void clickButtonEnter(String text){
        $(By.name("pass")).pressEnter();
    }
    public void clickProfile(){
        $(By.xpath("//td[@class='profile']")).click();
    }
    public void contentIsVisible(String text){
        $(By.xpath("//input[@value='"+text+"']")).shouldBe(Condition.visible);
    }
}

