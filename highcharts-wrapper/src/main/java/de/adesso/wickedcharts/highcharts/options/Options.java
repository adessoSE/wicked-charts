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

import com.fasterxml.jackson.annotation.JsonIgnore;

import de.adesso.wickedcharts.highcharts.options.color.ColorReference;
import de.adesso.wickedcharts.highcharts.options.heatmap.ColorAxis;
import de.adesso.wickedcharts.highcharts.options.series.Series;

import java.io.Serializable;
import java.util.*;

/**
 * This is the main class for configuring a chart. The structure of this class
 * is designed to be very close to the Highcharts options object. For
 * explanations of all options, please consult the Highcharts API reference.
 *
 * The options object will be serialized to a JSON object which is passed into
 * the Highcharts Javascript library. Options that are not set (i.e. that are
 * null), are not serialized into JSON, so that the default values of the
 * Highcharts library will be used.
 *
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * @see <a href="http://api.highcharts.com/highcharts">http://api.highcharts.com/highcharts</a>
 */
public class Options implements Serializable {

    @JsonIgnore
    private Map<String, List<IProcessableOption>> processingRegistry = new HashMap<String, List<IProcessableOption>>();

    private static final long serialVersionUID = 1L;

    private ColorAxis colorAxis;

    private ChartOptions chart;

    private List<Series<?>> series;

    private List<ColorReference> colors;

    private Title title;

    private Title subtitle;

    private List<Axis> xAxis;

    private List<Axis> yAxis;

    private Legend legend;

    private ExportingOptions exporting;

    private CreditOptions credits;

    private PlotOptionsChoice plotOptions;

    private Tooltip tooltip;

    private Global global;

    private Pane pane;

    @JsonIgnore
    private Labels labels;

    private Loading loading;

    private Navigation navigation;

    public Options() {

    }

    /**
     * Constructs an {@link Options} object initialized with the configuration of
     * another {@link Options} object.
     *
     * @param template the {@link Options} object to copy the configuration from.
     */
    public Options(final Options template) {
        copyFrom(template);
    }

    public Options addColor(final ColorReference color) {
        if (this.colors == null) {
            this.colors = new ArrayList<ColorReference>();
        }
        this.colors.add(color);
        return this;
    }

    public Options addSeries(final Series<?> series) {
        if (this.series == null) {
            this.series = new ArrayList<Series<?>>();
        }
        this.series.add(series);
        return this;
    }

    /**
     * Adds an XAxis to the chart. You can use {@link #setxAxis(Axis)} if you want
     * to define a single axis only.
     *
     * @param xAxis the XAxis to add.
     * @return the {@link Options} object for chaining.
     */
    public Options addxAxis(final Axis xAxis) {
        if (this.getxAxis() == null) {
            this.setxAxis(new ArrayList<Axis>());
        }
        this.getxAxis().add(xAxis);
        return this;
    }

    /**
     * Adds an YAxis to the chart. You can use {@link #setyAxis(Axis)} if you want
     * to define a single axis only.
     *
     * @param yAxis the YAxis to add.
     * @return the {@link Options} object for chaining.
     */
    public Options addyAxis(final Axis yAxis) {
        if (this.getyAxis() == null) {
            this.setyAxis(new ArrayList<Axis>());
        }
        this.getyAxis().add(yAxis);
        return this;
    }

    public void clearSeries() {
        this.series = new ArrayList<Series<?>>();
    }

    public void copyFrom(final Options template) {
        this.chart = template.chart;
        this.colors = template.colors;
        this.credits = template.credits;
        this.exporting = template.exporting;
        this.global = template.global;
        this.labels = template.labels;
        this.legend = template.legend;
        this.loading = template.loading;
        this.navigation = template.navigation;
        this.pane = template.pane;
        this.plotOptions = template.plotOptions;
        this.processingRegistry = template.processingRegistry;
        this.series = template.series;
        this.subtitle = template.subtitle;
        this.title = template.title;
        this.tooltip = template.tooltip;
        this.setxAxis(template.getxAxis());
        this.setyAxis(template.getyAxis());
    }

    public ChartOptions getChart() {
        return this.chart;
    }

    public ColorAxis getColorAxis() {
        return colorAxis;
    }

    @JsonIgnore
    public ChartOptions getChartOptions() {
        return this.chart;
    }

    public List<? extends ColorReference> getColors() {
        return this.colors;
    }

    public CreditOptions getCreditOptions() {
        return this.credits;
    }

    public CreditOptions getCredits() {
        return this.credits;
    }

    public ExportingOptions getExporting() {
        return this.exporting;
    }

    public Global getGlobal() {
        return this.global;
    }

    public Labels getLabels() {
        return this.labels;
    }

    public Legend getLegend() {
        return this.legend;
    }

    public Loading getLoading() {
        return this.loading;
    }

