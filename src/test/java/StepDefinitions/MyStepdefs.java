package StepDefinitions;

import Pages.HomePage;
import Pages.ProductPage;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyStepdefs {

   WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
   HomePage homepage = new HomePage(Driver.getDriver());
   ProductPage productPage = new ProductPage(Driver.getDriver());
    @When("Ana sayfa açılır.")//
    public void ana_sayfa_açılır() {
    Driver.getDriver().get("https://www.e-bebek.com");
     System.out.println("E-bebek sayfasina gidildi.");
    }
    @Given("Arama çubuğuna <{string}> yazılır.Arama yapılır")
    public void arama_çubuğuna_yazılır_arama_yapılır(String string) {
     homepage.sendValueSearchBox(string);
     System.out.println("Arama butonuna biberon yazildi.");
    }
    @Given("İlk ürüne tıklanır.")
    public void i̇lk_ürüne_tıklanır() {
    productPage.clickProduct();
     System.out.println("Ilk urune tiklandi.");
    }
    @Then("{string} butonuna tıklanır")
    public void butonuna_tıklanır(String string) {
    productPage.setAddtoCartBtn();
     System.out.println("Sepete Ekle Butonuna Tiklandi.");
    }
    @Then("\"Sepeti Gör” butonuna tıklanır.")
    public void sepeti_gör_butonuna_tıklanır() {
    productPage.gotoBtnShowCard();
     System.out.println("Sepeti Gor Butonuna Tiklanir.");
    }
    @Then("Ürünün sepete eklendiği kontrol edilir.")
    public void ürünün_sepete_eklendiği_kontrol_edilir() {
     wait.until(ExpectedConditions.urlToBe("https://www.e-bebek.com/cart"));
     System.out.println("Element Gorulene kadar beklendi.");
     Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://www.e-bebek.com/cart");
     System.out.println("Urunun Sepete Eklendigi Kontrol Edildi. ");

    }
}
