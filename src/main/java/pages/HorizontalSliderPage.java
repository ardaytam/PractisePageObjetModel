package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class HorizontalSliderPage {

    private WebDriver driver;
    private By sliderValue = By.xpath("//span[@id=\"range\"]");
    private By slider = By.xpath("//*[@type=\"range\"]");


    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void settingSlider(String value) {
        while (!getSliderValue().equals(value)) {
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }

    }

    public String getSliderValue() {
        return driver.findElement(sliderValue).getText();
    }
}
