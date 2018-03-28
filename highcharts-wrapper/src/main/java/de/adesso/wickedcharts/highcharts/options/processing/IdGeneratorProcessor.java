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
package de.adesso.wickedcharts.highcharts.options.processing;

import de.adesso.wickedcharts.highcharts.options.Axis;
import de.adesso.wickedcharts.highcharts.options.Options;
import de.adesso.wickedcharts.highcharts.options.series.Point;
import de.adesso.wickedcharts.highcharts.options.series.Series;

/**
 * This {@link IOptionsProcessor} assigns a unique ID to all {@link Series},
 * {@link Axis} and {@link Point}s that are contained in an {@link Options}
 * object.
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
	public void processOptions(final Options options, final OptionsProcessorContext context) {
		if (options.getSeries() != null) {
			for (Series<?> series : options.getSeries()) {
				series.setWickedChartsId(++this.currentId);

				if (series.getData() != null) {
					for (Object object : series.getData()) {
						if (!(object instanceof Point)) {
							break;
						} else {
							Point point = (Point) object;
							point.setWickedChartsId(++this.currentId);
						}
					}
				}
			}

		}

		if (options.getxAxis() != null) {
			for (Axis axis : options.getxAxis()) {
				axis.setWickedChartsId(++this.currentId);
			}
		}

		if (options.getyAxis() != null) {
			for (Axis axis : options.getyAxis()) {
				axis.setWickedChartsId(++this.currentId);
			}
		}
	}

}
