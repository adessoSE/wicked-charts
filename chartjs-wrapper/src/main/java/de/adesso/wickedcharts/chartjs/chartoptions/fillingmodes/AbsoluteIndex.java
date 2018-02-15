package de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes;

import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class AbsoluteIndex implements FillingMode {
	private Integer index;

	public AbsoluteIndex(Integer index) {
		super();
		this.index = index;
	}

	@Override
	public Integer getValue() {
		return this.index;
	}

	@Override
	public Class<?> getReturnType() {
		return Integer.class;
	}
	
	
}
