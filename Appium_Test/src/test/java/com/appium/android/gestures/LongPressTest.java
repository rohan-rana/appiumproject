package com.appium.android.gestures;

import org.testng.annotations.Test;
import org.testng.Assert;

import com.appium.page.android.ViewPage;

import setup.BaseClass;

public class LongPressTest extends BaseClass {

	/**
	 * Verify long press test.
	 */
	@Test
	public void verifyLongPressTest() {
		ViewPage androidViewPage = android.clickOnViewsOption().clickOnExpandableListsOption()
				.clickOnCustomAdapterOption().longPressOnPeopleName();
		Assert.assertTrue(androidViewPage.isListDisplayed());
	}
}