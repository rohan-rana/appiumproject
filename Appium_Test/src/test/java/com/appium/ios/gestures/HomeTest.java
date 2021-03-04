package com.appium.ios.gestures;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import common.ConstantValues;
import setup.BaseClass;

public class HomeTest extends BaseClass {
	
	/**
	 * Verify home page options.
	 */
	@Test
	public void verifyHomePageOptions() {
		assertEquals(ios.getAppTitleText(), ConstantValues.appTitle);
		ios.verifyAllOption(ios.getTextOfAllOptions(), ConstantValues.options);
		ios.verifyAllOption(ios.getTextOfAllSubOptions(), ConstantValues.subOptions);
	}
}