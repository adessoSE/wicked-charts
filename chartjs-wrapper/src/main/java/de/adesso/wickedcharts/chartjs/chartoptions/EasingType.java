package de.adesso.wickedcharts.chartjs.chartoptions;

import de.adesso.wickedcharts.chartjs.json.JsonValueEnum;

import java.io.Serializable;

/**
 * Defines the type of easing for animations.
 *
 * @see <a href="http://www.chartjs.org/docs/latest/configuration/animations.html#easing">http://www.chartjs.org/docs/latest/configuration/animations.html#easing</a>
 *
 * @author anedomansky
 * @author maximAtanasov
 */
public enum EasingType implements JsonValueEnum, Serializable {
	EASE_IN_QUAD("easeInQuad"),
	EASE_OUT_QUAD("easeOutQuad"),
	EASE_IN_OUT_QUAD("easeInOutQuad"),
	EASE_IN_CUBIC("easeInCubic"),
	EASE_OUT_CUBIC("easeOutCubic"),
	EASE_IN_OUT_CUBIC("easeInOutCubic"),
	EASE_IN_QUART("easeInQuart"),
	EASE_OUT_QUART("easeOutQuart"),
	EASE_IN_OUT_QUART("easeInOutQuart"),
	EASE_IN_QUINT("easeInQuint"),
	EASE_OUT_QUINT("easeOutQuint"),
	EASE_IN_OUT_QUINT("easeInOutQuint"),
	EASE_IN_SINE("easeInSine"),
	EASE_OUT_SINE("easeOutSine"),
	EASE_IN_OUT_SINE("easeInOutSine"),
	EASE_IN_EXPO("easeInExpo"),
	EASE_OUT_EXPO("easeOutExpo"),
	EASE_IN_OUT_EXPO("easeInOutExpo"),
	EASE_IN_CIRC("easeInCirc"),
	EASE_OUT_CIRC("easeOutCirc"),
	EASE_IN_OUT_CIRC("easeInOutCirc"),
	EASE_IN_ELASTIC("easeInElastic"),
	EASE_OUT_ELASTIC("easeOutElastic"),
	EASE_IN_OUT_ELASTIC("easeInOutElastic"),
	EASE_IN_BACK("easeInBack"),
	EASE_OUT_BACK("easeOutBack"),
	EASE_IN_OUT_BACK("easeInOutBack"),
	EASE_IN_BOUNCE("easeInBounce"),
	EASE_OUT_BOUNCE("easeOutBounce"),
	EASE_IN_OUT_BOUNCE("easeInOutBounce");
	
	private String jsonValue;

	private EasingType(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	@Override
	public String getJsonValue() {
		return jsonValue;
	}

}
