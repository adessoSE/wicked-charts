/**
 * @namespace Root namespace of Wicked Charts.
 */
var WickedCharts = WickedCharts || {};

/**
 * @namespace Namespace of the Selection module of Wicked Charts.
 */
WickedCharts.Selection = {};

WickedCharts.Selection.selectionEventToJson = function (selectionEvent) {
    var wickedChartsEvent = {};
    wickedChartsEvent.xAxes = [];
    wickedChartsEvent.yAxes = [];

    // convert all xAxes from highcharts event to WickedCharts event
    if (!(selectionEvent.xAxis === undefined)) {
        selectionEvent.xAxis.map(function (xAxis) {
            console.log(xAxis);
            wickedChartsEvent.xAxes.push({
                wickedChartsId: xAxis.axis.options.wickedChartsId,
                min: xAxis.min,
                max: xAxis.max
            });
        });
    }

    // convert all yAxes from highcharts event to WickedCharts event
    if (!(selectionEvent.yAxis === undefined)) {
        selectionEvent.yAxis.map(function (yAxis) {
            wickedChartsEvent.yAxes.push({
                wickedChartsId: yAxis.axis.options.wickedChartsId,
                min: yAxis.min,
                max: yAxis.max
            });
        });
    }

    return JSON.stringify(wickedChartsEvent);
}
