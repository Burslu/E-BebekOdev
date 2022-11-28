package Pages;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {

    WebDriver ldriver;

   public ProductPage(WebDriver gdriver){
       ldriver = gdriver;
   }

   By product = By.xpath("//*[text()='Hoşgeldin Bebek Biberon Seti']");
   By addtoCartBtn = By.id("addToCartBtn");
   By btnShowCart = By.id("btnShowCart");



    private WebElement getProduct(){
        return ldriver.findElement(product);
    }
    private WebElement getaddtoCartBtn(){
        return ldriver.findElement(addtoCartBtn);
    }
    private WebElement getbtnShowCart(){
        return ldriver.findElement(btnShowCart);
    }

   public void clickProduct(){
       getProduct().click();
   }
    public void setAddtoCartBtn(){
        getaddtoCartBtn().click();
    }
    public void gotoBtnShowCard(){
       getbtnShowCart().click();
    }


}
