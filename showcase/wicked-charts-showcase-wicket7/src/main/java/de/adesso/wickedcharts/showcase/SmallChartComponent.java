package de.adesso.wickedcharts.showcase;

import de.adesso.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;
import de.adesso.wickedcharts.wicket7.chartjs.Chart;
import org.apache.wicket.markup.html.panel.Fragment;
import org.apache.wicket.markup.html.panel.Panel;

/**
 * Wicket-component that adds the chart configuration and a smaller markup to the page.
 */
public class SmallChartComponent extends ChartComponent {

    public SmallChartComponent(Chart chart)
    {
        super(chart);
    }
}
