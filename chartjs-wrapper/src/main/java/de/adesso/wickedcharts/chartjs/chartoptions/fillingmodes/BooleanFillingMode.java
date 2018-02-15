package de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes;

public enum BooleanFillingMode implements FillingMode {
	FALSE(false)
//	,TRUE(true)
	;

	private Boolean value;
	
	private BooleanFillingMode(Boolean value) {
		this.value = value;
	}
	
	@Override
	public Boolean getValue() {
		return value;
	}

	@Override
	public Class<?> getReturnType() {
		return Boolean.class;
	}

}
