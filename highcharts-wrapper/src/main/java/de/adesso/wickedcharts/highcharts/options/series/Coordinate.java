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

import java.io.Serializable;

/**
 * @param <X> Type of x coordinate
 * @param <Y> Type of y coordinate
 * @author Matthias Balke (matthias.balke@gmail.com)
 */
public class Coordinate<X, Y> implements Serializable {

    private static final long serialVersionUID = 1L;

    private Boolean isXQuoted = Boolean.FALSE;

    private Boolean isYQuoted = Boolean.FALSE;

    private X x;

    private Y y;

    public Coordinate(final X x, final Y y) {
        this.x = x;
        this.y = y;
    }

    public X getX() {
        return this.x;
    }

    public Y getY() {
        return this.y;
    }

    public Coordinate<X, Y> setX(final X x) {
        this.x = x;
        return this;
    }

    public Coordinate<X, Y> setY(final Y y) {
        this.y = y;
        return this;
    }

    public Boolean isXQuoted() {
        return isXQuoted;
    }

    /**
     * If true, the x value will be put into quotes when serialized into javascript.
     */
    public Coordinate setXQuoted(Boolean isXQuoted) {
        this.isXQuoted = isXQuoted;
        return this;
    }

    public Boolean isYQuoted() {
        return isYQuoted;
    }

    /**
     * If true, the y value will be put into quotes when serialized into javascript.
     */
    public Coordinate setYQuoted(Boolean isYQuoted) {
        this.isYQuoted = isYQuoted;
        return this;
    }
}
