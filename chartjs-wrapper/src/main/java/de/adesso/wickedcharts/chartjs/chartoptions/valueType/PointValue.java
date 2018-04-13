package de.adesso.wickedcharts.chartjs.chartoptions.valueType;

import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * Defines a ValueType to represent the x and y coordinates in, for example, a scatter chart.
 * X and y can be any other ValueType or primitive types (Integer, Double).
 *
 * @see <a href="http://www.chartjs.org/docs/latest/axes/cartesian/time.html#input-data">http://www.chartjs.org/docs/latest/axes/cartesian/time.html#input-data</a>
 * @author SvenWirz
 */
@Accessors(chain = true)
@lombok.Data
@EqualsAndHashCode(callSuper = false)
public class PointValue extends ValueType {
	
	private ValueType x;
	private ValueType y;
	
	public PointValue() {
		
	}
	
	public PointValue(ValueType x, ValueType y) {
		super();
		this.x = x;
		this.y = y;
	}

	public PointValue(Integer x, Integer y) {
		this.x = new IntegerValue(x);
		this.y = new IntegerValue(y);
	}

	public PointValue(Double x, Double y) {
		this.x = new DoubleValue(x);
		this.y = new DoubleValue(y);
	}
	
}
