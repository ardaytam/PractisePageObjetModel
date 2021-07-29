package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSentPage {
    private WebDriver driver;
    private By emailSentAlert =By.tagName("h1"); //most épp Internal Server Error de jó lesz az is


    public EmailSentPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getEmailAlertText (){
        return driver.findElement(emailSentAlert).getText();
    }

}
