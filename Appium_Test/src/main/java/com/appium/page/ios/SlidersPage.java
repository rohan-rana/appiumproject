package com.appium.page.ios;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import setup.AbstractPage;

public class SlidersPage extends AbstractPage<SlidersPage> {

	protected SlidersPage(AppiumDriver<?> driver) {
		super(driver);
	}

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeSlider")
	private IOSElement firstSlider;

	/**
	 * Sets the value of slider.
	 *
	 * @param value the new value of slider
	 */
	public void setValueOfSlider(String value) {
		firstSlider.setValue(value);
	}

	/**
	 * Verify slider movement.
	 *
	 * @return the string
	 */
	public String getSliderAttribute() {
		return firstSlider.getAttribute("value");
	}
}