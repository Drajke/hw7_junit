package shop.tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ByCsvTest extends BaseTest{
    @CsvSource({
            "Шоколад яшкино, «Яшкино»",
            "Чай ETRE, «ETRE»"
    })

    @ParameterizedTest(name = "Первый результат поиска товара {0} должен содержать товар от выбранной компании-изготовителя: {1}")
    @Tags({@Tag("BLOCKER"), @Tag("UI_TEST")})
    void searchResultShouldHaveValue(String searchValue, String expectValue){
        mainPage.openPage()
                .setValueAndEnter(searchValue);
        resultSearchPage.firstSearchResult(expectValue);
    }

}