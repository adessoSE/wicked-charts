package de.adesso.wickedcharts.chartjs.chartoptions.valueType;

import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
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
