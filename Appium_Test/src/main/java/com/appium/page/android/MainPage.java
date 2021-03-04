package com.appium.page.android;

import org.openqa.selenium.WebElement;

import common.CommonMethods;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import setup.AbstractPage;



public class MainPage extends AbstractPage<MainPage> {

	/** The common. */
	private CommonMethods common = new CommonMethods();

	/**
	 * Instantiates a new android home page.
	 *
	 * @param driver the driver
	 */
	public MainPage(AppiumDriver<?> driver) {
		super(driver);
	}

	/** The views option. */
	@AndroidFindBy(accessibility = "Views")
	private WebElement viewsOption;

	/**
	 * Click on views option.
	 *
	 * @return the android view page
	 */
	public ViewPage clickOnViewsOption() {
		common.clickOnElement(viewsOption);
		return new ViewPage(driver);
	}
}