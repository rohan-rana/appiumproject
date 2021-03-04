package com.appium.android.gestures;

import org.testng.annotations.Test;
import org.testng.Assert;

import com.appium.page.android.ViewPage;

import setup.BaseClass;


public class DragAndDropTest extends BaseClass {

	/**
	 * Verify drag and drop test.
	 */
	@Test
	public void verifyDragAndDropTest() {
		ViewPage androidViewPage = android.clickOnViewsOption().clickOnDragAndDropOption().performDragAndDrop();
		Assert.assertTrue(androidViewPage.isConfirmationTextDisplayed());
	}
}