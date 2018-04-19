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
package de.adesso.wickedcharts.highcharts.options.processing;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import de.adesso.wickedcharts.highcharts.options.Global;
import de.adesso.wickedcharts.highcharts.options.IProcessableOption;
import de.adesso.wickedcharts.highcharts.options.Options;
import de.adesso.wickedcharts.highcharts.options.drilldown.DrilldownPoint;
import de.adesso.wickedcharts.highcharts.options.interaction.InteractionFunction;
import de.adesso.wickedcharts.highcharts.options.interaction.SelectionFunction;
import de.adesso.wickedcharts.highcharts.options.livedata.LiveDataSeries;

/**
 * A context object that holds some context variables that may be needed by
 * {@link IOptionsProcessor}s.
 *
 * This class is not part of the public API!
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class OptionsProcessorContext implements Serializable {

	private static final long serialVersionUID = 1L;

	private final List<Options> drilldownOptions = new ArrayList<Options>();

	private final List<LiveDataSeries> liveDataSeries = new ArrayList<LiveDataSeries>();

	private final Global global;

	private final List<InteractionFunction> interactionFunctions = new ArrayList<InteractionFunction>();

	private final List<SelectionFunction> selectionFunctions = new ArrayList<SelectionFunction>();

	public OptionsProcessorContext(final Options options) {
		collectDrilldownOptions(options);
		collectLiveDataSeries(options);
		collectInteractionFunctions(options);
		collectSelectionFunctions(options);
		this.global = options.getGlobal();

	}

	@SuppressWarnings("unchecked")
	private void collectLiveDataSeries(final Options options) {
		List<? extends IProcessableOption> series = options.getMarkedForProcessing(LiveDataSeries.PROCESSING_KEY);
		this.liveDataSeries.addAll((List<LiveDataSeries>) series);
	}

	@SuppressWarnings("unchecked")
	private void collectInteractionFunctions(final Options options) {
		List<? extends IProcessableOption> functions = options.getMarkedForProcessing(InteractionFunction.PROCESSING_KEY);
		this.interactionFunctions.addAll((List<InteractionFunction>) functions);
	}

	@SuppressWarnings("unchecked")
	private void collectSelectionFunctions(final Options options) {
		List<? extends IProcessableOption> functions = options.getMarkedForProcessing(SelectionFunction.PROCESSING_KEY);
		this.selectionFunctions.addAll((List<SelectionFunction>) functions);
	}

	/**
	 * Iterates recursively through all {@link DrilldownPoint}s and their
	 * drilldownOptions in the given {@link Options} and adds them to the context.
	 */
	@SuppressWarnings("unchecked")
	private void collectDrilldownOptions(final Options options) {
		List<? extends IProcessableOption> drilldownPoints = options.getMarkedForProcessing(DrilldownPoint.PROCESSING_KEY);
		for (DrilldownPoint drilldownPoint : (List<DrilldownPoint>) drilldownPoints) {
			Options drilldownOptions = drilldownPoint.getDrilldownOptions();
			if (!getDrilldownOptions().contains(drilldownOptions)) {
				getDrilldownOptions().add(drilldownOptions);
				collectDrilldownOptions(drilldownOptions);
			}
			drilldownPoint.setDrilldownOptionsIndex(getDrilldownOptions().indexOf(drilldownOptions));
		}
	}

	/**
	 * Gets the list of {@link Options} that are the target of a drill down.
	 * 
	 * @return the drilldown options used by the current chart.
	 */
	public List<Options> getDrilldownOptions() {
		return this.drilldownOptions;
	}

	/**
	 * Gets all {@link LiveDataSeries} in the context.
	 * 
	 * @return the {@link LiveDataSeries} used by the current chart.
	 */
	public List<LiveDataSeries> getLiveDataSeries() {
		return this.liveDataSeries;
	}

	/**
	 * Gets the {@link Global} object that is part of the {@link Options}.
	 * 
	 * @return the {@link Global} object.
	 */
	public Global getGlobal() {
		return this.global;
	}

	public List<InteractionFunction> getInteractionFunctions() {
		return this.interactionFunctions;
	}

	public List<SelectionFunction> getSelectionFunctions() {
		return this.selectionFunctions;
	}

	/**
	 * Returns true if the {@link Options} attached to this context contains the
	 * given feature.
	 * 
	 * @param feature
	 *          the feature for which to look.
	 * @return true if the context contains this feature, false if not.
	 */
	public boolean containsFeature(Feature feature) {
		switch (feature) {
			case DRILLDOWN:
				return !getDrilldownOptions().isEmpty();
			case GLOBAL:
				return getGlobal() != null;
			case INTERACTION:
				return !getInteractionFunctions().isEmpty();
			case LIVEDATA:
				return !getLiveDataSeries().isEmpty();
			case SELECTION:
				return !getSelectionFunctions().isEmpty();
			default:
				throw new UnsupportedFeatureException(feature);
		}
	}

}
