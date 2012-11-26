package com.googlecode.wickedcharts.showcase.ie;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.wicket.ajax.AjaxEventBehavior;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.form.AjaxFormComponentUpdatingBehavior;
import org.apache.wicket.ajax.form.AjaxFormSubmitBehavior;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.IChoiceRenderer;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import com.googlecode.wickedcharts.highcharts.Chart;
import com.googlecode.wickedcharts.highcharts.options.Options;
import com.googlecode.wickedcharts.showcase.options.AreaInvertedAxisOptions;
import com.googlecode.wickedcharts.showcase.options.AreaMissingOptions;
import com.googlecode.wickedcharts.showcase.options.AreaSplineOptions;
import com.googlecode.wickedcharts.showcase.options.AreaWithNegativeValuesOptions;
import com.googlecode.wickedcharts.showcase.options.BarWithNegativeStackOptions;
import com.googlecode.wickedcharts.showcase.options.BasicAreaOptions;
import com.googlecode.wickedcharts.showcase.options.BasicBarOptions;
import com.googlecode.wickedcharts.showcase.options.BasicColumnOptions;
import com.googlecode.wickedcharts.showcase.options.BasicLineOptions;
import com.googlecode.wickedcharts.showcase.options.BasicPieOptions;
import com.googlecode.wickedcharts.showcase.options.BubbleChartOptions;
import com.googlecode.wickedcharts.showcase.options.ColumnWithDrilldownOptions;
import com.googlecode.wickedcharts.showcase.options.ColumnWithNegativeValuesOptions;
import com.googlecode.wickedcharts.showcase.options.ColumnWithRotatedLabelsOptions;
import com.googlecode.wickedcharts.showcase.options.ComboOptions;
import com.googlecode.wickedcharts.showcase.options.DonutOptions;
import com.googlecode.wickedcharts.showcase.options.LineWithDataLabelsOptions;
import com.googlecode.wickedcharts.showcase.options.LogarithmicAxisOptions;
import com.googlecode.wickedcharts.showcase.options.PercentageAreaOptions;
import com.googlecode.wickedcharts.showcase.options.PieWithGradientOptions;
import com.googlecode.wickedcharts.showcase.options.PieWithLegendOptions;
import com.googlecode.wickedcharts.showcase.options.PolarOptions;
import com.googlecode.wickedcharts.showcase.options.ScatterPlotOptions;
import com.googlecode.wickedcharts.showcase.options.SplineUpdatingOptions;
import com.googlecode.wickedcharts.showcase.options.SplineWithInvertedAxisOptions;
import com.googlecode.wickedcharts.showcase.options.SplineWithPlotBandsOptions;
import com.googlecode.wickedcharts.showcase.options.SplineWithSymbolsOptions;
import com.googlecode.wickedcharts.showcase.options.StackedAndGroupedColumnOptions;
import com.googlecode.wickedcharts.showcase.options.StackedAreaOptions;
import com.googlecode.wickedcharts.showcase.options.StackedBarOptions;
import com.googlecode.wickedcharts.showcase.options.StackedColumnOptions;
import com.googlecode.wickedcharts.showcase.options.StackedPercentageOptions;
import com.googlecode.wickedcharts.showcase.options.TimeDataWithIrregularIntervalsOptions;
import com.googlecode.wickedcharts.showcase.options.ZoomableTimeSeriesOptions;
import com.googlecode.wickedcharts.showcase.options.base.ShowcaseOptions;

/**
 * This page has been build to show all Options in a basic design without jquery
 * UI and such, so that it can be viewed in all browsers without hassle.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class SimplePage extends WebPage {

	private Options selectedOptions;

	private static List<ShowcaseOptions> choices = Arrays.asList(
			new AreaInvertedAxisOptions(), new AreaMissingOptions(),
			new AreaSplineOptions(), new AreaWithNegativeValuesOptions(),
			new BarWithNegativeStackOptions(), new BasicAreaOptions(),
			new BasicBarOptions(), new BasicColumnOptions(),
			new BasicLineOptions(), new BasicPieOptions(),
			new BubbleChartOptions(), new ColumnWithDrilldownOptions(),
			new ColumnWithNegativeValuesOptions(),
			new ColumnWithRotatedLabelsOptions(), new ComboOptions(),
			new DonutOptions(), new LineWithDataLabelsOptions(),
			new LogarithmicAxisOptions(), new PercentageAreaOptions(),
			new PieWithGradientOptions(), new PieWithLegendOptions(),
			new PolarOptions(), new ScatterPlotOptions(),
			new SplineUpdatingOptions(), new SplineWithInvertedAxisOptions(),
			new SplineWithPlotBandsOptions(), new SplineWithSymbolsOptions(),
			new StackedAndGroupedColumnOptions(), new StackedAreaOptions(),
			new StackedBarOptions(), new StackedColumnOptions(),
			new StackedPercentageOptions(),
			new TimeDataWithIrregularIntervalsOptions(),
			new ZoomableTimeSeriesOptions());

	static {

		Collections.sort(choices, new Comparator<ShowcaseOptions>() {

			@Override
			public int compare(ShowcaseOptions o1, ShowcaseOptions o2) {
				return o1.getLabel().compareTo(o2.getLabel());
			}
		});

	}

	public SimplePage() {
		this(choices.get(0));
	}

	public SimplePage(Options options) {
		selectedOptions = options;
		final Chart chart = new Chart("chart", selectedOptions);
		this.add(chart);

		Form<Void> form = new Form<Void>("form") {
			@Override
			protected void onSubmit() {
				setResponsePage(new SimplePage(selectedOptions));
			}
		};
		this.add(form);

		final DropDownChoice<ShowcaseOptions> dropdown = new DropDownChoice<ShowcaseOptions>(
				"chartSelect", new PropertyModel<ShowcaseOptions>(this,
						"selectedOptions"), choices);
		form.add(dropdown);

		dropdown.setChoiceRenderer(new IChoiceRenderer<ShowcaseOptions>() {

			@Override
			public Object getDisplayValue(ShowcaseOptions object) {
				return object.getLabel();
			}

			@Override
			public String getIdValue(ShowcaseOptions object, int index) {
				return String.valueOf(index);
			}
		});
	}
}
