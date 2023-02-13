package ru.open.pages;

import static com.codeborne.selenide.Condition.href;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;

public class MainPage {

    public void clickOnMoreButton() {
        $$("#headerMenuBlockId .HeaderMenu_header-menu__6loXt").findBy(text("Еще")).click();
    }

    public void checkTextInDropDownMenu() {
        $(".MoreMenuItemsBlock_more-menu-items__tuFkM").shouldHave(text("Страхование"));
    }

    public void clickOnCareerInBankButton() {
        $$(".MoreMenuItemsBlock_more-menu-items__tuFkM .MoreMenuItemsBlock_more-menu-item__PkBg5")
                .findBy(text("Карьера в банке")).click();
    }

    public void checkCareerUrl() {
        webdriver().shouldHave(url("https://talent.open.ru/?from=main_menu"));
    }

    public void enterDevInTheField() {
        $(".ant-input").setValue("Разработчик");
    }
    public void clickOnSearchVacanciesButton() {
        $(".ant-row").find(byText("Найти")).click();
    }

    public void checkOpenVacancies() {
        $(".title_2n0EE").shouldHave(text("Вакансии «Открытия»"));
    }

    public void clickOnCreditsButton() {
        $$("#headerMenuBlockId .HeaderMenu_header-menu__6loXt").findBy(text("Кредиты")).click();
    }

    public void checkTextInCreditsDropDownMenu() {
        $(".HeaderMenuContentSection_header-menu-content-section__rNx3I")
                .shouldHave(text("Потребительские кредиты"));
    }

    public void clickOnCashLoanButton() {
        $(".HeaderMenuContentSection_header-menu-content-section__rNx3I")
                .find(byText("Кредит наличными")).click();
    }

    public void checkCreditsUrl() {
        webdriver().shouldHave(url("https://www.open.ru/credits/cash/universal?from=main_menu"));
    }

    public void clickOnVKPageIcon() {
        $$(".FooterSocialLinks_footer-social-links__FpQkI a")
                .findBy(href("https://vk.com/otkritiecorp")).click();
    }

    public void checkVKUrl() {
        webdriver().shouldHave(url("https://vk.com/otkritiecorp"));
    }

    public void clickOnOfficeAndATMButton() {
        $(".CurrencyExchangeMainMap_currency-exchange-main-map-button__lSxSH").click();
    }

    public void checkMapsUrl() {
        webdriver().shouldHave(url("https://www.open.ru/map"));
    }

    public void switchToMapsIframe() {
        switchTo().frame($("#iframe_container iframe"));
    }

    public void clickOnAddressOfTheOffice() {
        $("._2eaOsaNlkAAfxmRdDR9Sma").$(byText("Офис \"Ходынское поле\"")).click();
    }

    public void checkWorkingHoursOfTheOffice() {
        $("._2aRGeg5u_4LGPRPSie8koO").shouldHave(text("Время работы"));
    }

    public void clickOnInternetBankButton() {
        $("#headerButtonsBlockId").$(byText("Интернет-банк")).click();
    }

    public void checkTextInDropDownMenuInternetBank() {
        $(".ButtonMenu_button-menu__lsGsO").shouldHave(text("Для частных лиц"));
    }

    public void clickOnOtkritieInternetBank() {
        $$(".ButtonMenu_button-menu-section__JeC6t a")
                .findBy(href("https://ib.open.ru/webbank/#/login")).click();
    }

    public void checkHeaderInInternetBankPage() {
        $(".wb-login-credentials-step__header h1").shouldHave(text("Интернет-банк"));
    }

    public void clickOnBurgerButton() {
        $(".HeaderButtons_header-hamburger-button__4F8v2").click();
    }

    public void checkBurgerButtonMenuHasText() {
        $(".HamburgerMenu_hamburger-menu__A7EQU").shouldHave(text("Дебетовые карты"));
    }

    public void clickOnPremiumServiceButton() {
        $(".HamburgerMenuBottomBlockSection_hamburger-menu-content-bottom-block-column__dakYM")
                .$(byText("Премиальное обслуживание")).click();
    }

    public void checkPremiumServiceUrl() {
        webdriver().shouldHave(url("https://www.open.ru/premium?from=main_menu"));
    }

    public void clickOnAnotherCityButton() {
        $(".FooterCity_city-text__KFkUl").click();
    }

    public void checkHeaderInDropDownMenuWithCitySelection() {
        $(".modal-dialog-title-wrapper h2").shouldHave(text("Выберите город"));
    }

    public void enterMoscowInTheField(String city) {
        $(".open-ui-search-input").setValue(city);
    }

    public void clickOnMoscowCity(String city) {
        $(".modal-dialog-content").$(byText(city)).click();
    }

    public void checkMoscowIsSelect(String city) {
        $(".FooterCity_city-text__KFkUl").shouldHave(text(city));
    }
}
