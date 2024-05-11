package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.security.Key;
import java.util.List;

public class hepsiburadaHomePages {


    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    By anaSayfamButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Ana Sayfam\")");
    By tumKategorilerButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Tüm Kategoriler\")");
    By searchBox = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Ürün, kategori veya marka ara\")");
    By fiyatAraligiButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Fiyat Aralığı\")");
    By fiyatMinBox = MobileBy.AndroidUIAutomator("new UiSelector().text(\"En az fiyat\")");
    By fiyatMaxBox = MobileBy.AndroidUIAutomator("new UiSelector().text(\"En çok fiyat\")");
    By fiyatUygulaButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Uygula\")");
    By lenovoAra = MobileBy.xpath("//*[contains(@resource-id, 'search_suggestion_title') and contains(@text, 'lenovo')]");
    By sepeteEkleButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sepete ekle\")");



    public hepsiburadaHomePages(AppiumDriver driver){
        this.driver = driver;
        this.wait =  new WebDriverWait(driver,(10));
        this.elementHelper = new ElementHelper(driver);

    }

    public void tumKategorilerTikla() {

        driver.findElement(anaSayfamButonu).click();
        driver.findElement(tumKategorilerButonu).click();

    }

    public void lenovoAra() throws InterruptedException {
        driver.findElement(searchBox).click();
        elementHelper.sendKeys(searchBox,"Lenovo");
        driver.findElement(lenovoAra).click();
    }

    public void fiyatFiltreTikla() {

        driver.findElement(fiyatAraligiButonu).click();
    }

    public void fiyatMinMaxBelirle() {
        driver.findElement(fiyatMinBox).click();
        elementHelper.sendKeys(fiyatMinBox,"8000");
        driver.findElement(fiyatMaxBox).click();
        elementHelper.sendKeys(fiyatMaxBox,"20000");
        driver.findElement(fiyatUygulaButonu).click();
    }

    public void urunDetayinaGit() {

        List< WebElement> ListofElement = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.pozitron.hepsiburada:id/clProductBoxTop\")"));

        ListofElement.get(2).click();
    }

    public void sepeteEkleButonKontrol() {

        elementHelper.checkVisible(sepeteEkleButonu);

    }
}
