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
package de.adesso.wickedcharts.highcharts.options;

import java.io.Serializable;

import de.adesso.wickedcharts.highcharts.options.color.ColorReference;

/**
 * Defines the configuration of the background option.
 * 
 * @see <a
 *      href="http://api.highcharts.com/highcharts#pane.background">http://api.highcharts.com/highcharts#pane.background</a>
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class Background implements Serializable {

  private static final long serialVersionUID = 1L;

  private ColorReference backgroundColor;

  private Integer innerWidth;

  private Integer outerWidth;

  private Integer borderWidth;

  private ColorReference borderColor;

  private PixelOrPercent outerRadius;

  private PixelOrPercent innerRadius;

  public final static Background DEFAULT_BACKGROUND = new Background();

  public ColorReference getBackgroundColor() {
    return this.backgroundColor;
  }

  public ColorReference getBorderColor() {
    return this.borderColor;
  }

  public Integer getBorderWidth() {
    return this.borderWidth;
  }

  public Integer getInnerWidth() {
    return this.innerWidth;
  }

  public Integer getOuterWidth() {
    return this.outerWidth;
  }

  public Background setBackgroundColor(final ColorReference backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

  public Background setBorderColor(final ColorReference borderColor) {
    this.borderColor = borderColor;
    return this;
  }

  public Background setBorderWidth(final Integer borderWidth) {
    this.borderWidth = borderWidth;
    return this;
  }

  public Background setInnerWidth(final Integer innerWidth) {
    this.innerWidth = innerWidth;
    return this;
  }

  public Background setOuterWidth(final Integer outerWidth) {
    this.outerWidth = outerWidth;
    return this;
  }

  public Background setOuterRadius(PixelOrPercent outerRadius) {
    this.outerRadius = outerRadius;
    return this;
  }

  public PixelOrPercent getOuterRadius() {
    return outerRadius;
  }

  public Background setInnerRadius(PixelOrPercent innerRadius) {
    this.innerRadius = innerRadius;
    return this;
  }

  public PixelOrPercent getInnerRadius() {
    return innerRadius;
  }

}
