function drilldown(point, drilldownOptionsArray) {
	var index = point.drilldownOptionsIndex;
	var drilldownOptions = drilldownOptionsArray[index];
	if (drilldownOptions) {
		new Highcharts.Chart(drilldownOptions);
	}
}