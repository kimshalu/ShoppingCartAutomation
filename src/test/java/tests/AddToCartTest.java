package tests;

import base.TestBase;
import pages.ProductPage;
import pages.CartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends TestBase {
    @Test
    public void add(){
        ProductPage p = new ProductPage(driver);
        CartPage c = new CartPage(driver);
        p.openBooks();
        p.addFirstBook();
        c.openCart();
        Assert.assertTrue(true);
    }
}
