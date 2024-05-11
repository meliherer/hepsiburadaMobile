package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class hepsiburadaLoginPages {

    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    By hesabimButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Hesabım\")");
    By epostaBox = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"txtUserName\")");
    By sifreBox = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"txtPassword\")");
    By girisYapSecButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Giriş yap\")");
    By cikisYapButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Çıkış yap\")");;
    By tamamButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"TAMAM\")");
    By girisYapButonu = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"btnLogin\")");


    public hepsiburadaLoginPages(AppiumDriver driver){
        this.driver = driver;
        this.wait =  new WebDriverWait(driver,(10));
        this.elementHelper = new ElementHelper(driver);



    }




    public void hesabimTikla() throws InterruptedException {


        driver.findElement(hesabimButonu).click();
        driver.findElement(hesabimButonu).click();

    }
    public void girisYapSec() {
        driver.findElement(girisYapSecButonu).click();
    }
    public void kullaniciEpostaGir() throws InterruptedException {
        driver.findElement(epostaBox).click();
        elementHelper.sendKeys(epostaBox,"kahekam455@ahieh.com");

    }

    public void kullaniciSifreGir() {
        driver.findElement(sifreBox).click();
        elementHelper.sendKeys(sifreBox,"Testmail123");
    }
    public void girisButonuBas() {

        driver.findElement(girisYapButonu).click();
    }
    public void girisDogrula()  {


        elementHelper.checkVisible(tamamButonu);

        driver.findElement(tamamButonu).click();
    }



}
