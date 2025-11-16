package tests;

import base.TestBase;
import pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @Test
    public void validLoginTest(){
        LoginPage lp = new LoginPage(driver);
        lp.login("shalu55@gmail.com","Abhisha");
        Assert.assertTrue(lp.isLoggedIn());
    }
}
