package com.appium.ios.gestures;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.appium.page.ios.PickerViewPage;

import setup.BaseClass;

public class VerifyPickerSelectionTest extends BaseClass {

	/**
	 * Verify picker wheel selection.
	 */
	@Test
	public void verifyPickerWheelSelection() {
		PickerViewPage pickerView = ios.clickOnPickerView();
		pickerView.setValuesInAllComponents("50", "100", "150");
		pickerView.getValuesFromAllComponents();
		Assert.assertTrue(pickerView.verifyPickerSelection());
	}
}
