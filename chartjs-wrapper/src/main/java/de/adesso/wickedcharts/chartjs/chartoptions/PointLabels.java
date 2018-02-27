package de.adesso.wickedcharts.chartjs.chartoptions;

import java.io.Serializable;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.Color;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class PointLabels implements Serializable{
	private static final long serialVersionUID = 1L;
	private Callback callback;
	private Color fontColor;
	private String fontFamily;
	private Number fontSize;
	private FontStyle fontStyle;

}
