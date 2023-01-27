package shop.tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ByValueTest extends BaseTest{
    @ValueSource(
            strings = {"Трубочки", "Вафли"}
    )

    @ParameterizedTest(name = "Название искомого товара должно присутствовать в названии раздела: {0}")
    @Tags({@Tag("BLOCKER"), @Tag("UI_TEST")})
    void searchResultShouldHaveValue(String value){
        mainPage.openPage()
                .setValueAndEnter(value);
        resultSearchPage.shouldHaveText(value);
    }

}