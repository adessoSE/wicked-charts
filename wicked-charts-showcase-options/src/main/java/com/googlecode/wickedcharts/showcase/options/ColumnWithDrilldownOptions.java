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
package com.googlecode.wickedcharts.showcase.options;

import com.googlecode.wickedcharts.highcharts.options.Axis;
import com.googlecode.wickedcharts.highcharts.options.ChartOptions;
import com.googlecode.wickedcharts.highcharts.options.CssStyle;
import com.googlecode.wickedcharts.highcharts.options.Cursor;
import com.googlecode.wickedcharts.highcharts.options.DataLabels;
import com.googlecode.wickedcharts.highcharts.options.ExportingOptions;
import com.googlecode.wickedcharts.highcharts.options.Function;
import com.googlecode.wickedcharts.highcharts.options.Options;
import com.googlecode.wickedcharts.highcharts.options.PlotOptions;
import com.googlecode.wickedcharts.highcharts.options.PlotOptionsChoice;
import com.googlecode.wickedcharts.highcharts.options.SeriesType;
import com.googlecode.wickedcharts.highcharts.options.Title;
import com.googlecode.wickedcharts.highcharts.options.Tooltip;
import com.googlecode.wickedcharts.highcharts.options.color.HexColor;
import com.googlecode.wickedcharts.highcharts.options.color.HighchartsColor;
import com.googlecode.wickedcharts.highcharts.options.drilldown.DrilldownPoint;
import com.googlecode.wickedcharts.highcharts.options.series.PointSeries;

public class ColumnWithDrilldownOptions extends ShowcaseOptions {

  private static final long serialVersionUID = 1L;

  private static BaseOptions BASE_OPTIONS;

  public ColumnWithDrilldownOptions() {
    BASE_OPTIONS = new BaseOptions();
    copyFrom(BASE_OPTIONS);
    addSeries(new PointSeries()
        .setName("Browser Brands")
        .setColor(new HexColor("#ffffff"))
        .addPoint(new DrilldownPoint(this, new MSIEDrilldownOptions())
            .setY(55.11f)
            .setColor(new HighchartsColor(0)))
        .addPoint(new DrilldownPoint(this, new FirefoxDrilldownOptions())
            .setY(21.63f)
            .setColor(new HighchartsColor(1)))
        .addPoint(new DrilldownPoint(this, new ChromeDrilldownOptions())
            .setY(11.94f)
            .setColor(new HighchartsColor(2)))
        .addPoint(new DrilldownPoint(this, new SafariDrilldownOptions())
            .setY(7.15f)
            .setColor(new HighchartsColor(3)))
        .addPoint(new DrilldownPoint(this, new OperaDrilldownOptions())
            .setY(2.14f)
            .setColor(new HighchartsColor(4))));
  }

  private class BaseOptions extends Options {

    private static final long serialVersionUID = 1L;

    public BaseOptions() {

      setChartOptions(new ChartOptions()
          .setType(SeriesType.COLUMN));

      setTitle(new Title("Browser market share, April, 2011"));

      setSubtitle(new Title(
          "Click the columns to view versions. Click again to view brands."));

      setxAxis(new Axis()
          .setCategories("MSIE", "Firefox", "Chrome", "Safari", "Opera"));

      setyAxis(new Axis()
          .setTitle(new Title("Total percent market share")));

      setPlotOptions(new PlotOptionsChoice()
          .setColumn(new PlotOptions()
              .setCursor(Cursor.POINTER)
              .setDataLabels(new DataLabels()
                  .setEnabled(Boolean.TRUE)
                  .setColor(new HighchartsColor(0))
                  .setStyle(new CssStyle()
                      .setProperty("font-weight", "bold"))
                  .setFormatter(new Function("return this.y +\"%\";")))));

      setTooltip(new Tooltip()
          .setFormatter(new Function()
              .setFunction("return this.x +\":<b>\"+ this.y +\"% market share</b><br/>Click to view \"+ this.point.category +\" versions\"")));

      setExporting(new ExportingOptions()
          .setEnabled(Boolean.FALSE));
    }
  }

  private class MSIEDrilldownOptions extends Options {

    private static final long serialVersionUID = 1L;

    public MSIEDrilldownOptions() {
      copyFrom(BASE_OPTIONS);

      setxAxis(new Axis()
          .setCategories("MSIE 6.0", "MSIE 7.0", "MSIE 8.0", "MSIE 9.0"));

      addSeries(new PointSeries()
          .setName("MSIE Versions")
          .addPoint(
              new DrilldownPoint(this, ColumnWithDrilldownOptions.this)
                  .setY(10.85f))
          .addPoint(
              new DrilldownPoint(this, ColumnWithDrilldownOptions.this)
                  .setY(7.35f))
          .addPoint(
              new DrilldownPoint(this, ColumnWithDrilldownOptions.this)
                  .setY(33.06f))
          .addPoint(
              new DrilldownPoint(this, ColumnWithDrilldownOptions.this)
                  .setY(2.81f))
          .setColor(new HighchartsColor(0)));
    }
  }

  private class FirefoxDrilldownOptions extends Options {

