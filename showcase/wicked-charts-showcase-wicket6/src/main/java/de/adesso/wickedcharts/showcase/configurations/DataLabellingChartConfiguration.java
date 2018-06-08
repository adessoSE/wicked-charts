package de.adesso.wickedcharts.showcase.configurations;

import de.adesso.wickedcharts.chartjs.chartoptions.*;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * 
 * A sample that shows how a combo bar-line chart configuration with data labelling.
 *
 * @see <a href="http://www.chartjs.org/samples/latest/advanced/data-labelling.html">http://www.chartjs.org/samples/latest/advanced/data-labelling.html</a>
 *
 * @author maximAtanasov
 * @author anedomansky
 */
@SuppressWarnings("serial")
public class DataLabellingChartConfiguration extends ShowcaseConfiguration {
	public DataLabellingChartConfiguration() {
		super();
		setType(ChartType.BAR);
		String optionalJavascript=readFile("de/adesso/wickedcharts/showcase/dataLabellingPlugin.js");
    	
    	setOptionalJavascript(new ArrayList<String>());
    	addOptionalJavascript(optionalJavascript);
    	
		Data data = new Data();
		Dataset dataset1 = new Dataset();
		dataset1.setType(ChartType.LINE)
				.setBorderColor(SimpleColor.BLUE)
				.setBorderWidth(2)
				.setFill(false)
				.setData(IntegerValue.of(randomIntegerList(7)))
				.setLabel("Dataset 1");
		
		Dataset dataset2 = new Dataset()
				.setType(ChartType.BAR)
				.setBackgroundColor(SimpleColor.RED)
				.setBorderColor(SimpleColor.WHITE)
				.setBorderWidth(2)
				.setData(IntegerValue.of(randomIntegerList(7)))
				.setLabel("Dataset 2");
		
		Dataset dataset3 = new Dataset()
				.setType(ChartType.BAR)
				.setBackgroundColor(SimpleColor.GREEN)
				.setData(IntegerValue.of(randomIntegerList(7)))
				.setLabel("Dataset 3");
		
		data.setDatasets(Arrays.asList(dataset1,dataset2,dataset3))
		.setLabels(TextLabel.of("January", "February", "March", "April", "May", "June", "July"));
		
		setData(data);
		
		Options options = new Options()
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Chart.js Combo Bar Line Chart"))
				.setTooltips(new Tooltips()
						.setIntersect(true)
						.setMode(TooltipMode.INDEX));
		setOptions(options);
		
	}
}
