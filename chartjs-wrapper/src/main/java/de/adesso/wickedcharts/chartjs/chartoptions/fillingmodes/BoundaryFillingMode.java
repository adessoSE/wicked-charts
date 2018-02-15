package de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes;

public enum BoundaryFillingMode implements FillingMode {
	START("start"),
	END("end"),
	ORIGIN("origin"),
	UNDEFINED("undefined");
	
	private String value;
	
	private BoundaryFillingMode(String value) {
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
