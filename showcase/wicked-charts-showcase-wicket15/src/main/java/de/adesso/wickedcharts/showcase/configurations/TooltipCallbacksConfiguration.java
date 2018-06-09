package de.adesso.wickedcharts.showcase.configurations;

import de.adesso.wickedcharts.chartjs.chartoptions.*;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

import java.util.Arrays;

/**
 * Sample that enables the use of callback functions for tooltips.
 *
 * @see <a href="http://www.chartjs.org/samples/latest/tooltips/callbacks.html">http://www.chartjs.org/samples/latest/tooltips/callbacks.html</a>
 *
 * @author SvenWirz
 */
@SuppressWarnings("serial")
public class TooltipCallbacksConfiguration extends ShowcaseConfiguration {
	public TooltipCallbacksConfiguration() {
		super();
    	setType(ChartType.LINE);
		
		Data data = new Data()
				.setLabels(TextLabel.of("January", "February", "March", "April", "May", "June", "July"));
		setData(data);
		
		Dataset dataset1 = new Dataset()
				.setLabel("My First dataset")
				.setBackgroundColor(SimpleColor.RED)
				.setBorderColor(SimpleColor.RED)
				.setData(IntegerValue.of(randomIntegerList(7)))
				.setFill(false);
		
		
		Dataset dataset2 = new Dataset()
				.setLabel("My Second dataset")
				.setBackgroundColor(SimpleColor.BLUE)
				.setBorderColor(SimpleColor.BLUE)
				.setData(IntegerValue.of(randomIntegerList(7)))
				.setFill(false);
		
		data.setDatasets(Arrays.asList(dataset1,dataset2));
		
		String footerFunction = "function(tooltipItems, data) {\r\n" + 
				"                            var sum = 0;\r\n" + 
				"\r\n" + 
				"                            tooltipItems.forEach(function(tooltipItem) {\r\n" + 
				"                                sum += data.datasets[tooltipItem.datasetIndex].data[tooltipItem.index];\r\n" + 
				"                            });\r\n" + 
				"                            return 'Sum: ' + sum;\r\n" + 
				"                        }";
		
		Options options = new Options()
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Custom Information in Tooltip"))
				.setTooltips(new Tooltips()
						.setMode(TooltipMode.INDEX)
						.setCallbacks(new TooltipCallbacks()
								.setFooter(new CallbackFunction(footerFunction)))
						.setFooterFontStyle(FontStyle.NORMAL))
				.setHover(new Hover()
						.setMode(HoverMode.INDEX)
						.setIntersect(true))
				.setScales(new Scales()
						.setXAxes(new AxesScale()
								.setDisplay(true)
								.setScaleLabel(new ScaleLabel()
										.setDisplay(true)
										.setLabelString("Month")))
						.setYAxes(new AxesScale()
								.setDisplay(true)
								.setScaleLabel(new ScaleLabel()
										.setDisplay(true)
										.setLabelString("Value"))))
				;
		setOptions(options);
	}
}
