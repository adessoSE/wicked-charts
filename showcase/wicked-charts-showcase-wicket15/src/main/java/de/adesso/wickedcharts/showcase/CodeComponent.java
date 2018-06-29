package de.adesso.wickedcharts.showcase;

import de.adesso.wickedcharts.chartjs.ChartConfiguration;
import de.adesso.wickedcharts.wicket15.chartjs.Chart;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;

/**
 * Wicket-component that adds the appropriate code container for the displayed charts to the page.
 */
public class CodeComponent extends Panel {

    public CodeComponent(Chart chart)
    {
        super("code");
        ChartConfiguration chartConfig = chart.getChartConfiguration();
        Label codeContainer = new Label("code", new StringFromResourceModel(
                chartConfig.getClass(), chartConfig.getClass().getSimpleName()
                + ".java"));
        codeContainer.setOutputMarkupId (true);
        this.add(codeContainer);
    }
}
