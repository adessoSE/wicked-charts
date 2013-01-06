package com.googlecode.wickedcharts.wicket6.highcharts.features.interaction;

import org.apache.wicket.ajax.AjaxRequestTarget;

import com.googlecode.wickedcharts.highcharts.options.Options;
import com.googlecode.wickedcharts.highcharts.options.interaction.InteractionEvent;
import com.googlecode.wickedcharts.highcharts.options.series.Point;
import com.googlecode.wickedcharts.highcharts.options.series.Series;

/**
 * Wicket-specific extension of {@link InteractionEvent}.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class WicketInteractionEvent extends InteractionEvent {

	private AjaxRequestTarget ajaxRequestTarget;

	private final InteractionEvent wrappedEvent;

	WicketInteractionEvent(AjaxRequestTarget ajaxRequestTarget, InteractionEvent wrappedEvent) {
		this.wrappedEvent = wrappedEvent;
		this.setAjaxRequestTarget(ajaxRequestTarget);
	}

	public void setAjaxRequestTarget(AjaxRequestTarget ajaxRequestTarget) {
		this.ajaxRequestTarget = ajaxRequestTarget;
	}

	/**
	 * Returns the {@link AjaxRequestTarget} that is connected to the AJAX request
	 * that was triggered by interacting with a chart.
	 * 
	 * @return the Wicket {@link AjaxRequestTarget}.
	 */
	public AjaxRequestTarget getAjaxRequestTarget() {
		return ajaxRequestTarget;
	}

	@Override
	public Options getSelectedChart() {
		return wrappedEvent.getSelectedChart();
	}

	@Override
	public Point getSelectedPoint() {
		return wrappedEvent.getSelectedPoint();
	}

	@Override
	public Series<?> getSelectedSeries() {
		return wrappedEvent.getSelectedSeries();
	}

	@Override
	public void setSelectedChart(Options selectedChart) {
		wrappedEvent.setSelectedChart(selectedChart);
	}

	@Override
	public void setSelectedPoint(Point selectedPoint) {
		wrappedEvent.setSelectedPoint(selectedPoint);
	};

	@Override
	public void setSelectedSeries(Series<?> selectedSeries) {
		wrappedEvent.setSelectedSeries(selectedSeries);
	}

}
