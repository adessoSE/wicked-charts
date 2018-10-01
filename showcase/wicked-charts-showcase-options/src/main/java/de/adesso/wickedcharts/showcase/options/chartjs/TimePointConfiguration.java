package de.adesso.wickedcharts.showcase.options.chartjs;

import de.adesso.wickedcharts.chartjs.chartoptions.*;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.StringValueColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.DateTimeLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.*;
import de.adesso.wickedcharts.showcase.options.chartjs.base.ShowcaseConfiguration;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Sample which highlights the important points of the x-axis.
 *
 * @see <a href="http://www.chartjs.org/samples/latest/scales/time/line-point-data.html">http://www.chartjs.org/samples/latest/scales/time/line-point-data.html</a>
 *
 * @author SvenWirz
 */
@SuppressWarnings("serial")
public class TimePointConfiguration extends ShowcaseConfiguration {
	
	
	public TimePointConfiguration() {
		setType(ChartType.LINE);
		
		String timeFormat = "MM/DD/YYYY HH:mm";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(timeFormat);
		
		Data data = new Data();

		List<DateTimeLabel> dateList = new ArrayList<>();
		for(int i = 0; i < 7; i++) {
			dateList.add(new DateTimeLabel(LocalDateTime.of(2018, 1,1, 8+i, 00)));
		}
		data.setLabels(dateList);
		
		Dataset dataset1 = new Dataset()
				.setLabel("Dataset with date object point data")
				.setBackgroundColor(SimpleColor.RED_TRANSPARENT)
				.setBorderColor(SimpleColor.RED)
				.setFill(false)
				.setData(Arrays.asList(
						new PointValue()
						.setX(new DateTimeValue(dateList.get(0).getDate()))
						.setY(randomInteger()),
						new PointValue()
						.setX(new DateTimeValue(dateList.get(1).getDate()))
						.setY(randomInteger()),
						new PointValue()
						.setX(new DateTimeValue(dateList.get(2).getDate()))
						.setY(randomInteger()),
						new PointValue()
						.setX(new DateTimeValue(dateList.get(3).getDate()))
						.setY(randomInteger()),
						new PointValue()
						.setX(new DateTimeValue(dateList.get(4).getDate()))
						.setY(randomInteger()),
						new PointValue()
						.setX(new DateTimeValue(dateList.get(5).getDate()))
						.setY(randomInteger()),
						new PointValue()
						.setX(new DateTimeValue(dateList.get(6).getDate()))
						.setY(randomInteger())
						));
		
		
		
		
		Dataset dataset2 = new Dataset()
				.setLabel("Dataset with string point data")
				.setBackgroundColor(SimpleColor.BLUE_TRANSPARENT)
				.setBorderColor(SimpleColor.BLUE)
				.setFill(false)
				.setData(Arrays.asList(
						new PointValue()
							.setX(new StringValue(formatter.format(dateList.get(0).getDate())))
							.setY(randomInteger()),
						new PointValue()
							.setX(new StringValue(formatter.format(dateList.get(1).getDate())))
							.setY(randomInteger()),
						new PointValue()
							.setX(new StringValue(formatter.format(dateList.get(2).getDate())))
							.setY(randomInteger()),
						new PointValue()
							.setX(new StringValue(formatter.format(dateList.get(3).getDate())))
							.setY(randomInteger()),
						new PointValue()
							.setX(new StringValue(formatter.format(dateList.get(4).getDate())))
							.setY(randomInteger()),
						new PointValue()
							.setX(new StringValue(formatter.format(dateList.get(5).getDate())))
							.setY(randomInteger()),
						new PointValue()
							.setX(new StringValue(formatter.format(dateList.get(6).getDate())))
							.setY(randomInteger())
						))
				;
		
		data.setDatasets(Arrays.asList(dataset1,dataset2));
		setData(data);
		
		Options options = new Options()
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Chart.js Time Scale"))
				.setScales(new Scales()
						.setXAxes(new AxesScale()
								.setType("time")
								.setDisplay(true)
								.setScaleLabel(new ScaleLabel()
										.setDisplay(true)
										.setLabelString("Date"))
								.setTicks(new Ticks()
										.setMajor(new TickStyle()
												.setFontColor(new StringValueColor("red"))
												.setFontStyle(FontStyle.BOLD))))
						.setYAxes(new AxesScale()
								.setDisplay(true)
								.setScaleLabel(new ScaleLabel()
										.setDisplay(true)
										.setLabelString("value"))));
		setOptions(options);
		
		
	}

	private ValueType randomInteger() {
		Random rng = new Random();
		return new IntegerValue(rng.nextInt(60)+1);
	}

		
}
