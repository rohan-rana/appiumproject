package com.appium.ios.gestures;

import org.testng.Assert;
import org.testng.annotations.Test;

import setup.BaseClass;

public class VerifyScrollTest extends BaseClass {

	/**
	 * Verify scroll to element test.
	 */
	@Test
	public void verifyScrollToElementTest() {
		ios.scrollUpToSearchBarOption();
		Assert.assertTrue(ios.isSearchBarsOptionDisplayed());
	}
}
