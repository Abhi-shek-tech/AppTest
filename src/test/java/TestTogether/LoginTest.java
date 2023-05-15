package TestTogether;

import java.net.MalformedURLException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import pages.LoginClass;

public class LoginTest {
	
	static AppiumDriver<WebElement> driver;

    @BeforeTest(alwaysRun = true)
    public void setUp() throws MalformedURLException {
        DriverSingleton driverSingleton = DriverSingleton.getinstanceOfDriverSingletonClass();
        driver = driverSingleton.getDriver();
    }

    @Test
    public void testLogin() throws InterruptedException {
        LoginClass loginPage = new LoginClass(driver);
        
        loginPage.testLogin();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}