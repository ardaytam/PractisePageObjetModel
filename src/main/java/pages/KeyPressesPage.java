package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KeyPressesPage {

    private WebDriver driver;
    private By keyPressInputField = By.id("target");
    private By resultText = By.id("result");

    public KeyPressesPage(WebDriver driver) {
        this.driver = driver;

    }

    public void enterText(String text) {
        driver.findElement(keyPressInputField).sendKeys(text);
    }

    public void shortcutAtSign () {
       enterText(Keys.chord(Keys.ALT, "v") + "=@");//make shortcuts possible
    }//ez azért meredeknek tűnik a különböző billentyűkiosztások miatt

    public String getResult() {
        return driver.findElement(resultText).getText();
    }


}
