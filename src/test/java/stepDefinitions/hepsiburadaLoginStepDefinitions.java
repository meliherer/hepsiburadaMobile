package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.hepsiburadaLoginPages;
import util.DriverFactory;

public class hepsiburadaLoginStepDefinitions {

        hepsiburadaLoginPages hepsiburadaLoginPages = new hepsiburadaLoginPages(DriverFactory.getDriver());




        @When("Hesabım tabına tıkla")
        public void hesabimTabinaTikla() throws InterruptedException {

                hepsiburadaLoginPages.hesabimTikla();
        }
        @When("Giriş yap butonuna tıkla")
        public void girisYapSec(){

                hepsiburadaLoginPages.girisYapSec();
        }



        @When("Kullanıcı adı gir")
        public void kullaniciAdiGir() throws InterruptedException {

                hepsiburadaLoginPages.kullaniciEpostaGir();
        }
        @When("Kullanıcı şifre gir")
        public void kullaniciSifreGir(){

                hepsiburadaLoginPages.kullaniciSifreGir();
        }

        @When("Giriş için butona bas")
         public void girisButonuBas(){

                hepsiburadaLoginPages.girisButonuBas();
        }

        @Then("Giriş yapıldığını doğrula")
        public void girisDogrula() {

                hepsiburadaLoginPages.girisDogrula();
        }


}
