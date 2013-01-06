package com.googlecode.wickedcharts.highcharts.options.processing;

import com.googlecode.wickedcharts.highcharts.options.Options;
import com.googlecode.wickedcharts.highcharts.options.series.Point;
import com.googlecode.wickedcharts.highcharts.options.series.Series;

/**
 * This {@link IOptionsProcessor} assigns a unique ID to all {@link Series} and
 * {@link Point}s that are contained in an {@link Options} object.
 * <p/>
 * After this processor has processed an {@link Options} object, you can
 * retrieve the assigned IDs by calling getWickedChartsId() on the
 * {@link Series} and {@link Point}s.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class IdGeneratorProcessor implements IOptionsProcessor {

	private int currentId = 0;

	@Override
	public void processOptions(Options options, OptionsProcessorContext context) {
		for (Series<?> series : options.getSeries()) {
			series.setWickedChartsId(++currentId);

			for (Object object : series.getData()) {
				if (!(object instanceof Point)) {
					break;
				} else {
					Point point = (Point) object;
					point.setWickedChartsId(++currentId);
				}
			}
		}
	}

}
