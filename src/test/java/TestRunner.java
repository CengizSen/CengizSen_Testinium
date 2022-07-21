import base.BaseClass;
import org.junit.Test;

import java.io.IOException;

import static tests.HomePage.*;
import static tests.BasketPage.*;

public class TestRunner extends BaseClass {

@Test
    public void runScenario () throws IOException {
        homePageItemCheck();
        searchAndSelectProduct();
        addBasket();
        goBasket();
        checkItemAndPrice();
    }
}
