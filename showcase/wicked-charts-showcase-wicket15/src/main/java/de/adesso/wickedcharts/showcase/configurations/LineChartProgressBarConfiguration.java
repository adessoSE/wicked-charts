package de.adesso.wickedcharts.showcase.configurations;

import de.adesso.wickedcharts.chartjs.chartoptions.*;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;
import org.apache.wicket.markup.html.panel.Fragment;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * A sample that shows how a line chart with a progress bar is configured.
 *
 * @see <a href="http://www.chartjs.org/samples/latest/advanced/progress-bar.html">http://www.chartjs.org/samples/latest/advanced/progress-bar.html</a>
 *
 * @author maximAtanasov
 * @author anedomansky
 */
@SuppressWarnings("serial")
public class LineChartProgressBarConfiguration extends ShowcaseConfiguration {
	public LineChartProgressBarConfiguration() {
		super();
    	setType(ChartType.LINE);
		
    	String optionalJavascript=  readFile("de/adesso/wickedcharts/showcase/progressBar.js");

		setOptionalJavascript(new ArrayList<String>());
    	addOptionalJavascript(optionalJavascript);
    	
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
		
		Options options = new Options()
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Chart.js Line Chart Progress Bar"))
				.setTooltips(new Tooltips()
						.setMode(TooltipMode.INDEX)
						.setIntersect(false))
				.setAnimation(new Animation()
						.setDuration(2000)
						.setOnProgress(new CallbackFunction("function(animation) {\r\n" + 
								"                        progress.value = animation.currentStep / animation.numSteps;\r\n" + 
								"                    }"))
						.setOnComplete(new CallbackFunction("function(animation) {\r\n" + 
								"                        window.setTimeout(function() {\r\n" + 
								"                            progress.value = 0;\r\n" + 
								"                        }, 2000);\r\n" + 
								"                    }"))) 
				.setHover(new Hover()
						.setMode(HoverMode.NEAREST)
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
	
	@Override
	public void modfiyIndividualMarkup(Fragment optionalMarkup) {
		Fragment frag = new Fragment("optionalMarkup","progressBar",optionalMarkup.getParent());
		optionalMarkup.replaceWith(frag);
	}
}
