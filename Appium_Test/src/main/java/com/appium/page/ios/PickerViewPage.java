package com.appium.page.ios;

import java.util.HashMap;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import setup.AbstractPage;

public class PickerViewPage extends AbstractPage<PickerViewPage> {

	protected PickerViewPage(AppiumDriver<?> driver) {
		super(driver);
	}

	@iOSXCUITFindBy(accessibility = "Red color component value")
	private WebElement firstComponent;

	@iOSXCUITFindBy(accessibility = "Green color component value")
	private WebElement secondComponent;

	@iOSXCUITFindBy(accessibility = "Blue color component value")
	private WebElement thirdComponent;

	HashMap<String, String> actualValues = new HashMap<String, String>();

	HashMap<String, String> expectedlValues = new HashMap<String, String>();

	/**
	 * Sets the values in all components.
	 *
	 * @param first  the first
	 * @param second the second
	 * @param third  the third
	 */
	public void setValuesInAllComponents(String first, String second, String third) {
		actualValues.put("first", first);
		firstComponent.sendKeys(first);
		actualValues.put("second", second);
		secondComponent.sendKeys(second);
		actualValues.put("third", third);
		thirdComponent.sendKeys(third);
	}

	/**
	 * Gets the values from all components.
	 *
	 * @return the values from all components
	 */
	public void getValuesFromAllComponents() {
		expectedlValues.put("first", firstComponent.getText());
		expectedlValues.put("second", secondComponent.getText());
		expectedlValues.put("third", thirdComponent.getText());
	}

	/**
	 * Verify picker selection.
	 */
	public boolean verifyPickerSelection() {
		return actualValues.equals(expectedlValues);
	}
}
