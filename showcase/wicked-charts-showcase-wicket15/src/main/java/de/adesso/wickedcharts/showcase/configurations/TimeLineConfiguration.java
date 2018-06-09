package de.adesso.wickedcharts.showcase.configurations;

import de.adesso.wickedcharts.chartjs.chartoptions.*;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.DateTimeLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.PointValue;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.StringValue;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.ValueType;
import de.adesso.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Sample which displays a time progression line for datasets.
 *
 * @see <a href="http://www.chartjs.org/samples/latest/scales/time/line.html">http://www.chartjs.org/samples/latest/scales/time/line.html</a>
 *
 * @author SvenWirz
 */
@SuppressWarnings("serial")
public class TimeLineConfiguration extends ShowcaseConfiguration {
	
	public TimeLineConfiguration() {
		setType(ChartType.LINE);
		
		Data data = new Data();

		String timeFormat = "MM/DD/YYYY HH:mm";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(timeFormat);
		
		List<DateTimeLabel> dateList = new ArrayList<DateTimeLabel>();
		for(int i = 0; i < 7; i++) {
			dateList.add(new DateTimeLabel(LocalDateTime.of(2018, 1,1, 8+i, 00)));
		}
		data.setLabels(dateList);
		
		Dataset dataset1 = new Dataset()
				.setLabel("My First Dataset")
				.setBackgroundColor(SimpleColor.RED_TRANSPARENT)
				.setBorderColor(SimpleColor.RED)
				.setFill(false)
				.setData(IntegerValue.of(randomIntegerList(7)))
				;
		
		Dataset dataset2 = new Dataset()
				.setLabel("My Second Dataset")
				.setBackgroundColor(SimpleColor.BLUE_TRANSPARENT)
				.setBorderColor(SimpleColor.BLUE)
				.setFill(false)
				.setData(IntegerValue.of(randomIntegerList(7)))
				;
		
		Dataset dataset3 = new Dataset()
				.setLabel("Dataset with point data")
				.setBackgroundColor(SimpleColor.GREEN_TRANSPARENT)
				.setBorderColor(SimpleColor.GREEN)
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
						.setY(randomInteger()),
						new PointValue()
						.setX(new StringValue(formatter.format(LocalDateTime.of(2018, 1, 1, 15, 0))))
						.setY(randomInteger()),
						new PointValue()
						.setX(new StringValue(formatter.format(LocalDateTime.of(2018, 1, 1, 16, 0))))
						.setY(randomInteger()),
						new PointValue()
						.setX(new StringValue(formatter.format(LocalDateTime.of(2018, 1, 1, 17, 0))))
						.setY(randomInteger())
						))
				;
		
		data.setDatasets(Arrays.asList(dataset1,dataset2,dataset3));
		setData(data);
		
		Options options = new Options()
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Chart.js Time Scale"))
				.setScales(new Scales()
						.setXAxes(new AxesScale()
								.setType("time")
								.setTime(new TimeFormat()
										.setTimeFormat(timeFormat )
										.setTooltipFormat("ll HH:mm")))
						.setYAxes(new AxesScale()
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
