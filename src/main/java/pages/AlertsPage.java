package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {

    private WebDriver driver;
    private By triggerAlertButton = By.xpath("//button[text()=\"Click for JS Alert\"]");
    private By triggerConfirmtButton = By.xpath("//button[text()=\"Click for JS Confirm\"]");
    private By triggerPrompt = By.xpath("//button[text()=\"Click for JS Prompt\"]");

    private By results = By.id("result");

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void triggerAlert() {
        driver.findElement(triggerAlertButton).click();
    }

    public void triggerConfirm() {
        driver.findElement(triggerConfirmtButton).click();
    }

    public void triggerPrompt() {
        driver.findElement(triggerPrompt).click();
    }

    public void alert_clickToAccept() {
        driver.switchTo().alert().accept(); //a switchTo metódussal kiugrunk a DOM-ból át a JS alertre
    }

    public void alert_clickToDismiss() {
        driver.switchTo().alert().dismiss(); //a switchTo metódussal kiugrunk a DOM-ból át a JS alertre
    }

    public String alertGetText() {
        return driver.switchTo().alert().getText();
    }
    public void alertSetInput(String text) {
       driver.switchTo().alert().sendKeys(text);
    }

    public String getResult() {
        return driver.findElement(results).getText();
    }

}
