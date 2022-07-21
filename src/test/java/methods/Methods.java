package methods;


import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Methods extends BaseClass {

    public static WebDriverWait wait = new WebDriverWait(driver, 10);

    public static void hoverElement(By by) {
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(by);
        action.moveToElement(we).build().perform();
        logger.info(by+"elementin üzerine geldi");
    }

    public static WebElement findElement(By by) {
        return driver.findElement(by);
    }
    public static List<WebElement> findElements(By by) {
        List<WebElement> elements=driver.findElements(by);
        return elements;
    }
    public static void waitVisibilityClick(By by) {
        WebElement web=wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        web.click();
        logger.info(by+"Görüldü ve tıklan");
    }

    public static void waitClicableClick(By by) {
        WebElement we =wait.until(ExpectedConditions.elementToBeClickable(by));
        we.click();
        logger.info(by+"Görüldü ven tıklandı!");

    }

    public static void waitVisibilitySendKey(By by, String key) {
        WebElement we= wait.until(ExpectedConditions.elementToBeClickable(by));
        we.sendKeys(key);
        logger.info(by+"'lı  görüldü   "+key+" değerimiz girildi");

    }

    public static void waitClicableSubmit(By by) {
        WebElement we= wait.until(ExpectedConditions.elementToBeClickable(by));
        we.submit();
        logger.info(by+"Submit buttonuna tıklandı ");
    }
    public static String getValue(By by)
    {
        String elementString = findElement(by).getText();
        return elementString;

    }
    public static void clearToElement(By by) {

        findElement(by).clear();
    }



}
