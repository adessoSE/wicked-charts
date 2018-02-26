package de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes;

public enum LocationFillingMode implements FillingModeLine {
	ZERO("zero"),
	TOP("top"),
	BOTTOM("bottom");
	
	private String value;
	
	private LocationFillingMode(String value) {
		this.value = value;
	}
	
	@Override
	public String getValue() {
		return value;
	}

	@Override
	public Class<?> getReturnType() {
		return String.class;
	}
	
}
