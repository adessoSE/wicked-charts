package com.googlecode.wickedcharts.highcharts.options.util;

import junit.framework.Assert;

import org.junit.Test;

import com.googlecode.wickedcharts.highcharts.options.util.CssPropertyNameSanitizer;

public class CssPropertyNameSanitizerTest {

	@Test
	public void testNoHyphen() {
		String propertyName = "font";
		CssPropertyNameSanitizer sanitizer = CssPropertyNameSanitizer.getInstance();
		String sanitized = sanitizer.sanitizeCssPropertyName(propertyName);
		Assert.assertEquals("font", sanitized);
	}

	@Test
	public void testOneHyphen() {
		String propertyName = "font-weight";
		CssPropertyNameSanitizer sanitizer = CssPropertyNameSanitizer.getInstance();
		String sanitized = sanitizer.sanitizeCssPropertyName(propertyName);
		Assert.assertEquals("fontWeight", sanitized);
	}

	@Test
	public void testTwoHyphens() {
		String propertyName = "border-top-width";
		CssPropertyNameSanitizer sanitizer = CssPropertyNameSanitizer.getInstance();
		String sanitized = sanitizer.sanitizeCssPropertyName(propertyName);
		Assert.assertEquals("borderTopWidth", sanitized);
	}

}
