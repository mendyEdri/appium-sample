import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class IOSDriverFactory {
    public static void main(String[] args) throws MalformedURLException {
        androidFactory();
    }

    public static void androidFactory() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        // make sure to replace it with your own path to generated apk
        capabilities.setCapability(MobileCapabilityType.APP, "/Users/{YOUR_USER}/Desktop/TestAnroid/app/build/outputs/apk/app-debug.apk");
        capabilities.setCapability("noReset", true);
        capabilities.setCapability("fullReset", false);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.APPIUM);

        AndroidDriver ad = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        ad.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        // prints the view hierarchy
        System.out.println(ad.getPageSource());

        // the actual test. replace it with your own button given id (inside android project)
        ad.findElementById("theButton").click();
    }

    public static void iosFactory() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.3");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone Simulator");
        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability(MobileCapabilityType.APP, "/Users/mendyedri/Desktop/Test/build/Release-iphonesimulator/Test.app");
        capabilities.setCapability("noReset", true);
        capabilities.setCapability("fullReset", false);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        capabilities.setCapability(IOSMobileCapabilityType.LAUNCH_TIMEOUT, 5000000);

        IOSDriver wd = new IOSDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        System.out.println(wd.getPageSource());
        wd.findElementByAccessibilityId("theButton").click();
        //wd.quit();
    }
}
