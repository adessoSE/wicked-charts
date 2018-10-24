package de.adesso.wickedcharts.showcase;

import de.adesso.wickedcharts.showcase.options.chartjs.ChartjsConfigurations;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.Test;

public class HomepageChartsJsTest {

    @Test
    public void renderBarVerticalTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add("chart", ChartjsConfigurations.BAR_VERTICAL);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    public void renderBarHorizontalTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add("chart", ChartjsConfigurations.BAR_HORIZONTAL);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    public void renderBarMutliAxisTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add("chart", ChartjsConfigurations.BAR_MULTI_AXIS);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    public void renderBarStackedTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add("chart", ChartjsConfigurations.BAR_STACKED);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }
    @Test
    public void renderBarStackedGroupTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add("chart", ChartjsConfigurations.BAR_STACKED_GROUP);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    public void renderLineBasicTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add("chart", ChartjsConfigurations.LINE_BASIC);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    public void renderLineMultiAxisTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add("chart", ChartjsConfigurations.LINE_MULTI_AXIS);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    public void renderLineSteppedTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add("chart", ChartjsConfigurations.LINE_STEPPED);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    public void renderLineInterpolatedTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add("chart", ChartjsConfigurations.LINE_INTERPOLATED);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    public void renderLineStylesTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add("chart", ChartjsConfigurations.LINE_STYLES);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    public void renderPointStylesTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add("chart", ChartjsConfigurations.POINT_STYLES);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    public void renderPointSizesTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add("chart", ChartjsConfigurations.POINT_SIZES);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    public void renderAreaLineBoundariesTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add("chart", ChartjsConfigurations.AREA_LINE_BOUNDARIES);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    public void renderLineDatasetTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add("chart", ChartjsConfigurations.LINE_DATASET);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    public void renderLineStackedTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add("chart", ChartjsConfigurations.LINE_STACKED);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    public void renderRadarTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add("chart", ChartjsConfigurations.RADAR);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    public void renderScatterTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add("chart", ChartjsConfigurations.SCATTER);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    public void renderScatterMultiAxisTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add("chart", ChartjsConfigurations.SCATTER_MULTI_AXIS);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    public void renderDoughnutTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add("chart", ChartjsConfigurations.DOUGHNUT);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    public void renderPieTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add("chart", ChartjsConfigurations.PIE);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    public void renderPolarAreaTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add("chart", ChartjsConfigurations.POLAR_AREA);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    public void renderRadar2Test(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add("chart", ChartjsConfigurations.RADAR_2);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    public void renderComboBarLineTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add("chart", ChartjsConfigurations.COMBO_BAR_LINE);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    public void renderStepSizeTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add("chart", ChartjsConfigurations.STEP_SIZE);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    public void renderMinMaxTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add("chart", ChartjsConfigurations.MIN_MAX);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    public void renderLineLogarithmicTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add("chart", ChartjsConfigurations.LINE_LOGARITHMIC);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    public void renderScatterLogarithmicTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add("chart", ChartjsConfigurations.SCATTER_LOGARITHMIC);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    public void renderTimeLineTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add("chart", ChartjsConfigurations.TIME_LINE);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    public void renderTimePointTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add("chart", ChartjsConfigurations.TIME_POINT);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    public void renderTimeSeriesTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add("chart", ChartjsConfigurations.TIME_SERIES);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    public void renderTimeComboTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add("chart", ChartjsConfigurations.TIME_COMBO);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    public void renderGridLinesTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add("chart", ChartjsConfigurations.GRID_LINES);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    public void renderMultilineLabelsTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add("chart", ChartjsConfigurations.MULTILINE_LABELS);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    public void renderFilteringLabelsTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add("chart", ChartjsConfigurations.FILTERING_LABELS);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    public void renderNonNumericTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add("chart", ChartjsConfigurations.NON_NUMERIC);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    public void renderLegendPositionTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add("chart", ChartjsConfigurations.LEGEND_POSITION);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    public void renderLegendPointStyleTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add("chart", ChartjsConfigurations.LEGEND_POINT_STYLE);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    public void renderTooltipTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add("chart", ChartjsConfigurations.TOOLTIP);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    public void renderTooltipHTMLTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add("chart", ChartjsConfigurations.TOOLTIP_HTML);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    public void renderTooltipInteractionsTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add("chart", ChartjsConfigurations.TOOLTIP_INTERACTIONS);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    public void renderBubbleTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add("chart", ChartjsConfigurations.BUBBLE);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    public void renderLineProgressBarTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add("chart", ChartjsConfigurations.LINE_PROGRESS_BAR);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    public void renderDataLabellingTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add("chart", ChartjsConfigurations.DATA_LABELLING);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }
}
