package tests;

import base.TestBase;
import pages.LoginPage;
import pages.ProductPage;
import pages.CartPage;
import pages.CheckoutPage;
import org.testng.annotations.Test;

public class CheckoutTest extends TestBase {

    @Test
    public void checkout() {

        // 1. LOGIN (required)
        LoginPage login = new LoginPage(driver);
        login.login("shalu55@gmail.com", "Abhisha"); // Use VALID credentials

        // 2. ADD A PRODUCT TO CART (required before checkout)
        ProductPage product = new ProductPage(driver);
        product.openBooks();
        product.addFirstBook();  // <-- Your EXISTING method

        // 3. OPEN CART
        CartPage cart = new CartPage(driver);
        cart.openCart();

        // 4. PROCEED TO CHECKOUT
        CheckoutPage checkout = new CheckoutPage(driver);
        checkout.proceed();   // <-- Your EXISTING method

        // No assertion needed — if no TimeoutException, test passes
    }
}
