package de.adesso.wickedcharts.highcharts.options;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CssPropertyNameSanitizerTest {

  @Test
  void testNoHyphen() {
    CssStyle style = new CssStyle();
    style.setProperty("font", "blubb");
    assertEquals("blubb", style.getProperty("font"));
  }

  @Test
  void testOneHyphen() {
    CssStyle style = new CssStyle();
    style.setProperty("font-weight", "blubb");
    assertEquals("blubb", style.getProperty("fontWeight"));
  }

  @Test
  void testTwoHyphens() {
    CssStyle style = new CssStyle();
    style.setProperty("border-top-width", "blubb");
    assertEquals("blubb", style.getProperty("borderTopWidth"));
  }

}
