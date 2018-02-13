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
package de.adesso.wickedcharts.highcharts.options.series;

/**
 * @param <X> Type of x coordinate
 * @param <Y> Type of y coordinate
 * @param <Z> Type of z coordinate
 * @author Matthias Balke (matthias.balke@gmail.com)
 */
public class ThreeDCoordinate<X, Y, Z> extends Coordinate<X, Y> {

    private static final long serialVersionUID = 1L;

    private Boolean isZQuoted = Boolean.FALSE;

    private Z z;

    public ThreeDCoordinate(final X x, final Y y, final Z z) {
        super(x, y);
        this.z = z;
    }

    public Z getZ() {
        return this.z;
    }

    public ThreeDCoordinate<X, Y, Z> setZ(final Z z) {
        this.z = z;
        return this;
    }

    public Boolean isZQuoted() {
        return isZQuoted;
    }

    /**
     * If true, the z value will be put into quotes when serialized into javascript.
     */
    public ThreeDCoordinate setZQuoted(Boolean isZQuoted) {
        this.isZQuoted = isZQuoted;
        return this;
    }
}
