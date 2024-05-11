package util;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.time.Duration;

public class ElementHelper {

    AppiumDriver driver;
    WebDriverWait wait;
    Actions action;


    public ElementHelper(AppiumDriver driver){

        this.driver = driver;
        this.wait = new WebDriverWait(driver,(10));
        this.action = new Actions(driver);

    }
    public WebElement presenceElement(By key) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(key));
    }


    public WebElement findElement (By key){

        WebElement element = presenceElement(key);
        return element ;
    }

    public void click(By key){
        findElement(key).click();
    }
    public void doubleClickEnter(By key){
        findElement(key).sendKeys(Keys.ENTER);
        findElement(key).sendKeys(Keys.ENTER);
    }

    public void sendKeys(By key, String text){

        findElement(key).sendKeys(text);
    }

    public void checkVisible(By key){

        wait.until(ExpectedConditions.presenceOfElementLocated(key));
    }



}
