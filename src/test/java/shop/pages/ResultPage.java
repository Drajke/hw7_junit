package shop.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;


public class ResultPage {
    public ResultPage shouldHaveText(String value){
        $(".a3La7AH14").shouldHave(text(value));
        return this;
    }

    public ResultPage firstSearchResult(String value){
        $(".k6auoGJSo").shouldHave(text(value));
        return this;
    }

    public ResultPage companyNameSearchName(String value){
        $(".bbU3Ps1qD").shouldHave(text(value));
        return this;
    }
}