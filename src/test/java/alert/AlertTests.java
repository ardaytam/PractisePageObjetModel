package alert;

import base.BaseTests;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.AlertsPage;

@Epic("Login Tests Epic")
@Feature("Invalid Login Features")

public class AlertTests extends BaseTests {

    @Test
    @Story("User tries to login the system with invalid username and invalid password.")
    @Description("Invalid Login Test with Invalid Username and Invalid Password.")
    public void testAcceptAlert() {
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        Assertions.assertEquals("You successfully clicked an alert", alertsPage.getResult());
    }

    @Test
    @Story("User tries to login the system with invalid username and invalid password.")
    @Description("Invalid Login Test with Invalid Username and Invalid Password.")
    public void testGetTextFromAlert() {
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alertGetText();
        alertsPage.alert_clickToDismiss();
        Assertions.assertEquals("I am a JS Confirm", text);
    }

    @Test
    @Story("User tries to login the system with invalid username and invalid password.")
    @Description("Invalid Login Test with Invalid Username and Invalid Password.")
    public void testSendTextToPromptAlert() {
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPrompt();
        String text = "Prompt message";
        alertsPage.alertSetInput(text);
        alertsPage.alert_clickToAccept();
        Assertions.assertEquals("You entered: " + text, alertsPage.getResult(), "Result text is incorrect");
    }

}
