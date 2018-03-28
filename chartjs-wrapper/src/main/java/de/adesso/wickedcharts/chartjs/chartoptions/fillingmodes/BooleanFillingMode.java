package de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes;

/**
  * Defines the filling mode as a Boolean.
  *
  * @see <a
  *      href="http://www.chartjs.org/docs/latest/charts/area.html">http://www.chartjs.org/docs/latest/charts/area.html</a>
  *
  */
public enum BooleanFillingMode implements FillingMode, FillingModeLine {
	FALSE(false),
	TRUE(true)
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
