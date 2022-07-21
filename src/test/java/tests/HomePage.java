package tests;

import base.BaseClass;
import methods.Methods;

import static costants.BaseCostants.*;
import static costants.BasketPageCostants.ADD_BASKET;
import static costants.HomePageCostants.*;
import static costants.MainPageCostants.*;

import org.jooq.tools.csv.CSVReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Random;


public class HomePage extends BaseClass {
    public static String basketCount;
    public static String secondPrice;



    public static void homePageItemCheck() {
        Assert.assertEquals(Methods.findElement(LOGO_XPATH).isDisplayed(), true);
    }


    public static void searchAndSelectProduct() throws IOException {

        Methods.clearToElement(SEARCH_BAR);

        String csvPath = "src/test/resources/testData.csv";
        CSVReader csvReader;
        String[] csvCell;
        csvReader = new CSVReader(new FileReader((csvPath)));
        csvCell = csvReader.readNext();
        String searchText = csvCell[0];

        Methods.waitVisibilitySendKey(SEARCH_BAR, searchText);
        Methods.waitVisibilityClick(SEARCH_BUTON);

        List<WebElement> products = Methods.findElements(PRODUCTS);
        logger.info("boyutu : " + products.size());
        Random productSize = new Random();
        int rnd = productSize.nextInt(products.size());

        logger.info("Random üretilen Sayı:" + rnd);

        WebElement randomProduct = products.get(rnd);
        randomProduct.click();
    }


    public static void addBasket() {
        Methods.waitClicableClick(ADD_BASKET);
        Assert.assertEquals(Methods.findElement(PRICE).isDisplayed(), true);

        if(Methods.findElement(BASKETICON_BUTTON).isDisplayed())
        {
            basketCount = Methods.getValue(BASKETICON_BUTTON);
            if (basketCount.equals("1"))
            {
               logger.info("Ürün sepete eklendi.");
            }
            else
            {
               logger.info("Ürün sepete eklenemedi.");
            }
        }
    }



}
