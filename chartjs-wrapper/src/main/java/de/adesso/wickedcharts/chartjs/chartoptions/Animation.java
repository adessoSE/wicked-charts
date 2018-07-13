package de.adesso.wickedcharts.chartjs.chartoptions;

import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Defines the animations.
 *
 * @see <a href="http://www.chartjs.org/docs/latest/configuration/animations.html?h=animation">http://www.chartjs.org/docs/latest/configuration/animations.html?h=animation</a>
 *
 * @author anedomansky
 * @author maximAtanasov
 */
@Accessors(chain = true)
@lombok.Data
public class Animation implements Serializable {
	private static final long serialVersionUID = 1L;
	private Boolean animateScale;
	private Boolean animateRotate;
	
	// animation options
	private Integer duration;
	private CallbackFunction onProgress;
	private CallbackFunction onComplete;
	private EasingType easing;
	
}
