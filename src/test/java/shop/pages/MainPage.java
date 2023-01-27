package shop.pages;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    public MainPage openPage(){
        open("https://kdvonline.ru/");
        return this;
    }
    public MainPage setValueAndEnter(String value){
        $(".cPeuJuGbq").setValue(value).pressEnter();
        return this;
    }

}
