package hover;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.HoversPage;

public class HoverTest extends BaseTests {


    @Test
    public void testHoverUser1() {
        HoversPage hoversPage = homePage.clickHovers();
        HoversPage.FigureCaption caption = hoversPage.hoverOverFigure(1);
        Assertions.assertTrue(caption.isCaptionDisplayed(), "Caption is not displayed");
        Assertions.assertEquals("name: user1", caption.getTitle(), "Caption title is incorrect");
        Assertions.assertEquals("View profile", caption.getLinkText(), "Caption link text is incorrect");
        Assertions.assertTrue( caption.getLink().endsWith("/users/1"), "Link text is incorrect");


    }
}
