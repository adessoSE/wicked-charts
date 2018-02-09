package com.googlecode.wickedcharts.chartjs.chartoptions;

public class PointData extends Number{

	private String x;
	private Integer y;
	
	public PointData(String x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String getX() {
		return x;
	}
	public void setX(String x) {
		this.x = x;
	}
	public Integer getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public String toString() {
		return new String("{x: \"" + x + "\" , " + " y: " + y + " }");
	}
	
	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return 0;
	}
}
