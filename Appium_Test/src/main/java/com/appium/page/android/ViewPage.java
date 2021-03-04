package com.appium.page.android;


import org.openqa.selenium.WebElement;

import common.CommonMethods;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import setup.AbstractPage;

public class ViewPage extends AbstractPage<ViewPage> {

	/** The common. */
	private CommonMethods common = new CommonMethods();

	/**
	 * Instantiates a new home page.
	 *
	 * @param driver the driver
	 */
	public ViewPage(AppiumDriver<?> driver) {
		super(driver);
	}

	/** The expandable lists option. */
	@AndroidFindBy(accessibility = "Expandable Lists")
	private WebElement listsOptions;

	/** The drag and drop option. */
	@AndroidFindBy(accessibility = "Drag and Drop")
	private WebElement dragAndDropOption;

	/** The custom adapter. */
	@AndroidFindBy(accessibility = "1. Custom Adapter")
	private WebElement customAdapter;

	/** The people names. */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='People Names']")
	private WebElement peopleNames;

	/** The locator for list. */
	private String locatorForList = "text(\"Sample action\")";

	/** The red source dot. */
	@AndroidFindBy(id = "io.appium.android.apis:id/drag_dot_1")
	private WebElement sourceDot;

	/** The red destination dot. */
	@AndroidFindBy(id = "io.appium.android.apis:id/drag_dot_2")
	private WebElement destinationDot;

	/** The drag and drop confirmation text. */
	@AndroidFindBy(id = "io.appium.android.apis:id/drag_result_text")
	private WebElement confirmationText;

	/** The web view option. */
	@AndroidFindBy(accessibility = "WebView")
	private WebElement webViewOption;

	/** The web view text box. */
	@AndroidFindBy(id = "i am a link")
	private WebElement webViewLink;

	/**
	 * Click on expandable lists option.
	 *
	 * @return the android view page
	 */
	public ViewPage clickOnExpandableListsOption() {
		common.clickOnElement(listsOptions);
		return this;
	}

	/**
	 * Click on custom adapter option.
	 *
	 * @return the android view page
	 */
	public ViewPage clickOnCustomAdapterOption() {
		common.tapOnElement(customAdapter);
		return this;
	}

	/**
	 * Long press on people name.
	 *
	 * @return the android view page
	 */
	public ViewPage longPressOnPeopleName() {
		common.longPress(peopleNames, 2);
		return this;
	}

	/**
	 * Checks if is list displayed.
	 *
	 * @return true, if is list displayed
	 */
	public boolean isListDisplayed() {
		return common.findByUiAutomator(locatorForList).isDisplayed();
	}

	/**
	 * Checks if is confirmation text displayed.
	 *
	 * @return true, if is confirmation text displayed
	 */
	public boolean isConfirmationTextDisplayed() {
		return common.isElementDisplayed(confirmationText);
	}

	/**
	 * Click on drag and drop option.
	 *
	 * @return the android view page
	 */
	public ViewPage clickOnDragAndDropOption() {
		common.clickOnElement(dragAndDropOption);
		return this;
	}

	/**
	 * Perform drag and drop.
	 *
	 * @return the android view page
	 */
	public ViewPage performDragAndDrop() {
		common.dragAndDrop(sourceDot, destinationDot);
		return this;
	}

//	/**
//	 * Navigate to web view page.
//	 *
//	 * @return the android view page
//	 */
//	public AndroidViewPage navigateToWebViewPage() {
//		/** The locator for scroll bars. */
//		private String locatorForScrollBars = "text(\"WebView\")";
//		common.scrollToView("text(\"WebView\")");
//		common.scrollToElement("down", "WebView");
//		common.clickOnElement(webViewOption);
//		return this;
//	}
//
//	/**
//	 * Navigate to web view page.
//	 *
//	 * @return the android view page
//	 */
//	public AndroidViewPage enterTextWebViewPage() {
//		Set<String> contexts = driver.getContextHandles();
//		for (String contextName : contexts) {
//			System.out.println(contextName);
//			if (!contextName.equals("NATIVE_APP")) {
//				driver.context(contextName);
//				driver.findElement(By.id("i am a link")).click();
//				webViewLink.click();
//				break;
//			}
//		}
//		return this;
//	}
}