package de.adesso.wickedcharts.showcase.ie;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.ChoiceRenderer;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.IChoiceRenderer;
import org.apache.wicket.model.PropertyModel;

import de.adesso.wickedcharts.wicket6.highcharts.Chart;

import de.adesso.wickedcharts.highcharts.options.Options;
import de.adesso.wickedcharts.showcase.options.AngularGaugeOptions;
import de.adesso.wickedcharts.showcase.options.AreaInvertedAxisOptions;
import de.adesso.wickedcharts.showcase.options.AreaMissingOptions;
import de.adesso.wickedcharts.showcase.options.AreaRangeOptions;
import de.adesso.wickedcharts.showcase.options.AreaSplineOptions;
import de.adesso.wickedcharts.showcase.options.AreaWithNegativeValuesOptions;
import de.adesso.wickedcharts.showcase.options.BarWithNegativeStackOptions;
import de.adesso.wickedcharts.showcase.options.BasicAreaOptions;
import de.adesso.wickedcharts.showcase.options.BasicBarOptions;
import de.adesso.wickedcharts.showcase.options.BasicColumnOptions;
import de.adesso.wickedcharts.showcase.options.BasicLineOptions;
import de.adesso.wickedcharts.showcase.options.BasicPieOptions;
import de.adesso.wickedcharts.showcase.options.BubbleChartOptions;
import de.adesso.wickedcharts.showcase.options.ClickToAddAPointOptions;
import de.adesso.wickedcharts.showcase.options.ColumnRangeOptions;
import de.adesso.wickedcharts.showcase.options.ColumnWithDrilldownOptions;
import de.adesso.wickedcharts.showcase.options.ColumnWithNegativeValuesOptions;
import de.adesso.wickedcharts.showcase.options.ColumnWithRotatedLabelsOptions;
import de.adesso.wickedcharts.showcase.options.ComboOptions;
import de.adesso.wickedcharts.showcase.options.DonutOptions;
import de.adesso.wickedcharts.showcase.options.LineWithDataLabelsOptions;
import de.adesso.wickedcharts.showcase.options.LogarithmicAxisOptions;
import de.adesso.wickedcharts.showcase.options.PercentageAreaOptions;
import de.adesso.wickedcharts.showcase.options.PieWithGradientOptions;
import de.adesso.wickedcharts.showcase.options.PieWithLegendOptions;
import de.adesso.wickedcharts.showcase.options.PolarOptions;
import de.adesso.wickedcharts.showcase.options.ScatterPlotOptions;
import de.adesso.wickedcharts.showcase.options.ScatterWithRegressionLineOptions;
import de.adesso.wickedcharts.showcase.options.SpiderwebOptions;
import de.adesso.wickedcharts.showcase.options.SplineWithInvertedAxisOptions;
import de.adesso.wickedcharts.showcase.options.SplineWithPlotBandsOptions;
import de.adesso.wickedcharts.showcase.options.SplineWithSymbolsOptions;
import de.adesso.wickedcharts.showcase.options.StackedAndGroupedColumnOptions;
import de.adesso.wickedcharts.showcase.options.StackedAreaOptions;
import de.adesso.wickedcharts.showcase.options.StackedBarOptions;
import de.adesso.wickedcharts.showcase.options.StackedColumnOptions;
import de.adesso.wickedcharts.showcase.options.StackedPercentageOptions;
import de.adesso.wickedcharts.showcase.options.TimeDataWithIrregularIntervalsOptions;
import de.adesso.wickedcharts.showcase.options.WicketSplineUpdatingOptions;
import de.adesso.wickedcharts.showcase.options.WindroseOptions;
import de.adesso.wickedcharts.showcase.options.ZoomableTimeSeriesOptions;
import de.adesso.wickedcharts.showcase.options.base.ShowcaseOptions;

/**
 * This page has been build to show all Options in a basic design without jquery
 * UI and such, so that it can be viewed in all browsers without hassle.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class SimplePage extends WebPage {

	private static final long serialVersionUID = 1L;

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
			new WicketSplineUpdatingOptions(),
			new SplineWithInvertedAxisOptions(),
			new SplineWithPlotBandsOptions(), new SplineWithSymbolsOptions(),
			new StackedAndGroupedColumnOptions(), new StackedAreaOptions(),
			new StackedBarOptions(), new StackedColumnOptions(),
			new StackedPercentageOptions(),
			new TimeDataWithIrregularIntervalsOptions(),
			new ZoomableTimeSeriesOptions(true), new AngularGaugeOptions(),
			new SpiderwebOptions(), new WindroseOptions(),
			new ScatterWithRegressionLineOptions(), new ColumnRangeOptions(),
			new AreaRangeOptions(), new ClickToAddAPointOptions());

	static {

		Collections.sort(SimplePage.choices, new Comparator<ShowcaseOptions>() {

			@Override
			public int compare(ShowcaseOptions o1, ShowcaseOptions o2) {
				return o1.getLabel().compareTo(o2.getLabel());
			}
		});

	}

	public SimplePage() {
		this(SimplePage.choices.get(0));
	}

	public SimplePage(Options options) {
		this.selectedOptions = options;

		// create fresh instance of SplineUpdatingOptions for correct time ticks
		if (this.selectedOptions instanceof WicketSplineUpdatingOptions) {
			((WicketSplineUpdatingOptions) this.selectedOptions).refresh();
		}

		final Chart chart = new Chart("chart", this.selectedOptions);
		this.add(chart);

		Form<Void> form = new Form<Void>("form") {
			private static final long serialVersionUID = 1L;

			@Override
			protected void onSubmit() {
				this.setResponsePage(new SimplePage(
						SimplePage.this.selectedOptions));
			}
		};
		this.add(form);

		final DropDownChoice<ShowcaseOptions> dropdown = new DropDownChoice<ShowcaseOptions>(
				"chartSelect", new PropertyModel<ShowcaseOptions>(this,
						"selectedOptions"), SimplePage.choices);
		form.add(dropdown);

		dropdown.setChoiceRenderer(new ChoiceRenderer<ShowcaseOptions>() {

			private static final long serialVersionUID = 1L;

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
