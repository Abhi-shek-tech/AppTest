package TestTogether;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverSingleton {
    private AppiumDriver<WebElement> driver = null;
    private static DriverSingleton instanceOfSingletonBrowserClass = null;

    private DriverSingleton() throws MalformedURLException {
    	DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.0");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        cap.setCapability("appPackage", "com.avegen.together");
        cap.setCapability("appActivity", "com.avegen.together.MainActivity");

        // Set the Appium server URL and initialize the driver
        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<WebElement>(url, cap);
        
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public static DriverSingleton getinstanceOfDriverSingletonClass() {
        if (instanceOfSingletonBrowserClass == null) {
            try {
                instanceOfSingletonBrowserClass = new DriverSingleton();
            } catch (Exception var1) {
                var1.printStackTrace();
            }
        }

        return instanceOfSingletonBrowserClass;
    }

    public AppiumDriver<WebElement> getDriver() {
        return this.driver;
    }

    public void closeDriver() {
        this.driver.close();
    }
}