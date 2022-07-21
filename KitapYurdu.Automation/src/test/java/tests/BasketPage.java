package tests;

import methods.Methods;
import org.junit.Assert;

import static base.BaseClass.*;
import static costants.BasketPageCostants.*;
import static costants.HomePageCostants.*;
import static costants.MainPageCostants.*;
import static tests.HomePage.*;

public class BasketPage {

    public static void goBasket() {
        Methods.waitClicableClick(BASKETICON_BUTTON);
        Methods.waitClicableClick(GOBASKET_BUTTON);
    }


    public static void checkItemAndPrice()  {
        Methods.findElement(COUNT_INPUT).clear();
        Methods.waitVisibilitySendKey(COUNT_INPUT, "2");

        Methods.waitClicableClick(REFLESH_ICON);
        Assert.assertEquals(Methods.findElement(INFO_TEXT).isDisplayed(), true);

        Methods.waitClicableClick(BASKET_REMOVE_BUTTON);
    }

}
