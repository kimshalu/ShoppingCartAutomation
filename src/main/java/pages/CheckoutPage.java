package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CheckoutPage extends BasePage{
    public CheckoutPage(WebDriver d){ super(d);}

    By checkout = By.id("checkout");

    public void proceed(){ wait.until(ExpectedConditions.elementToBeClickable(checkout)).click();}
}
