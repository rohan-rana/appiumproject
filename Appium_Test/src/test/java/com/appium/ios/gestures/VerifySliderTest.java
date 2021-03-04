package com.appium.ios.gestures;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.appium.page.ios.SlidersPage;

import setup.BaseClass;

public class VerifySliderTest extends BaseClass {

	/**
	 * Verify slider test.
	 */
	@Test
	public void verifySliderTest() {
		SlidersPage sliders = ios.clickOnSliders();
		sliders.setValueOfSlider("1%");
		Assert.assertEquals(sliders.getSliderAttribute(), "100%");
	}
}
