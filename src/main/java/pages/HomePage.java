package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Testing https://the-internet.herokuapp.com/


public class HomePage {

    private WebDriver driver;

    //private By formAuthenticationLink = By.linkText("Form Authentication");
    // Its better to generalize the method (if there are many linked page)

    public HomePage(WebDriver driver) {   //HomePage objektum konstruktora
        this.driver = driver;            //paraméterben az  aktuális böngészőmeghajtót adjuk át pl. chromedriver
        // a tesztben a @BeforeAll setUp metódusa hívja meg és adja át a chtromedrivert, csakhogy az static
    }

    /*public void clickFormAuthentication(){
        driver.findElement(formAuthenticationLink).click(); //interact with the webelement, initialized above used as parameter
    }*/   //--> ehelyett jön az objektumorientált cucc

    public LoginPage clickFormAuthentication() {
        //driver.findElement(formAuthenticationLink).click(); //interact with the webelement, initialized above used as parameter
        clickLink("Form Authentication");  //there is only one method use this, if there are more -> place on the top
        return new LoginPage(driver);
    }

    public DropdownPage clickDropDown() {
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public ForgotPasswordPage clickForgotPassword() {
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }
    public HoversPage clickHovers() {
        clickLink("Hovers" );
        return new HoversPage(driver);
    }
    public KeyPressesPage clickKeyPresses() {
        clickLink("Key Presses" );
        return new KeyPressesPage(driver);
    }
    public HorizontalSliderPage clickHorizontalSlide() {
        clickLink("Horizontal Slider" );
        return new HorizontalSliderPage(driver);
    }
    public AlertsPage clickJavaScriptAlerts() {
        clickLink("JavaScript Alerts" );
        return new AlertsPage (driver);
    }




    private void clickLink(String linktext) { //private <-- tests do not need to call it
        driver.findElement(By.linkText(linktext)).click();
    }//generic method for clickingon a link
}