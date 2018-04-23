/**
 *   Copyright 2012-2018 Wicked Charts (http://github.com/adessoAG/wicked-charts)
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
package de.adesso.wickedcharts.highcharts.options.series;

import java.util.Arrays;
import java.util.List;

/**
 * @param <X> Type of x coordinate
 * @param <Y> Type of y coordinate
 * @param <Z> Type of y coordinate
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 */
public class Custom3DCoordinateSeries<X, Y, Z> extends Series<ThreeDCoordinate<X, Y, Z>> {

    private static final long serialVersionUID = 1L;

    @Override
    public List<ThreeDCoordinate<X, Y, Z>> getData() {
        return super.getData();
    }

    public Custom3DCoordinateSeries<X, Y, Z> setData(final ThreeDCoordinate<X, Y, Z>... data) {
        super.setData(Arrays.asList(data));
        return this;
    }

    @Override
    public Custom3DCoordinateSeries<X, Y, Z> setData(final List<ThreeDCoordinate<X, Y, Z>> data) {
        super.setData(data);
        return this;
    }

}
