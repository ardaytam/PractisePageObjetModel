package forgotpassword;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;
;

public class ForgotPasswordTest extends BaseTests {

    @Test
    public void testPasswordRecovering() {
        ForgotPasswordPage forgotpasswordpage = homePage.clickForgotPassword();
        forgotpasswordpage.setEmailField("hallolajos@bmail.com");

        EmailSentPage emailSentPage = forgotpasswordpage.clickRetrievePasswordButton();
        String alertmessage = emailSentPage.getEmailAlertText();
        Assertions.assertEquals("Internal Server Error", alertmessage, "Alert text is incorrect");

        //Assertions.assertTrue(emailSentPage.getEmailAlertText().contains("Internal Server Error"),"Alert text is incorrect");

    }
}
