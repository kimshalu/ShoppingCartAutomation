package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BasePage{
    public CartPage(WebDriver d){ super(d);}

    By cart = By.cssSelector("a.ico-cart");
    By product = By.cssSelector(".product-name a");

    public void openCart(){ wait.until(ExpectedConditions.elementToBeClickable(cart)).click();}
    public String getProduct(){try{return wait.until(ExpectedConditions.visibilityOfElementLocated(product)).getText();}catch(Exception e){return "";}}
}
