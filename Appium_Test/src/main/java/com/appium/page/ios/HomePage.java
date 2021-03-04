package com.appium.page.ios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import common.CommonMethods;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import setup.AbstractPage;

public class HomePage extends AbstractPage<HomePage> {

	private CommonMethods common = new CommonMethods();

	/**
	 * Instantiates a new home page.
	 *
	 * @param driver the driver
	 */
	public HomePage(AppiumDriver<?> driver) {
		super(driver);
	}

	/** The app title. */
	@iOSXCUITFindBy(xpath = ".//XCUIElementTypeStaticText[@name='UICatalog']")
	private WebElement appTitle;

	/** The search bars. */
	@iOSXCUITFindBy(accessibility = "Search Bars")
	private WebElement searchBars;

	/** The picker view option. */
	@iOSXCUITFindBy(accessibility = "Picker View")
	private WebElement pickerView;

	/** The sliders. */
	@iOSXCUITFindBy(accessibility = "Sliders")
	private WebElement sliders;

	/** The option list. */
	By optionList = By.xpath("//XCUIElementTypeStaticText");

	/**
	 * Gets the ui catalog title text.
	 *
	 * @return the ui catalog title text
	 */
	public String getAppTitleText() {
		return common.getTextOfElement(appTitle);
	}

	/**
	 * Gets the text of all options.
	 *
	 * @return the text of all options
	 */
	public List<String> getTextOfAllOptions() {
		return common.getTextOfAllElements(optionList, 20);
	}

	/**
	 * Gets the text of all sub options.
	 *
	 * @return the text of all sub options
	 */
	public List<String> getTextOfAllSubOptions() {
		return common.getTextOfAllElements(optionList, 14);
	}

	/**
	 * Click on picker view.
	 *
	 * @return the picker view page
	 */
	public PickerViewPage clickOnPickerView() {
		common.clickOnElement(pickerView);
		return new PickerViewPage(driver);
	}

	/**
	 * Click on sliders.
	 *
	 * @return the sliders page
	 */
	public SlidersPage clickOnSliders() {
		common.clickOnElement(sliders);
		return new SlidersPage(driver);
	}

	/**
	 * Verify all option.
	 *
	 * @param actualList   the actual list
	 * @param expectedList the expected list
	 */
	public void verifyAllOption(List<String> actualList, List<String> expectedList) {
		for (String expected : expectedList) {
			Assert.assertEquals(expected, actualList.get(expectedList.indexOf(expected)));
		}
	}

	/**
	 * Scroll up to search bar option.
	 *
	 * @return the home page
	 */
	public HomePage scrollUpToSearchBarOption() {
		common.scrollToElement("down", "Search Bars");
		return this;
	}

	/**
	 * Checks if is search bars option displayed.
	 *
	 * @return true, if is search bars option displayed
	 */
	public boolean isSearchBarsOptionDisplayed() {
		return common.isElementDisplayed(searchBars);
	}
}