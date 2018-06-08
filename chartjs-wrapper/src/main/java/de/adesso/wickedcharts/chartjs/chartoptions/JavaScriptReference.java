package de.adesso.wickedcharts.chartjs.chartoptions;

import lombok.experimental.Accessors;

import java.io.Serializable;

@Accessors(chain = true)
@lombok.Data
public class JavaScriptReference implements Serializable{
	private static final long serialVersionUID = 1L;
	private final String ref;

	public JavaScriptReference(final String ref) {
		super();
		this.ref = ref;
	}
	
	
}
