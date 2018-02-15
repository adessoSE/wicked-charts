package de.adesso.wickedcharts.chartjs.chartoptions;

import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class JavaScriptReference {
	private final String ref;

	public JavaScriptReference(final String ref) {
		super();
		this.ref = ref;
	}
	
	
}
