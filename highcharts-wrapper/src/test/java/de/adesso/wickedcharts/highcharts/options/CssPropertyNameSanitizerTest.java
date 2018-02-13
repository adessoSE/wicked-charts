package de.adesso.wickedcharts.highcharts.options;

import junit.framework.Assert;

import org.junit.Test;

import de.adesso.wickedcharts.highcharts.options.CssStyle;

public class CssPropertyNameSanitizerTest {

  @Test
  public void testNoHyphen() {
    CssStyle style = new CssStyle();
    style.setProperty("font", "blubb");
    Assert.assertEquals("blubb", style.getProperty("font"));
  }

  @Test
  public void testOneHyphen() {
    CssStyle style = new CssStyle();
    style.setProperty("font-weight", "blubb");
    Assert.assertEquals("blubb", style.getProperty("fontWeight"));
  }

  @Test
  public void testTwoHyphens() {
    CssStyle style = new CssStyle();
    style.setProperty("border-top-width", "blubb");
    Assert.assertEquals("blubb", style.getProperty("borderTopWidth"));

  }

}
