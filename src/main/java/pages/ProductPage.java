package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver d){ super(d);}

    By books = By.linkText("Books");
    By addBtn = By.cssSelector(".product-item input[value='Add to cart']");

    public void openBooks(){ wait.until(ExpectedConditions.elementToBeClickable(books)).click();}
    public void addFirstBook(){ wait.until(ExpectedConditions.elementToBeClickable(addBtn)).click();}
}
