package de.adesso.wickedcharts.showcase.configurations;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;
import org.apache.wicket.Session;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import de.adesso.wickedcharts.chartjs.chartoptions.*;
/**
 * Sample which displays a bar chart for the data distribution and a line chart for the time progression of datasets.
 *
 * @see <a href="http://www.chartjs.org/samples/latest/scales/time/combo.html">http://www.chartjs.org/samples/latest/scales/time/combo.html</a>
 *
 * @author SvenWirz
 */
@SuppressWarnings("serial")
public class TimeComboConfiguration extends ShowcaseConfiguration {

	
	public TimeComboConfiguration() {
		setType(ChartType.BAR);
		
		String timeFormat = "MM/DD/YYYY HH:mm";
		
		List<TextLabel> labels = new ArrayList<TextLabel>(7);
		
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/uuuu HH:mm", Session.get().getLocale());
		
		
		for(int i = 0; i < 7; i++) {
			labels.add(new TextLabel(now.plus(i,ChronoUnit.DAYS).format(formatter)));
		}

		Dataset dataset1 = new Dataset()
				.setType(ChartType.BAR)
				.setLabel("Dataset 1")
				.setBackgroundColor(SimpleColor.RED_TRANSPARENT)
				.setBorderColor(SimpleColor.RED)
				.setData(IntegerValue.of(randomIntegerList(7)));
		
		Dataset dataset2 = new Dataset()
				.setType(ChartType.BAR)
				.setLabel("Dataset 2")
				.setBackgroundColor(SimpleColor.BLUE_TRANSPARENT)
				.setBorderColor(SimpleColor.BLUE)
				.setData(IntegerValue.of(randomIntegerList(7)));
		
		Dataset dataset3 = new Dataset()
				.setType(ChartType.LINE)
				.setLabel("Dataset 3")
				.setFill(false)
				.setBackgroundColor(SimpleColor.GREEN_TRANSPARENT)
				.setBorderColor(SimpleColor.GREEN)
				.setData(IntegerValue.of(randomIntegerList(7)));
		
		
		
		setData( new Data()
				.setLabels(labels)
				.setDatasets(Arrays.asList(dataset1,dataset2,dataset3))
				);

		
		
		setOptions( new Options()
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Chart.js Combo Time Scale"))
				.setScales(new Scales()
						.setXAxes(new AxesScale()
								.setType("time")
								.setDisplay(true)
								.setTime(new TimeFormat()
										.setFormat(timeFormat)
//										.setRound(TimeFormatRound.DAY)
										))));
	}
}
