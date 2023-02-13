package ru.open.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static ru.open.tests.TestData.city;

public class OpenRuTests extends TestBase{

    @BeforeEach
    void setUp() {
        open("https://www.open.ru/");
        $(".CookieWarning_cookie-warning-button__XaO44").click();
    }

    @DisplayName("Check developer vacancies on career page")
    @Test
    public void checkDevVacanciesOnCareerPage() {
        step("Click on 'more' button and check text in drop-down menu", () -> {
            mainPage.clickOnMoreButton();
            mainPage.checkTextInDropDownMenu();
        });
        step("Click on 'career in bank' button", () -> {
            mainPage.clickOnCareerInBankButton();
        });
        step("Check url", () -> {
            mainPage.checkCareerUrl();
        });
        step("Enter developer in the field and click on search button", () -> {
            mainPage.enterDevInTheField();
            mainPage.clickOnSearchVacanciesButton();
        });
        step("Check open page has vacancies of 'Otkritie' header", () -> {
            mainPage.checkOpenVacancies();
        });
    }

    @DisplayName("Check consumer credit page")
    @Test
    public void checkConsumerCreditPage() {
        step("Click on 'credits' button and check text in drop-down menu", () -> {
            mainPage.clickOnCreditsButton();
            mainPage.checkTextInCreditsDropDownMenu();
        });
        step("Click on 'cash loan' button and check url", () -> {
            mainPage.clickOnCashLoanButton();
            mainPage.checkCreditsUrl();
        });
    }

    @DisplayName("Check VK page button from footer")
    @Test
    public void checkOpenVKPAgeFromFooter() {
        step("Click on VK icon and check url", () -> {
            mainPage.clickOnVKPageIcon();
            mainPage.checkVKUrl();
        });
    }

    @DisplayName("Check address of the office in Yandex maps")
    @Test
    public void checkContactsButton() {
        step("Click on 'Office and ATM' button and check url", () -> {
            mainPage.clickOnOfficeAndATMButton();
            mainPage.checkMapsUrl();
        });
        step("Switch to iframe", () -> {
            mainPage.switchToMapsIframe();
        });
        step("Click on address of the office and check its working hours", () -> {
            mainPage.clickOnAddressOfTheOffice();
            mainPage.checkWorkingHoursOfTheOffice();
        });
    }

    @DisplayName("Check internet bank button")
    @Test
    public void checkInternetBankButton() {
        step("Click on 'internet bank' button and check text", () -> {
            mainPage.clickOnInternetBankButton();
            mainPage.checkTextInDropDownMenuInternetBank();
        });
        step("Click on 'internet bank Otrkitie' button and check header", () -> {
            mainPage.clickOnOtkritieInternetBank();
            mainPage.checkHeaderInInternetBankPage();
        });
    }

    @DisplayName("Check premium service button")
    @Test
    public void checkPremiumServiceButton() {
        step("Click on 'burger' button and check text", () -> {
            mainPage.clickOnBurgerButton();
            mainPage.checkBurgerButtonMenuHasText();
        });
        step("Click on 'premium service' button and check url", () -> {
            mainPage.clickOnPremiumServiceButton();
            mainPage.checkPremiumServiceUrl();
        });
    }

    @DisplayName("Check change city from footer")
    @Test
    public void checkCityFromFooter() {
        step("Click on 'another city' button and check drop-down menu has 'choose city' header", () -> {
            mainPage.clickOnAnotherCityButton();
            mainPage.checkHeaderInDropDownMenuWithCitySelection();
        });
        step("Enter 'Moscow' in the field and click on it", () -> {
            mainPage.enterMoscowInTheField(city);
            mainPage.clickOnMoscowCity(city);
        });
        step("Check Moscow is select in the footer of the site", () -> {
            mainPage.checkMoscowIsSelect(city);
        });
    }
}
