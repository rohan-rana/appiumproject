package setup;

import java.io.IOException;

import org.testng.annotations.BeforeClass;

import com.appium.page.android.MainPage;
import com.appium.page.ios.HomePage;

public class BaseClass extends DriverInstance {

	public HomePage ios;

	public DriverInstance setup = new DriverInstance();

	public MainPage android;

	/**
	 * Gets the home page instance.
	 *
	 * @return the home page instance
	 */
	@BeforeClass
	public void getHomePageInstance() throws IOException {

		if (setup.getExistingData("platform").equalsIgnoreCase("ios"))
			ios = new HomePage(getWebDriver());
		if (setup.getExistingData("platform").equalsIgnoreCase("android"))
			android = new MainPage(getWebDriver());
	}
}