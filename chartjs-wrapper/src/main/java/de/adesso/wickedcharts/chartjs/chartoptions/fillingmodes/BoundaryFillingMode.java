package de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes;

/**
  * Defines the additional filling modes as Strings.
  *
  * @see <a
  *      href="http://www.chartjs.org/docs/latest/charts/area.html">http://www.chartjs.org/docs/latest/charts/area.html</a>
  *
  */
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
