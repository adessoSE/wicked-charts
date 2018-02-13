package de.adesso.wickedcharts.chartjs.chartoptions;

import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
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
