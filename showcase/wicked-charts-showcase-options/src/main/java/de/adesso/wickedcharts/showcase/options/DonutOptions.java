/*
 *   Copyright 2012-2018 Wicked Charts (http://github.com/adessoAG/wicked-charts)
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
package de.adesso.wickedcharts.showcase.options;

import de.adesso.wickedcharts.highcharts.options.*;
import de.adesso.wickedcharts.highcharts.options.PixelOrPercent.Unit;
import de.adesso.wickedcharts.highcharts.options.color.ColorReference;
import de.adesso.wickedcharts.highcharts.options.color.HexColor;
import de.adesso.wickedcharts.highcharts.options.color.HighchartsColor;
import de.adesso.wickedcharts.highcharts.options.series.Point;
import de.adesso.wickedcharts.highcharts.options.series.PointSeries;
import de.adesso.wickedcharts.showcase.options.base.ShowcaseOptions;

import java.util.ArrayList;
import java.util.List;

/**
 * Demo of the same donut chart displayed in the Highcharts Demo at <a href=
 * "http://www.highcharts.com/demo/pie-donut">http://www.highcharts.com/demo
 * /pie-donut</a>.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class DonutOptions extends ShowcaseOptions {

  /**
   * Helper data structure to store usage data of a browser.
   */
  public class BrowserUsageData {

    private String browserName;

    private Float marketShare;

    private ColorReference color;

    private List<VersionUsageData> versionUsageData = new ArrayList<VersionUsageData>();

    public String getBrowserName() {
      return this.browserName;
    }

    public ColorReference getColor() {
      return this.color;
    }

    public Float getMarketShare() {
      return this.marketShare;
    }

    public List<VersionUsageData> getVersionUsageData() {
      return this.versionUsageData;
    }

    public void setBrowserName(final String browserName) {
      this.browserName = browserName;
    }

    public void setColor(final ColorReference color) {
      this.color = color;
    }

    public void setMarketShare(final Float marketShare) {
      this.marketShare = marketShare;
    }

    public void setVersionUsageData(
        final List<VersionUsageData> versionUsageData) {
      this.versionUsageData = versionUsageData;
    }
  }

  /**
   * Helper data structure to store usage data of a browser version.
   */
  public class VersionUsageData {

    private final String name;

    private final Float marketShare;

    private final ColorReference color;

    public VersionUsageData(final String name, final Float marketShare,
        final ColorReference color) {
      this.name = name;
      this.marketShare = marketShare;
      this.color = color;
    }

    public ColorReference getColor() {
      return this.color;
    }

    public Float getMarketShare() {
      return this.marketShare;
    }

    public String getName() {
      return this.name;
    }
  }

  private static final long serialVersionUID = 1L;

  public DonutOptions() {

    ChartOptions chartOptions = new ChartOptions();
    chartOptions
        .setType(SeriesType.PIE);
    setChartOptions(chartOptions);

    setTitle(new Title("Browser market share, April, 2011"));

    Axis yAxis = new Axis();
    yAxis
        .setTitle(new Title("Total percent market share"));
    setxAxis(yAxis);

    PlotOptions plotOptions = new PlotOptions();
    plotOptions
        .setShadow(Boolean.FALSE);

    PlotOptionsChoice plotOptionsChoice = new PlotOptionsChoice();
    plotOptionsChoice
        .setPie(plotOptions);
    setPlotOptions(plotOptionsChoice);

    setTooltip(new Tooltip());

    DataLabels browserDataLabels = new DataLabels();
    // browserDataLabels
    // .setFormatter(new Function());
    browserDataLabels
        .setColor(new HexColor("#ffffff"));
    browserDataLabels
        .setDistance(-30);

    List<BrowserUsageData> browserData = getBrowserData();

    PointSeries browserSeries = toBrowserSeries(browserData);
    browserSeries
        .setName("Browsers");
    browserSeries
        .setSize(new PixelOrPercent(60, Unit.PERCENT));
    browserSeries
        .setDataLabels(browserDataLabels);

    DataLabels versionDataLabels = new DataLabels();
    // versionDataLabels
    // .setFormatter(new Function());

    PointSeries versionSeries = toVersionSeries(browserData);
    versionSeries
        .setName("Versions");
    versionSeries
        .setInnerSize(new PixelOrPercent(60, Unit.PERCENT));
    versionSeries
        .setDataLabels(versionDataLabels);

    addSeries(browserSeries);
    addSeries(versionSeries);
  }

  /**
   * Creates the data displayed in the donut chart.
   */
  private List<BrowserUsageData> getBrowserData() {
    List<BrowserUsageData> browserData = new ArrayList<BrowserUsageData>();
    browserData
        .add(getMSIEUsageData());
    browserData
        .add(getFirefoxUsageData());
    browserData
        .add(getChromeUsageData());
    browserData
        .add(getSafariUsageData());
    browserData
        .add(getOperaUsageData());
    return browserData;
  }

  /**
   * Creates the Chrome data.
   */
  private BrowserUsageData getChromeUsageData() {
    BrowserUsageData data = new BrowserUsageData();
    data
        .setBrowserName("Chrome");
    data
        .setMarketShare(11.94f);
    ColorReference chromeColor = new HighchartsColor(2);
    data
        .setColor(chromeColor);
    data
        .getVersionUsageData()
        .add(
            new VersionUsageData("Chrome 5.0", 0.12f, chromeColor
                .brighten(0.01f)));
    data
        .getVersionUsageData()
        .add(
            new VersionUsageData("Chrome 6.0", 0.19f, chromeColor
                .brighten(0.02f)));
    data
        .getVersionUsageData()
        .add(
            new VersionUsageData("Chrome 7.0", 0.12f, chromeColor
                .brighten(0.03f)));
    data
        .getVersionUsageData()
        .add(
            new VersionUsageData("Chrome 8.0", 0.36f, chromeColor
                .brighten(0.04f)));
    data
        .getVersionUsageData()
        .add(
            new VersionUsageData("Chrome 9.0", 0.32f, chromeColor
                .brighten(0.05f)));
    data
        .getVersionUsageData()
        .add(
            new VersionUsageData("Chrome 10.0", 9.91f, chromeColor
                .brighten(0.06f)));
    data
        .getVersionUsageData()
        .add(
            new VersionUsageData("Chrome 11.0", 0.50f, chromeColor
                .brighten(0.07f)));
    data
        .getVersionUsageData()
        .add(
            new VersionUsageData("Chrome 12.0", 0.22f, chromeColor
                .brighten(0.08f)));
    return data;
  }

  /**
   * Creates the Firefox data.
   */
  private BrowserUsageData getFirefoxUsageData() {
    BrowserUsageData data = new BrowserUsageData();
    data
        .setBrowserName("Firefox");
    data
        .setMarketShare(21.63f);
    ColorReference ffColor = new HighchartsColor(1);
    data
        .setColor(ffColor);
    data
        .getVersionUsageData()
        .add(new VersionUsageData("Firefox 2.0", 0.20f, ffColor.brighten(0.1f)));
    data
        .getVersionUsageData()
        .add(new VersionUsageData("Firefox 3.0", 0.83f, ffColor.brighten(0.2f)));
    data
        .getVersionUsageData()
        .add(new VersionUsageData("Firefox 3.5", 1.58f, ffColor.brighten(0.3f)));
    data
        .getVersionUsageData()
        .add(
            new VersionUsageData("Firefox 3.6", 13.12f, ffColor
                .brighten(0.4f)));
    data
        .getVersionUsageData()
        .add(new VersionUsageData("Firefox 4.0", 5.43f, ffColor.brighten(0.5f)));
    return data;
  }

  /**
   * Creates the Internet Explorer data.
   */
  private BrowserUsageData getMSIEUsageData() {
    BrowserUsageData data = new BrowserUsageData();
    data
        .setBrowserName("MSIE");
    data
        .setMarketShare(55.11f);
    ColorReference ieColor = new HighchartsColor(0);
    data
        .setColor(ieColor);
    data
        .getVersionUsageData()
        .add(new VersionUsageData("MSIE 6.0", 10.85f, ieColor.brighten(0.1f)));
    data
        .getVersionUsageData()
        .add(new VersionUsageData("MSIE 7.0", 7.35f, ieColor.brighten(0.2f)));
    data
        .getVersionUsageData()
        .add(new VersionUsageData("MSIE 8.0", 33.06f, ieColor.brighten(0.3f)));
    data
        .getVersionUsageData()
        .add(new VersionUsageData("MSIE 9.0", 2.81f, ieColor.brighten(0.4f)));
    return data;
  }

  /**
   * Creates the Opera data.
   */
  private BrowserUsageData getOperaUsageData() {
    BrowserUsageData data = new BrowserUsageData();
    data
        .setBrowserName("Opera");
    data
        .setMarketShare(2.14f);
    ColorReference operaColor = new HighchartsColor(4);
    data
        .setColor(operaColor);
    data
        .getVersionUsageData()
        .add(
            new VersionUsageData("Opera 9.x", 0.12f, operaColor
                .brighten(0.1f)));
    data
        .getVersionUsageData()
        .add(
            new VersionUsageData("Opera 10.x", 0.37f, operaColor
                .brighten(0.2f)));
    data
        .getVersionUsageData()
        .add(
            new VersionUsageData("Opera 11.x", 1.65f, operaColor
                .brighten(0.3f)));
    return data;
  }

  /**
   * Creates the Safari data.
   */
  private BrowserUsageData getSafariUsageData() {
    BrowserUsageData data = new BrowserUsageData();
    data
        .setBrowserName("Safari");
    data
        .setMarketShare(7.15f);
    ColorReference safariColor = new HighchartsColor(3);
    data
        .setColor(safariColor);
    data
        .getVersionUsageData()
        .add(
            new VersionUsageData("Safari 5.0", 4.55f, safariColor
                .brighten(0.1f)));
    data
        .getVersionUsageData()
        .add(
            new VersionUsageData("Safari 4.0", 1.42f, safariColor
                .brighten(0.2f)));
    data
        .getVersionUsageData()
        .add(
            new VersionUsageData("Safari Win 5.0", 0.23f, safariColor
                .brighten(0.3f)));
    data
        .getVersionUsageData()
        .add(
            new VersionUsageData("Safari 4.1", 0.21f, safariColor
                .brighten(0.4f)));
    data
        .getVersionUsageData()
        .add(
            new VersionUsageData("Safari / Maxthon", 0.20f, safariColor
                .brighten(0.5f)));
    data
        .getVersionUsageData()
        .add(
            new VersionUsageData("Safari 3.1", 0.19f, safariColor
                .brighten(0.6f)));
    data
        .getVersionUsageData()
        .add(
            new VersionUsageData("Safari 4.1", 0.14f, safariColor
                .brighten(0.7f)));
    return data;
  }

  /**
   * Converts a list of {@link BrowserUsageData} into a list of
   * {@link PointSeries} containing the data about the browsers.
   */
  private PointSeries toBrowserSeries(final List<BrowserUsageData> browserUsage) {
    PointSeries browserSeries = new PointSeries();
    for (BrowserUsageData browserData : browserUsage) {
      browserSeries
          .addPoint(new Point(browserData
              .getBrowserName(), browserData
              .getMarketShare(), browserData
              .getColor()));
    }
    return browserSeries;
  }

  /**
   * Converts a list of {@link BrowserUsageData} into a list of
   * {@link PointSeries} containing the data about the browser versions.
   */
  private PointSeries toVersionSeries(final List<BrowserUsageData> browserUsage) {
    PointSeries versionSeries = new PointSeries();
    for (BrowserUsageData browserData : browserUsage) {
      for (VersionUsageData versionData : browserData
          .getVersionUsageData()) {
        versionSeries
            .addPoint(new Point(versionData
                .getName(), versionData
                .getMarketShare(), versionData
                .getColor()));
      }
    }
    return versionSeries;
  }

  @Override
  public String getLabel() {
    return "Donut chart";
  }

}
