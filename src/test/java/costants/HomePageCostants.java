package costants;

import org.openqa.selenium.By;

public class HomePageCostants {
    public static final By SEARCH_BUTON = By.cssSelector("span[class='common-sprite button-search']");

    public static final By PRODUCTS = By.cssSelector("a[class='pr-img-link']");

    public static final By PRICE = By.xpath("//span[text()='Kitapyurdu Fiyatı:']");
    public static final By BASKETICON_BUTTON =By.cssSelector("span[id='cart-items']");
    public static final By GOBASKET_BUTTON =By.id("js-cart");
    public static final By REFLESH_ICON =By.cssSelector("i[title='Güncelle']");

    public static final By INFO_TEXT =By.xpath("//h2[text()='Sepetiniz güncelleniyor!']");

    public static final By COUNT_INPUT =By.cssSelector("input[name='quantity']");
}
