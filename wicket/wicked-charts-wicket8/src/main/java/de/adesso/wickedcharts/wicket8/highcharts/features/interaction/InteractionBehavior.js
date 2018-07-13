/**
 * @namespace Root namespace of Wicked Charts.
 */
var WickedCharts = WickedCharts || {};

/**
 * @namespace Namespace of the Interaction module of Wicked Charts.
 */
WickedCharts.Interaction = {};

/**
 * Retrieves the wickedChartsId of the series the given object belongs to.
 *
 * @param highchartsObject the Highcharts object whose series to determine.
 *          Must either be a Point or a Series object, otherwise the result is null.
 * @see http://api.highcharts.com/highcharts#Series
 * @see http://api.highcharts.com/highcharts#Point
 */
WickedCharts.Interaction.getSelectedSeries = function (highchartsObject) {
    var objectType = WickedCharts.Interaction.getObjectType(highchartsObject);
    if (objectType == 'point') {
        return highchartsObject.series.options.wickedChartsId;
    } else if (objectType == 'series') {
        return highchartsObject.options.wickedChartsId;
    } else {
        return null;
    }
};

/**
 * Retrieves the wickedChartsId of the point the given object belongs to.
 *
 * @param highchartsObject the Highcharts object whose point to determine.
 *          Must be a Point object, otherwise the result is null
 * @see http://api.highcharts.com/highcharts#Point
 */
WickedCharts.Interaction.getSelectedPoint = function (highchartsObject) {
    var objectType = WickedCharts.Interaction.getObjectType(highchartsObject);
    if (objectType == 'point') {
        return highchartsObject.wickedChartsId;
    } else {
        return null;
    }
};

/**
 * Determines the type of the given object. Returns 'point' if the object
 * is a point, 'series' if the object is a series and null if it is none
 * of the above.
 */
WickedCharts.Interaction.getObjectType = function (object) {
    if (object != null && object.series != null && typeof object.series == 'object') {
        return 'point';
    } else if (object != null && object.chart != null && typeof object.chart == 'object') {
        return 'series';
    } else {
        return null;
    }
}