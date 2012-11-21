package com.googlecode.wickedcharts.highcharts.options.util;

/**
 * CSS Styles defined in Highcharts options may not contain hyphens ("-") in
 * their names since they are not allowed in keys of JSON objects. I.e.
 * "font-weight" is not allowed and must instead be named "fontWeight". This
 * class makes the transformation from hyphen notation to camel case notation.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class CssPropertyNameSanitizer {

	private static CssPropertyNameSanitizer INSTANCE = new CssPropertyNameSanitizer();

	public static CssPropertyNameSanitizer getInstance() {
		return INSTANCE;
	}

	private CssPropertyNameSanitizer() {

	}

	/**
	 * Replaces hyphen notation with camel case notation.
	 * 
	 * @param propertyName
	 *          the name of the CSS property to sanitize
	 * @return the sanitized CSS property name
	 */
	public String sanitizeCssPropertyName(final String propertyName) {
		if (!propertyName.contains("-")) {
			return propertyName;
		} else {
			String sanitized = propertyName;
			int index = sanitized.indexOf("-");
			while (index != -1) {
				String charToBeReplaced = sanitized.substring(index + 1, index + 2);
				String replacement = charToBeReplaced.toUpperCase();
				sanitized = sanitized.replaceAll("-" + charToBeReplaced, replacement);
				index = sanitized.indexOf("-");
			}
			return sanitized;
		}
	}
}
