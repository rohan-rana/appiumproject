package common;

import java.util.Arrays;
import java.util.List;

/**
 * The Class Constant.
 */
public interface ConstantValues {

	/** The options. */
	public static List<String> options = Arrays.asList("Action Sheets", "Activity Indicators", "Alert Views", "Buttons",
			"Date Picker", "Image View", "Page Control", "Picker View", "Progress Views", "Segmented Controls",
			"Sliders", "Steppers", "Switches", "Text Fields", "Text View", "Web View");

	/** The sub options. */
	public static List<String> subOptions = Arrays.asList("AAPLActionSheetViewController",
			"AAPLActivityIndicatorViewController", "AAPLAlertViewController", "AAPLButtonViewController",
			"AAPLDatePickerController", "AAPLImageViewController", "AAPLPageControlViewController",
			"AAPLPickerViewController", "AAPLProgressViewController", "AAPLSegmentedControlViewController",
			"AAPLSliderViewController", "AAPLStepperViewController", "AAPLSwitchViewController",
			"AAPLTextFieldViewController", "AAPLTextViewController", "AAPLWebViewController");

	/** The ui catalog. */
	public static String appTitle = "UICatalog";
}
