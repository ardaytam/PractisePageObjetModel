package login;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccesfullLogin() {
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword(("SuperSecretPassword!"));
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        //String alertmessage = secureAreaPage.getAlertText();

        Assertions.assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),"Alert text is incorrect");
//        Assertions.assertEquals("You logged into a secure area!", alertmessage, "Alert text is incorrect");//nem lesz jó mert sortörést is egy x-et is beletesz
    }
}
