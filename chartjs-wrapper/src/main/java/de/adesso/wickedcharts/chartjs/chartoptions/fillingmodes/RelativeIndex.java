package de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes;

import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class RelativeIndex implements FillingMode {
	
	private String index;

	public RelativeIndex(String index) {
		super();
		this.index = index;
	}

	@Override
	public Object getValue() {
		return index;
	}

	@Override
	public Class<?> getReturnType() {
		return String.class;
	}
	
	

}
