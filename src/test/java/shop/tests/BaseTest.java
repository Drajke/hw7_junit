package shop.tests;
import com.codeborne.selenide.Configuration;
import shop.pages.MainPage;
import shop.pages.ResultPage;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    MainPage mainPage = new MainPage();
    ResultPage resultSearchPage = new ResultPage();
    @BeforeAll
    public static void setUp(){
        Configuration.browserSize="1920x1080";
    }
}