    private static final long serialVersionUID = 1L;

    public FirefoxDrilldownOptions() {
      copyFrom(BASE_OPTIONS);

      setxAxis(new Axis()
          .setCategories(
              "Firefox 2.0",
              "Firefox 3.0",
              "Firefox 3.5",
              "Firefox 3.6"));

      addSeries(new PointSeries()
          .setName("Firefox Versions")
          .addPoint(
              new DrilldownPoint(this, ColumnWithDrilldownOptions.this)
                  .setY(0.20f))
          .addPoint(
              new DrilldownPoint(this, ColumnWithDrilldownOptions.this)
                  .setY(0.83f))
          .addPoint(
              new DrilldownPoint(this, ColumnWithDrilldownOptions.this)
                  .setY(1.58f))
          .addPoint(
              new DrilldownPoint(this, ColumnWithDrilldownOptions.this)
                  .setY(13.12f))
          .addPoint(
              new DrilldownPoint(this, ColumnWithDrilldownOptions.this)
                  .setY(5.43f))
          .setColor(new HighchartsColor(1)));
    }
  }

  private class ChromeDrilldownOptions extends Options {

    private static final long serialVersionUID = 1L;

    public ChromeDrilldownOptions() {
      copyFrom(BASE_OPTIONS);

      setxAxis(new Axis()
          .setCategories(
              "Chrome 5.0",
              "Chrome 6.0",
              "Chrome 7.0",
              "Chrome 8.0",
              "Chrome 9.0",
              "Chrome 10.0",
              "Chrome 11.0",
              "Chrome 12.0"));

      addSeries(new PointSeries()
          .setName("Chrome Versions")
          .addPoint(
              new DrilldownPoint(this, ColumnWithDrilldownOptions.this)
                  .setY(0.12f))
          .addPoint(
              new DrilldownPoint(this, ColumnWithDrilldownOptions.this)
                  .setY(0.19f))
          .addPoint(
              new DrilldownPoint(this, ColumnWithDrilldownOptions.this)
                  .setY(0.12f))
          .addPoint(
              new DrilldownPoint(this, ColumnWithDrilldownOptions.this)
                  .setY(0.36f))
          .addPoint(
              new DrilldownPoint(this, ColumnWithDrilldownOptions.this)
                  .setY(0.32f))
          .addPoint(
              new DrilldownPoint(this, ColumnWithDrilldownOptions.this)
                  .setY(9.91f))
          .addPoint(
              new DrilldownPoint(this, ColumnWithDrilldownOptions.this)
                  .setY(0.50f))
          .addPoint(
              new DrilldownPoint(this, ColumnWithDrilldownOptions.this)
                  .setY(0.22f))
          .setColor(new HighchartsColor(2)));
    }
  }

  private class SafariDrilldownOptions extends Options {

    private static final long serialVersionUID = 1L;

    public SafariDrilldownOptions() {
      copyFrom(BASE_OPTIONS);

      setxAxis(new Axis()
          .setCategories(
              "Safari 5.0",
              "Safari 4.0",
              "Safari Win 5.0",
              "Safari 4.1",
              "Safari/Maxthon",
              "Safari 3.1",
              "Safari 4.1"));

      addSeries(new PointSeries()
          .setName("Safari Versions")
          .addPoint(
              new DrilldownPoint(this, ColumnWithDrilldownOptions.this)
                  .setY(4.55f))
          .addPoint(
              new DrilldownPoint(this, ColumnWithDrilldownOptions.this)
                  .setY(1.42f))
          .addPoint(
              new DrilldownPoint(this, ColumnWithDrilldownOptions.this)
                  .setY(0.23f))
          .addPoint(
              new DrilldownPoint(this, ColumnWithDrilldownOptions.this)
                  .setY(0.21f))
          .addPoint(
              new DrilldownPoint(this, ColumnWithDrilldownOptions.this)
                  .setY(0.20f))
          .addPoint(
              new DrilldownPoint(this, ColumnWithDrilldownOptions.this)
                  .setY(0.19f))
          .addPoint(
              new DrilldownPoint(this, ColumnWithDrilldownOptions.this)
                  .setY(0.14f))
          .setColor(new HighchartsColor(3)));
    }
  }

  private class OperaDrilldownOptions extends Options {

    private static final long serialVersionUID = 1L;

    public OperaDrilldownOptions() {
      copyFrom(BASE_OPTIONS);

      setxAxis(new Axis()
          .setCategories("Opera 9.x", "Opera 10.x", "Opera 11.x"));

      addSeries(new PointSeries()
          .setName("Opera Versions")
          .addPoint(
              new DrilldownPoint(this, ColumnWithDrilldownOptions.this)
                  .setY(0.12f))
          .addPoint(
              new DrilldownPoint(this, ColumnWithDrilldownOptions.this)
                  .setY(0.37f))
          .addPoint(
              new DrilldownPoint(this, ColumnWithDrilldownOptions.this)
                  .setY(1.65f))
          .setColor(new HighchartsColor(4)));
    }
  }

  @Override
  public String getLabel() {
    return "Column with drilldown";
  }
}
