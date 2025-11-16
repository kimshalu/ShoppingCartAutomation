package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver d){ super(d);}

    By loginLink = By.linkText("Log in");
    By email = By.id("Email");
    By pass = By.id("Password");
    By btn = By.cssSelector("input.login-button");
    By logout = By.linkText("Log out");

    public void login(String e,String p){
        wait.until(ExpectedConditions.elementToBeClickable(loginLink)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(email)).sendKeys(e);
        driver.findElement(pass).sendKeys(p);
        driver.findElement(btn).click();
    }
    public boolean isLoggedIn(){
        try { return wait.until(ExpectedConditions.visibilityOfElementLocated(logout)).isDisplayed();}
        catch(Exception ex){return false;}
    }
}
