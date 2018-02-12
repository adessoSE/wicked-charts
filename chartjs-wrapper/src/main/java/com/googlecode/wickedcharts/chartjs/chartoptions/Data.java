package com.googlecode.wickedcharts.chartjs.chartoptions;

import java.util.List;
import java.util.stream.Collectors;


public class Data {
	
	private List<Label> labels;
	private List<Dataset> datasets;
	
	public List<Dataset> getDatasets() {
		return datasets;
	}

	public Data setDatasets(List<Dataset> datasets) {
		this.datasets = datasets;
		return this;
	}

	public List<Label> getLabels() {
		return labels;
	}

	@SuppressWarnings("unchecked")
	public Data setLabels(List<?> labels) {
		if(!labels.isEmpty()) {
			if(String.class.isInstance(labels.get(0))) { // Convert List of Strings to a List of Labels
				this.labels = ((List<String>)labels).stream().map(text -> new Label(text)).collect(Collectors.toList());
			}
			if(Label.class.isInstance(labels.get(0))) { // If the list contains Labels, just set them
				this.labels = (List<Label>) labels;
			}
		}
		return this;
	}
}
