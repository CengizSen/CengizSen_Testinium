package costants;

import org.openqa.selenium.By;

public class BasketPageCostants {    public static final By BASKET_TITLE = By.cssSelector("a[class='header-cart']");
    public static final By ADD_BASKET = By.xpath("//span[text()='Sepete Ekle']");

    public static final By BASKET_REMOVE_BUTTON = By.cssSelector("td[class='remove']");

}
