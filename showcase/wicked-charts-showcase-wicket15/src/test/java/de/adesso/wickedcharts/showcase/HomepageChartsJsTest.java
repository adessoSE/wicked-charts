package de.adesso.wickedcharts.showcase;

import de.adesso.wickedcharts.showcase.options.chartjs.ChartjsConfigurations;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.jupiter.api.Test;

class HomepageChartsJsTest {

    private static final String PAGE_PARAMETER = "chart";

    @Test
    void renderBarVerticalTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(PAGE_PARAMETER, ChartjsConfigurations.BAR_VERTICAL);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    void renderBarHorizontalTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(PAGE_PARAMETER, ChartjsConfigurations.BAR_HORIZONTAL);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    void renderBarMutliAxisTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(PAGE_PARAMETER, ChartjsConfigurations.BAR_MULTI_AXIS);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    void renderBarStackedTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(PAGE_PARAMETER, ChartjsConfigurations.BAR_STACKED);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }
    @Test
    void renderBarStackedGroupTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(PAGE_PARAMETER, ChartjsConfigurations.BAR_STACKED_GROUP);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    void renderLineBasicTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(PAGE_PARAMETER, ChartjsConfigurations.LINE_BASIC);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    void renderLineMultiAxisTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(PAGE_PARAMETER, ChartjsConfigurations.LINE_MULTI_AXIS);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    void renderLineSteppedTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(PAGE_PARAMETER, ChartjsConfigurations.LINE_STEPPED);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    void renderLineInterpolatedTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(PAGE_PARAMETER, ChartjsConfigurations.LINE_INTERPOLATED);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    void renderLineStylesTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(PAGE_PARAMETER, ChartjsConfigurations.LINE_STYLES);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    void renderPointStylesTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(PAGE_PARAMETER, ChartjsConfigurations.POINT_STYLES);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    void renderPointSizesTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(PAGE_PARAMETER, ChartjsConfigurations.POINT_SIZES);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    void renderAreaLineBoundariesTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(PAGE_PARAMETER, ChartjsConfigurations.AREA_LINE_BOUNDARIES);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    void renderLineDatasetTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(PAGE_PARAMETER, ChartjsConfigurations.LINE_DATASET);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    void renderLineStackedTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(PAGE_PARAMETER, ChartjsConfigurations.LINE_STACKED);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    void renderRadarTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(PAGE_PARAMETER, ChartjsConfigurations.RADAR);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    void renderScatterTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(PAGE_PARAMETER, ChartjsConfigurations.SCATTER);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    void renderScatterMultiAxisTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(PAGE_PARAMETER, ChartjsConfigurations.SCATTER_MULTI_AXIS);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    void renderDoughnutTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(PAGE_PARAMETER, ChartjsConfigurations.DOUGHNUT);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    void renderPieTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(PAGE_PARAMETER, ChartjsConfigurations.PIE);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    void renderPolarAreaTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(PAGE_PARAMETER, ChartjsConfigurations.POLAR_AREA);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    void renderRadar2Test(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(PAGE_PARAMETER, ChartjsConfigurations.RADAR_2);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    void renderComboBarLineTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(PAGE_PARAMETER, ChartjsConfigurations.COMBO_BAR_LINE);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    void renderStepSizeTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(PAGE_PARAMETER, ChartjsConfigurations.STEP_SIZE);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    void renderMinMaxTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(PAGE_PARAMETER, ChartjsConfigurations.MIN_MAX);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    void renderLineLogarithmicTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(PAGE_PARAMETER, ChartjsConfigurations.LINE_LOGARITHMIC);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    void renderScatterLogarithmicTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(PAGE_PARAMETER, ChartjsConfigurations.SCATTER_LOGARITHMIC);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    void renderTimeLineTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(PAGE_PARAMETER, ChartjsConfigurations.TIME_LINE);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    void renderTimePointTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(PAGE_PARAMETER, ChartjsConfigurations.TIME_POINT);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    void renderTimeSeriesTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(PAGE_PARAMETER, ChartjsConfigurations.TIME_SERIES);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    void renderTimeComboTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(PAGE_PARAMETER, ChartjsConfigurations.TIME_COMBO);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    void renderGridLinesTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(PAGE_PARAMETER, ChartjsConfigurations.GRID_LINES);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    void renderMultilineLabelsTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(PAGE_PARAMETER, ChartjsConfigurations.MULTILINE_LABELS);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    void renderFilteringLabelsTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(PAGE_PARAMETER, ChartjsConfigurations.FILTERING_LABELS);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    void renderNonNumericTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(PAGE_PARAMETER, ChartjsConfigurations.NON_NUMERIC);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    void renderLegendPositionTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(PAGE_PARAMETER, ChartjsConfigurations.LEGEND_POSITION);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    void renderLegendPointStyleTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(PAGE_PARAMETER, ChartjsConfigurations.LEGEND_POINT_STYLE);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    void renderTooltipTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(PAGE_PARAMETER, ChartjsConfigurations.TOOLTIP);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    void renderTooltipHTMLTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(PAGE_PARAMETER, ChartjsConfigurations.TOOLTIP_HTML);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    void renderTooltipInteractionsTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(PAGE_PARAMETER, ChartjsConfigurations.TOOLTIP_INTERACTIONS);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    void renderBubbleTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(PAGE_PARAMETER, ChartjsConfigurations.BUBBLE);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    void renderLineProgressBarTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(PAGE_PARAMETER, ChartjsConfigurations.LINE_PROGRESS_BAR);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }

    @Test
    void renderDataLabellingTest(){
        WicketTester tester = new WicketTester();
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(PAGE_PARAMETER, ChartjsConfigurations.DATA_LABELLING);
        tester.startPage(HomepageChartJs.class, pageParameters);
        tester.assertRenderedPage(HomepageChartJs.class);
    }
}
