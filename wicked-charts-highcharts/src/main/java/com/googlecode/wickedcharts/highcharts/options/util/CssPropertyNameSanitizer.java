/**
 *   Copyright 2012 Wicked Charts (http://wicked-charts.googlecode.com)
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
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
public final class CssPropertyNameSanitizer {

  private static final CssPropertyNameSanitizer INSTANCE = new CssPropertyNameSanitizer();

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
      int index = sanitized.indexOf('-');
      while (index != -1) {
        String charToBeReplaced = sanitized.substring(index + 1, index + 2);
        String replacement = charToBeReplaced.toUpperCase();
        sanitized = sanitized.replaceAll("-" + charToBeReplaced, replacement);
        index = sanitized.indexOf('-');
      }
      return sanitized;
    }
  }
}
