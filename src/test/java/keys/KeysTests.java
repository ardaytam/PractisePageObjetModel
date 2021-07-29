package keys;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import pages.KeyPressesPage;

public class KeysTests extends BaseTests {

    @Test
    public void testBackspace() {
        KeyPressesPage keyPressesPage = homePage.clickKeyPresses();
        keyPressesPage.enterText("A" + Keys.BACK_SPACE); //A Keys osztály "tartalmazza" a billentyűzet karaktereit

        Assertions.assertEquals("You entered: BACK_SPACE", keyPressesPage.getResult());

    }
    @Test
    public void testAtSign() {
        KeyPressesPage keyPressesPage = homePage.clickKeyPresses();
        keyPressesPage.shortcutAtSign();


    }
}
