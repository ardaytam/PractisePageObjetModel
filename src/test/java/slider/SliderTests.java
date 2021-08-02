package slider;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import pages.HorizontalSliderPage;
import pages.KeyPressesPage;

public class SliderTests extends BaseTests {

    @Test
    public void testSlideToValue_4() {
        HorizontalSliderPage horizontalSliderPage = homePage.clickHorizontalSlide();
        horizontalSliderPage.settingSlider("4");

        Assertions.assertEquals("4", horizontalSliderPage.getSliderValue(), "Value is incorrect");

    }


}
