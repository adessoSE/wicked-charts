package de.adesso.wickedcharts.chartjs.chartoptions.valueType;

import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
  * Defines the value type for use in the TimePoint chart
  *
  * @see <a
  *      href="http://www.chartjs.org/docs/latest/axes/cartesian/time.html#input-data">http://www.chartjs.org/docs/latest/axes/cartesian/time.html#input-data</a>
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
