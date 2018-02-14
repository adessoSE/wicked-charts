package de.adesso.wickedcharts.showcase.configurations;

import java.util.Arrays;

import de.adesso.wickedcharts.chartjs.chartoptions.ChartType;
import de.adesso.wickedcharts.chartjs.chartoptions.Data;
import de.adesso.wickedcharts.chartjs.chartoptions.Dataset;
import de.adesso.wickedcharts.chartjs.chartoptions.Options;
import de.adesso.wickedcharts.chartjs.chartoptions.Position;
import de.adesso.wickedcharts.chartjs.chartoptions.Title;
import de.adesso.wickedcharts.chartjs.chartoptions.TooltipMode;
import de.adesso.wickedcharts.chartjs.chartoptions.Tooltips;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.RgbColor;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.RgbaColor;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

@SuppressWarnings("serial")
public class TooltipBorderConfiguration extends ShowcaseConfiguration {
	public TooltipBorderConfiguration() {
		super();
    	setType(ChartType.LINE);
    	
		Data data = new Data()
				.setLabels(TextLabel.createListOf("January", "February", "March", "April", "May", "June", "July"));
		setData(data);
		
		Dataset dataset1 = new Dataset()
				.setLabel("Dataset")
				.setBackgroundColor(SimpleColor.RED)
				.setBorderColor(SimpleColor.RED)
				.setData(IntegerValue.of(10, 30, 46, 2,8,50,0))
				.setFill("false");
		
		data.setDatasets(Arrays.asList(dataset1));

		
		RgbColor black = new RgbColor(0,0,0);
		
		Options options = new Options()
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Sample tooltip with border"))
				.setTooltips(new Tooltips()
						.setMode(TooltipMode.INDEX)
						.setPosition(Position.NEAREST)
						.setIntersect(false)
						.setYPadding(10)
						.setXPadding(10)
						.setCaretSize(8)
						.setBackgroundColor(new RgbaColor(72, 241, 12,1.0f))
						.setTitleFontColor(black)
						.setBodyFontColor(black)
						.setBorderColor(new RgbaColor(0,0,0,1.0f))
						.setBorderWidth(4))
				;
		setOptions(options);
	}
}
