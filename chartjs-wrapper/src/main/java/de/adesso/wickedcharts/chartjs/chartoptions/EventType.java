package de.adesso.wickedcharts.chartjs.chartoptions;

import de.adesso.wickedcharts.chartjs.json.JsonValueEnum;

/**
 * Defines the different event types.
 *
 * @see <a href="http://www.chartjs.org/docs/latest/general/interactions/events.html">http://www.chartjs.org/docs/latest/general/interactions/events.html</a>
 *
 * @author anedomansky
 * @author maximAtanasov
 */
public enum EventType implements JsonValueEnum{
	MOUSEMOVE("mousemove"),
	MOUSEOUT("mouseout"),
	CLICK("click"),
	TOUCHSTART("touchstart"),
	TOUCHMOVE("touchmove"),
	TOUCHEND("touchend");
	
	private String jsonValue;

	private EventType(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	@Override
	public String getJsonValue() {
		return jsonValue;
	}

}
