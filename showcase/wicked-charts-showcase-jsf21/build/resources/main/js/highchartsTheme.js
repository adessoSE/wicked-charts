Highcharts.setOptions({
  "chart" : {
    "backgroundColor" : {
      "stops" : [ [ 0, "rgba(96,96,96,1.00)" ], [ 1, "rgba(16,16,16,1.00)" ] ],
      "linearGradient" : [ 0, 0, 0, 400 ]
    },
    "borderRadius" : 15,
    "borderWidth" : 0,
    "plotBackgroundColor" : null,
    "plotBorderWidth" : 0,
    "plotShadow" : false
  },
  "colors" : [ "#dddf0d", "#7798bf", "#55bf3b", "#df5353", "#aaeeee", "#ff0066", "#eeaaee", "#55bf3b", "#df5353", "#7798bf", "#aaeeee" ],
  "title" : {
    "style" : { color: '#FFF', font: '16px Lucida Grande, Lucida Sans Unicode, Verdana, Arial, Helvetica, sans-serif' }
  },
  "subtitle" : {
    "style" : { color: '#DDD', font: '12px Lucida Grande, Lucida Sans Unicode, Verdana, Arial, Helvetica, sans-serif' }
  },
  "xAxis" : [ {
    "title" : {
      "style" : { color: '#999', font: 'bold 12px Lucida Grande, Lucida Sans Unicode, Verdana, Arial, Helvetica, sans-serif' }
    },
    "gridLineWidth" : 0,
    "labels" : {
      "style" : { fontWeight: 'bold', color: '#DDD' }
    },
    "lineColor" : "#999999",
    "tickColor" : "#999999"
  } ],
  "yAxis" : [ {
    "title" : {
      "style" : { color: '#999', font: 'bold 12px Lucida Grande, Lucida Sans Unicode, Verdana, Arial, Helvetica, sans-serif' }
    },
    "alternateGridColor" : null,
    "gridLineColor" : "rgba(255,255,255,0.10)",
    "labels" : {
      "style" : { fontWeight: 'bold', color: '#DDD' }
    },
    "lineWidth" : 0,
    "minorTickInterval" : null,
    "tickWidth" : 0
  } ],
  "legend" : {
    "itemStyle" : { color: '#CCC' },
    "itemHoverStyle" : { color: '#FFF' },
    "itemHiddenStyle" : { color: '#333' }
  },
  "exporting" : {
    "buttons" : {
      "exportButton" : {
        "symbolFill" : "#55be3b"
      },
      "printButton" : {
        "symbolFill" : "#7797be"
      }
    }
  },
  "plotOptions" : {
    "line" : {
      "dataLabels" : {
        "color" : "#cccccc"
      },
      "marker" : {
        "lineColor" : "#333333"
      }
    },
    "scatter" : {
      "marker" : {
        "lineColor" : "#333333"
      }
    },
    "spline" : {
      "marker" : {
        "lineColor" : "#333333"
      }
    },
    "candleStick" : {
      "lineColor" : "#ffffff"
    }
  },
  "tooltip" : {
    "backgroundColor" : {
      "stops" : [ [ 0, "rgba(96,96,96,0.80)" ], [ 1, "rgba(16,16,16,0.80)" ] ],
      "linearGradient" : [ 0, 0, 0, 50 ]
    },
    "borderWidth" : 0,
    "style" : { color: '#FFF' }
  },
  "navigation" : {
    "buttonOptions" : {
      "backgroundColor" : {
        "stops" : [ [ 0.4, "#606060" ], [ 0.6, "#333333" ] ],
        "linearGradient" : [ 0, 0, 0, 20 ]
      },
      "borderColor" : "#000000",
      "hoverSymbolStroke" : "#ffffff",
      "symbolStroke" : "#c0c0c0"
    }
  },
  "legendBackgroundColor" : "rgba(48,48,48,0.80)",
  "legendBackgroundColorSolid" : "rgba(70,70,70,1.00)",
  "dataLabelsColor" : "#444444",
  "textColor" : "#e0e0e0",
  "maskColor" : "rgba(255,255,255,0.00)",
  "toolbar" : { },
  "rangeSelector" : { },
  "navigator" : { },
  "scrollbar" : { }
})