    /**
     * Returns the {@link IProcessableOption}s that were marked by calling
     * {@link #markForProcessing(IProcessableOption)} with the given key.
     *
     * @param processingKey the key with which the options in questions were marked.
     * @return list of marked {@link IProcessableOption}s, or an empty list, if
     * none were marked
     */
    public List<IProcessableOption> getMarkedForProcessing(final String processingKey) {
        List<IProcessableOption> result = this.processingRegistry.get(processingKey);
        if (result == null) {
            return new ArrayList<IProcessableOption>();
        } else {
            return result;
        }
    }

    public Navigation getNavigation() {
        return this.navigation;
    }

    public Pane getPane() {
        return this.pane;
    }

    public PlotOptionsChoice getPlotOptions() {
        return this.plotOptions;
    }

    @SuppressWarnings("rawtypes")
    public List<? extends Series> getSeries() {
        return this.series;
    }

    /**
     * Returns the single xAxis. If there is more than one xAxis defined, the
     * first is returned.
     *
     * @return the single xAxis.
     */
    @JsonIgnore
    public Axis getSingleXAxis() {
        if (this.getxAxis() == null) {
            return null;
        } else {
            return this.getxAxis().get(0);
        }
    }

    /**
     * Returns the single yAxis. If there is more than one yAxis defined, the
     * first is returned.
     *
     * @return the single yAxis.
     */
    @JsonIgnore
    public Axis getSingleYAxis() {
        if (this.getyAxis() == null) {
            return null;
        } else {
            return this.getyAxis().get(0);
        }
    }

    public Title getSubtitle() {
        return this.subtitle;
    }

    public Title getTitle() {
        return this.title;
    }

    public Tooltip getTooltip() {
        return this.tooltip;
    }

    public List<Axis> getxAxis() {
        return this.xAxis;
    }

    public List<Axis> getyAxis() {
        return this.yAxis;
    }

    public void markForProcessing(final IProcessableOption option) {
        List<IProcessableOption> list = this.processingRegistry.get(option.getProcessingKey());
        if (list == null) {
            list = new ArrayList<IProcessableOption>();
            this.processingRegistry.put(option.getProcessingKey(), list);
        }
        list.add(option);
    }

    public Options setChart(final ChartOptions chart) {
        this.chart = chart;
        return this;
    }

    public Options setChartOptions(final ChartOptions chart) {
        this.chart = chart;
        return this;
    }

    public Options setColors(final ColorReference... colors) {
        this.colors = Arrays.asList(colors);
        return this;
    }

    public Options setColors(final List<ColorReference> colors) {
        this.colors = colors;
        return this;
    }

    public Options setCreditOptions(final CreditOptions credits) {
        this.credits = credits;
        return this;
    }

    public Options setCredits(final CreditOptions credits) {
        this.credits = credits;
        return this;
    }

    public Options setExporting(final ExportingOptions exporting) {
        this.exporting = exporting;
        return this;
    }

    public Options setGlobal(final Global global) {
        this.global = global;
        markForProcessing(global);
        return this;
    }

    public Options setLabels(final Labels labels) {
        this.labels = labels;
        return this;
    }

    public Options setLegend(final Legend legend) {
        this.legend = legend;
        return this;
    }

    public Options setLoading(final Loading loading) {
        this.loading = loading;
        return this;
    }

    public Options setNavigation(final Navigation navigation) {
        this.navigation = navigation;
        return this;
    }

    public Options setPane(final Pane pane) {
        this.pane = pane;
        return this;
    }

    public Options setPlotOptions(final PlotOptionsChoice plotOptions) {
        this.plotOptions = plotOptions;
        return this;
    }

    public Options setSeries(final List<Series<?>> series) {
        this.series = series;
        return this;
    }

    public Options setSubtitle(final Title subtitle) {
        this.subtitle = subtitle;
        return this;
    }

    public Options setTitle(final Title title) {
        this.title = title;
        return this;
    }

    public Options setTooltip(final Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    /**
     * Sets the single xAxis. If you need to define more than one xAxis use
     * {@link #addxAxis(Axis)}. If there are multiple Axes defined when calling
     * this method, only the specified axis will be defined afterwards.
     *
     * @param xAxis the single xAxis of the chart
     * @return the {@link Options} object for chaining
     */
    public Options setxAxis(final Axis xAxis) {
        this.xAxis = new ArrayList<Axis>();
        this.xAxis.add(xAxis);
        return this;
    }

    public Options setxAxis(final List<Axis> xAxis) {
        this.xAxis = xAxis;
        return this;
    }

    /**
     * Sets the single yAxis. If you need to define more than one yAxis use
     * {@link #addyAxis(Axis)}. If there are multiple Axes defined when calling
     * this method, only the specified axis will be defined afterwards.
     *
     * @param yAxis the single yAxis of the chart
     * @return the {@link Options} object for chaining
     */
    public Options setyAxis(final Axis yAxis) {
        this.yAxis = new ArrayList<Axis>();
        this.yAxis.add(yAxis);
        return this;
    }

    public Options setyAxis(final List<Axis> yAxis) {
        this.yAxis = yAxis;
        return this;
    }

    public Options setColorAxis(final ColorAxis colorAxis) {
        this.colorAxis = colorAxis;
        return this;
    }

}
