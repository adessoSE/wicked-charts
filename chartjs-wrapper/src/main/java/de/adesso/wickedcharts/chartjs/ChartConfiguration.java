package de.adesso.wickedcharts.chartjs;

import de.adesso.wickedcharts.chartjs.chartoptions.ChartType;
import de.adesso.wickedcharts.chartjs.chartoptions.Data;
import de.adesso.wickedcharts.chartjs.chartoptions.Options;
import lombok.experimental.Accessors;


@Accessors(chain = true)
@lombok.Data
public class ChartConfiguration {
	private ChartType type;
	private Data data;
	private Options options;
}
