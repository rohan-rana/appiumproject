package setup;

import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverInstance {

	/** The driver. */
	public static AppiumDriver<?> driver;

	private URL url = null;

	/**
	 * Gets the driver.
	 *
	 * @return the driver
	 */
	public AppiumDriver<?> getWebDriver() throws IOException {
		String platform = getExistingData("platform");
		try {
			url = new URL(getExistingData("appiumurl"));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		if (platform.equalsIgnoreCase("android"))
			driver = new AndroidDriver<AndroidElement>(url, androidCapabilities());
		if (platform.equalsIgnoreCase("ios"))
			driver = new IOSDriver<IOSElement>(url, iosCapabilities());
		return driver;
	}

	/**
	 * Ios capabilities.
	 *
	 * @return the desired capabilities
	 */
	public DesiredCapabilities iosCapabilities() throws IOException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, getExistingData("iosDeviceName"));
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.IOS);
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
		capabilities.setCapability(MobileCapabilityType.APP, projectDir() + getExistingData("iosApp"));
		return capabilities;
	}

	/**
	 * Root path.
	 *
	 * @return the string
	 */
	public String projectDir() {
		return System.getProperty("user.dir");
	}

	/**
	 * Android capabilities.
	 *
	 * @return the desired capabilities
	 */
	public DesiredCapabilities androidCapabilities() throws IOException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, getExistingData("androidDeviceName"));
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		capabilities.setCapability(MobileCapabilityType.APP, projectDir() + getExistingData("androidApp"));
		return capabilities;
	}

	/**
	 * Gets the wait.
	 *
	 * @return the wait
	 */
	public WebDriverWait getWait() {
		return new WebDriverWait(driver, 10);
	}

	/**
	 * Gets the existing data.
	 *
	 * @param key the key
	 * @return the existing data
	 */
	public String getExistingData(String key) throws IOException {
		FileReader fs = new FileReader("/Users/rohan.rana/Desktop/Appium_Test/resource/Data.properties");
		Properties p = new Properties();
		p.load(fs);
		return p.getProperty(key);
	}
}