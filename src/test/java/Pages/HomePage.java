package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
WebDriver ldriver ;

public HomePage(WebDriver gdriver){
    ldriver =gdriver;
}

By  searchbox = By.id("txtSearchBox");

private WebElement getSearchBox(){
    return ldriver.findElement(searchbox);
}


public void sendValueSearchBox(String searchbox){
getSearchBox().sendKeys(searchbox + Keys.ENTER);
}
}
