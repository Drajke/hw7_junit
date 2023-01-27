package shop.tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class ByCsvFileTest extends BaseTest{

    @CsvFileSource(resources = "/testdata.csv")
    @ParameterizedTest(name = "Результаты поиска товара {0} должны содержать хотя бы один товар от этой компании-изготовителя: {1}")
    @Tags({@Tag("BLOCKER"), @Tag("UI_TEST")})
    void searchResultShouldHaveValue(
            String searchValue,
            String expectValue
    ) {
        mainPage.openPage()
                .setValueAndEnter(searchValue);
        resultSearchPage.companyNameSearchName(expectValue);
    }
}