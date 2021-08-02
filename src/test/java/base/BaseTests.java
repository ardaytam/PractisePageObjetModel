package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.HomePage;

import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//JUnitException: @BeforeAll method 'public void base.BaseTests.setUp()' must be static
// unless the test class is annotated with @TestInstance(Lifecycle.PER_CLASS).

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage; //test classes can inherit from this


    @BeforeAll
    public void setUp() {

//        System.setProperty("webdriver.chrome.webdriver", "chromedriver.exe");
//        driver = new ChromeDriver();
//System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); /A WebDriver manager elintézi ezt a dolgot

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized"); // teljes képernyőőben való használat
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");
        driver = new ChromeDriver(options); // új böngésző nyitása az opciókkal
        driver.get("https://the-internet.herokuapp.com/");


        homePage = new HomePage(driver);

    }

    @BeforeEach
    public void goHomePage (){
        driver.get("https://the-internet.herokuapp.com/"); //PL Egy tesztosztályban több teszteset van ugyanonnan induljanak
    }

    @AfterAll
    public void tearDown() {
        driver.quit();
    }

}




//        WebElement shiftingContentLink = driver.findElement(By.linkText("Shifting Content"));
//        shiftingContentLink.click();
//        WebElement menuElementLink = driver.findElement(By.linkText("Example 1: Menu Element"));
//        menuElementLink.click();
//        List<WebElement> menuitems =  driver.findElements(By.xpath("//*[@id=\"content\"]/div/ul/li"));
//        System.out.println(menuitems.size());
//        driver.manage().window().fullscreen();
//        driver.manage().window().setSize(new Dimension(375, 812)); //e.g. mobile devices
//        System.out.println(driver.getTitle());