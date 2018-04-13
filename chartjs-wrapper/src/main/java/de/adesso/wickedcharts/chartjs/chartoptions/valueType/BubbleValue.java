package de.adesso.wickedcharts.chartjs.chartoptions.valueType;

import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * Defines the value type for use in the bubble chart (x and y coordinates and a radius for the bubbles)
 * Using this class you can create BubbleValues from any other ValueType or primitive types like Double and Integer.
 *
 * @see <a href="http://www.chartjs.org/docs/latest/charts/bubble.html#data-structure">http://www.chartjs.org/docs/latest/charts/bubble.html#data-structure</a>
 * @author SvenWirz
 */
@Accessors(chain = true)
@lombok.Data
@EqualsAndHashCode(callSuper=false)
public class BubbleValue extends ValueType {
	
	private ValueType x;
	private ValueType y;
	private ValueType r;
	
	public BubbleValue() {
		
	}
	
	public BubbleValue(ValueType x, ValueType y, ValueType r) {
		super();
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public BubbleValue(Integer x, Integer y, Integer r) {
		this.x = new IntegerValue(x);
		this.y = new IntegerValue(y);
		this.r = new IntegerValue(r);
	}

	public BubbleValue(Double x, Double y, Double r) {
		this.x = new DoubleValue(x);
		this.y = new DoubleValue(y);
		this.r = new DoubleValue(r);
	}
	
}
