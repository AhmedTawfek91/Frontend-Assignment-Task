package Tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.chrome.ChromeOptions;

import static Utils.Constants.URL;

public class TestBase extends AbstractTestNGCucumberTests {

    public static WebDriver driver;

    @BeforeTest
    public void initiateBrowser()
    {
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\Drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.navigate().to(URL);
        driver.manage().window().maximize();
    }
}

