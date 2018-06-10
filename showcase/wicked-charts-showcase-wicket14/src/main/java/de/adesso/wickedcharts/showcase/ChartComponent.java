package de.adesso.wickedcharts.showcase;

import de.adesso.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;
import de.adesso.wickedcharts.wicket14.chartjs.Chart;
import org.apache.wicket.markup.html.panel.Fragment;
import org.apache.wicket.markup.html.panel.Panel;

/**
 * Wicket-component that adds the chart configuration and markup to the page.
 */
public class ChartComponent extends Panel {

    public ChartComponent(Chart chart)
    {
        super( "chart" );
        add(chart);
        Fragment optionalMarkup = new Fragment("optionalMarkup","defaultTooltip",this);
        chart.getParent().add(optionalMarkup);
        ((ShowcaseConfiguration)chart.getChartConfiguration()).modfiyIndividualMarkup((Fragment)chart.getParent().get("optionalMarkup"));
        (chart.getParent().get("optionalMarkup")).detach();
        optionalMarkup = (Fragment) chart.getParent().get("optionalMarkup");
        this.add(optionalMarkup);
        optionalMarkup.setOutputMarkupId(true);
        add(optionalMarkup);
    }
}
