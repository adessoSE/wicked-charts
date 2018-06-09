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
 * Sample that enables the use of custom html markup for tooltip points.
 *
 * @see <a href="http://www.chartjs.org/samples/latest/tooltips/custom-points.html">http://www.chartjs.org/samples/latest/tooltips/custom-points.html</a>
 *
 * @author SvenWirz
 */
@SuppressWarnings("serial")
public class TooltipHtmlPointsConfiguration extends ShowcaseConfiguration {
	public TooltipHtmlPointsConfiguration() {
    	setType(ChartType.LINE);
    	
    	String optionalJavascript=readFile("de/adesso/wickedcharts/showcase/customTooltip-Point.js");
    	
    	setOptionalJavascript(new ArrayList<String>());
    	addOptionalJavascript(optionalJavascript);
    	
		Data data = new Data()
				.setLabels(TextLabel.of("January", "February", "March", "April", "May", "June", "July"));
		setData(data);
		
		Dataset dataset1 = new Dataset()
				.setLabel("My First dataset")
				.setBackgroundColor(SimpleColor.RED_TRANSPARENT)
				.setPointBackgroundColor(SimpleColor.RED)
				.setBorderColor(SimpleColor.RED)
				.setData(IntegerValue.of(randomIntegerList(7)));
		
		Dataset dataset2 = new Dataset()
				.setLabel("My Second dataset")
				.setBackgroundColor(SimpleColor.BLUE_TRANSPARENT)
				.setPointBackgroundColor(SimpleColor.BLUE)
				.setBorderColor(SimpleColor.BLUE)
				.setData(IntegerValue.of(randomIntegerList(7)));
		
		data.setDatasets(Arrays.asList(dataset1,dataset2));
		
		Options options = new Options()
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("HTML Tooltip - Points"))
				.setTooltips(new Tooltips()
						.setEnabled(false)
						.setIntersect(false)
						.setMode(TooltipMode.INDEX)
						.setCustom(new JavaScriptReference("customTooltips"))
								);
		setOptions(options);
	}
	
	@Override
	public void modfiyIndividualMarkup(Fragment optionalMarkup) {
		Fragment frag = new Fragment("optionalMarkup","pointTooltip",optionalMarkup.getParent());
		optionalMarkup.replaceWith(frag);
	}
}
