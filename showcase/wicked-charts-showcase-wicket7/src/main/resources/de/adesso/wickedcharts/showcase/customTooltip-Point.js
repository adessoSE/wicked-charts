var customTooltips = function(tooltip) {
	$(this._chart.canvas).css("cursor", "pointer");

	var positionY = this._chart.canvas.offsetTop;
	var positionX = this._chart.canvas.offsetLeft;

	$(".chartjs-tooltip").css({
		opacity : 0,
	});

	if (!tooltip || !tooltip.opacity) {
		return;
	}

	if (tooltip.dataPoints.length > 0) {
		tooltip.dataPoints.forEach(function(dataPoint) {
			var content = [ dataPoint.xLabel, dataPoint.yLabel ].join(": ");
			var $tooltip = $("#tooltip-" + dataPoint.datasetIndex);

			$tooltip.html(content);
			$tooltip.css({
				opacity : 1,
				top : positionY + dataPoint.y + "px",
				left : positionX + dataPoint.x + "px",
			});
		});
	}
};