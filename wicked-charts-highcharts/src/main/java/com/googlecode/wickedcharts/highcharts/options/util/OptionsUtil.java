/**
 *   Copyright 2012-2013 Wicked Charts (http://wicked-charts.googlecode.com)
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.googlecode.wickedcharts.highcharts.options.util;

import java.util.ArrayList;
import java.util.List;

import com.googlecode.wickedcharts.highcharts.options.Axis;
import com.googlecode.wickedcharts.highcharts.options.ChartOptions;
import com.googlecode.wickedcharts.highcharts.options.ChartType;
import com.googlecode.wickedcharts.highcharts.options.Events;
import com.googlecode.wickedcharts.highcharts.options.Function;
import com.googlecode.wickedcharts.highcharts.options.Options;
import com.googlecode.wickedcharts.highcharts.options.series.Point;
import com.googlecode.wickedcharts.highcharts.options.series.Series;

public class OptionsUtil {

	private static OptionsUtil INSTANCE = new OptionsUtil();

	public static OptionsUtil getInstance() {
		return INSTANCE;
	}

	private OptionsUtil() {

	}

	/**
	 * Copies the renderTo configuration from one {@link Options} object to
	 * another. Null-safe.
	 */
	public void copyRenderTo(final Options from, final Options to) {
		if (to.getChartOptions() == null) {
			to.setChartOptions(new ChartOptions());
		}
		to.getChartOptions().setRenderTo(from.getChartOptions().getRenderTo());
	}

	/**
	 * Null-safe setter for the renderTo configuration.
	 */
	public void setRenderTo(final Options options, final String renderTo) {
		if (options.getChartOptions() == null) {
			options.setChartOptions(new ChartOptions());
		}
		options.getChartOptions().setRenderTo(renderTo);
	}

	/**
	 * Null-safe setter for the chart.events.load configuration.
	 */
	public void setChartEventsLoad(final Options options, final Function function) {
		if (options.getChartOptions().getEvents() == null) {
			options.getChartOptions().setEvents(new Events());
		}
		if (options.getChartOptions().getEvents().getLoad() == null) {
			options.getChartOptions().getEvents().setLoad(function);
		}
	}

	/**
	 * Checks if the specified Options object needs the javascript file
	 * "highcharts-more.js" to work properly. This method can be called by GUI
	 * components to determine whether the javascript file has to be included in
	 * the page or not.
	 * 
	 * @param options
	 *          the {@link Options} object to analyze
	 * @return true, if "highcharts-more.js" is needed to render the options,
	 *         false if not
	 */
	public static boolean needsHighchartsMoreJs(final Options options) {
		return hasPolar(options) || hasChartTypeNeedingMoreJs(options);
	}

	/**
	 * Checks if the specified Options object needs the javascript file
	 * "exporting.js" to work properly. This method can be called by GUI
	 * components to determine whether the javascript file has to be included in
	 * the page or not.
	 * 
	 * @param options
	 *          the {@link Options} object to analyze
	 * @return true, if "exporting.js" is needed to render the options, false if
	 *         not
	 */
	public static boolean needsExportingJs(final Options options) {
		// when no ExportingOptions are set, they are enabled by default, hence
		// return true when they are null
		return options.getExporting() == null
		    || (options.getExporting().getEnabled() != null && options.getExporting().getEnabled());
	}

	private static boolean hasPolar(final Options options) {
		return options.getChartOptions() != null && options.getChartOptions().getPolar() != null
		    && options.getChartOptions().getPolar();
	}

	private static boolean hasChartTypeNeedingMoreJs(final Options options) {
		if (options.getChartOptions() != null && options.getChartOptions().getType() != null
		    && options.getChartOptions().getType().getChartType() == ChartType.ADVANCED) {
			return true;
		}
		if (options.getSeries() != null) {
			for (Series<?> series : options.getSeries()) {
				if (series.getType() != null && series.getType().getChartType() == ChartType.ADVANCED) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Retrieves the {@link Series} object with the given wickedChartsId from the
	 * given {@link Options} object. Returns null if a Series with the given ID
	 * does not exist.
	 */
	public static Series<?> getSeriesWithWickedChartsId(final Options options, final int wickedChartsId) {
		for (Series<?> series : options.getSeries()) {
			if (series.getWickedChartsId() == wickedChartsId) {
				return series;
			}
		}
		return null;
	}

	/**
	 * Retrieves the {@link Point} object with the given wickedChartsId from the
	 * given {@link Options} object. Returns null if a Point with the given ID
	 * does not exist.
	 */
	public static Point getPointWithWickedChartsId(final Options options, final int wickedChartsId) {
		for (Series<?> series : options.getSeries()) {
			for (Object object : series.getData()) {
				if (!(object instanceof Point)) {
					break;
				} else {
					Point point = (Point) object;
					if (point.getWickedChartsId() == wickedChartsId) {
						return point;
					}
				}
			}
		}
		return null;
	}

	public static Axis getAxisWithWickedChartsId(final Options options, final int wickedChartsId) {
		List<Axis> allAxes = new ArrayList<Axis>();
		allAxes.addAll(options.getxAxis());
		allAxes.addAll(options.getyAxis());

		for (Axis axis : allAxes) {
			if (axis.getWickedChartsId() == wickedChartsId) {
				return axis;
			}
		}
		return null;
	}

	/**
	 * Returns the (0-based) index of the series with the given wickedChartsId or
	 * null.
	 * 
	 * @param options
	 *          the options in which to search
	 * @param wickedChartsId
	 *          the wickedChartsId of the series
	 * @return the index of the series with the given id. Returns 0 if no series
	 *         was found.
	 */
	public static int getSeriesIndex(final Options options, final int wickedChartsId) {
		int index = 0;
		for (Series<?> series : options.getSeries()) {
			if (series.getWickedChartsId() == wickedChartsId) {
				return index;
			}
			index++;
		}
		return 0;
	}
}
