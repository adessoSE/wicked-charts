package de.adesso.wickedcharts.showcase.ie;

import de.adesso.wickedcharts.highcharts.options.Options;
import de.adesso.wickedcharts.showcase.options.*;
import de.adesso.wickedcharts.showcase.options.highcharts.base.*;
import de.adesso.wickedcharts.wicket6.highcharts.Chart;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.ChoiceRenderer;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.model.PropertyModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
