package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.hepsiburadaHomePages;
import util.DriverFactory;


public class hepsiburadaHomeStepDefinitions {

    hepsiburadaHomePages hepsiburadaHomePages = new hepsiburadaHomePages(DriverFactory.getDriver());


    @When("Tüm kategoriler tıkla")
    public void tumKategorilerTıkla() {

        hepsiburadaHomePages.tumKategorilerTikla();
    }

    @When("Arama barına lenovo yaz")
    public void aramaBarinaLenovoYaz() throws InterruptedException {

        hepsiburadaHomePages.lenovoAra();
    }

    @When("Fiyat aralığı filtresine tıkla")
    public void fiyatAraligiFiltresineTıkla() {

        hepsiburadaHomePages.fiyatFiltreTikla();
    }

    @When("Filtre minimum ve maksimum belirle")
    public void filtreMinimumVeMaksimumBelirle() {
        hepsiburadaHomePages.fiyatMinMaxBelirle();
    }

    @When("Ürünlerden birinin detayına git")
    public void urunlerdenBirininDetayinaGit() {
        hepsiburadaHomePages.urunDetayinaGit();
    }

    @Then("Sepete ekle butonunu kontrol et")
    public void sepeteEkleButonunuKontrolEt() {
        hepsiburadaHomePages.sepeteEkleButonKontrol();
    }
}
