package de.adesso.wickedcharts.showcase.configurations;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import de.adesso.wickedcharts.chartjs.chartoptions.AxesScale;
import de.adesso.wickedcharts.chartjs.chartoptions.ChartType;
import de.adesso.wickedcharts.chartjs.chartoptions.Data;
import de.adesso.wickedcharts.chartjs.chartoptions.Dataset;
import de.adesso.wickedcharts.chartjs.chartoptions.DistributionType;
import de.adesso.wickedcharts.chartjs.chartoptions.Options;
import de.adesso.wickedcharts.chartjs.chartoptions.ScaleLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.Scales;
import de.adesso.wickedcharts.chartjs.chartoptions.TickSource;
import de.adesso.wickedcharts.chartjs.chartoptions.Ticks;
import de.adesso.wickedcharts.chartjs.chartoptions.Title;
import de.adesso.wickedcharts.chartjs.chartoptions.label.DateTimeLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.DoubleValue;
import de.adesso.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

/**
 * Sample that displays a progression of a dataset.
 *
 */
@SuppressWarnings("serial")
public class TimeSeriesConfiguration extends ShowcaseConfiguration {

	public TimeSeriesConfiguration() {
		
		
		Options options = new Options()
				.setTitle(new Title()
						.setDisplay(true)
						.setText("ChartJs Time Series"))
				.setScales(new Scales()
						.setXAxes(new AxesScale()
								.setType("time")
								.setDistribution(DistributionType.SERIES)
								.setTicks(new Ticks()
										.setSource(TickSource.LABELS)
										)
								)
						.setYAxes(new AxesScale()
								.setScaleLabel(new ScaleLabel()
										.setDisplay(true)
										.setLabelString("Closing price ($)"))
								));
		
		setOptions(options);
		
		setType(ChartType.LINE);
		
		LocalDateTime now = LocalDateTime.now();
		
		
		List<DateTimeLabel> labels = new ArrayList<DateTimeLabel>(60);
		List<DoubleValue> randomData = new ArrayList<DoubleValue>(60);
		
		labels.add(new DateTimeLabel(now));
		randomData.add(randomBar(30));
		
		
		for(int i = 1; i < 60; i++) {
			int dayOfTheWeek = now.plus(i, ChronoUnit.DAYS).getDayOfWeek().getValue();
			if( 1 <= dayOfTheWeek && dayOfTheWeek <= 5) {
				labels.add(new DateTimeLabel(now.plus(i, ChronoUnit.DAYS)));
			}
			randomData.add(randomBar(randomData.get(i-1).getValue()));
		}
		
		
		
		Data data = new Data()
				.setLabels(labels)
				.setDatasets(Arrays.asList(new Dataset()
						.setLabel("CHRT - Chart.js Corporation")
						.setData(randomData)
						.setType(ChartType.LINE)
						.setPointRadius(0)
						.setFill(false)
						.setLineTension(0)
						.setBorderWidth(2)
						));
		setData(data);
	}
	
	private DoubleValue randomBar(double lastClose) {
		double open = randomNumber(lastClose * .95, lastClose *1.05);
		double close = randomNumber(open * .95, open *1.05);
//		double high = randomNumber(Math.max(open, close), Math.max(open, close) * 1.1);
//		double low = randomNumber(Math.min(open, close) * .9, Math.min(open, close));
		return new DoubleValue(close);
	}

	private double randomNumber(double min, double max) {
		return Math.random() * (max - min) + min;
	}
}
