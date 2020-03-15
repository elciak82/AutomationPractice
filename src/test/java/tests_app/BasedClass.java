package tests_app;

import com.google.common.collect.ImmutableMap;
import helpers.Configuration;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.HeaderPage;
import pages.LoginPage;

import java.net.MalformedURLException;
import java.net.URL;

import static helpers.Configuration.getConfiguration;

public class BasedClass {

    public AppiumDriver<MobileElement> driver;

    @Before
    public void setUp(){
        try {
            DesiredCapabilities caps = new DesiredCapabilities();

            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "LG-H870");
            caps.setCapability(MobileCapabilityType.UDID, "LGH8706fc11981");
            caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
            caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
            caps.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));

            URL url = new URL("http://127.0.0.1:4723/wd/hub");

            driver = new AppiumDriver<MobileElement>(url, caps);
//            driver = new AndroidDriver<MobileElement>(url, caps);
//            driver = new IOSDriver<MobileElement>(url, caps);
        }
        catch (Exception exp) {
            System.out.println("Cause is: " + exp.getCause());
            System.out.println("Message is: " + exp.getMessage());
            exp.printStackTrace();
        }
    }

    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
