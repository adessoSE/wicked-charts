package de.adesso.wickedcharts.chartjs.chartoptions;

import java.io.Serializable;

import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class Animation implements Serializable {
	private static final long serialVersionUID = 1L;
	private Boolean animateScale;
	private Boolean animateRotate;
	private Integer duration;
	private CallbackFunction onProgress;
	private CallbackFunction onComplete;
}
