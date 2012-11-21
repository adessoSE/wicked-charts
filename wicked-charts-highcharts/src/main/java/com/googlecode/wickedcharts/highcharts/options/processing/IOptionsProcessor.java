package com.googlecode.wickedcharts.highcharts.options.processing;

import com.googlecode.wickedcharts.highcharts.options.Options;

/**
 * Interface for processing {@link Options} before they are renderer.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public interface IOptionsProcessor {

	/**
	 * Processes the given {@link Options}. This method gives the opportunity to
	 * modify an {@link Options} object before it is rendered as JSON. </p>
	 * Example usage of this interface:
	 * <ol>
	 * <li>When adding a certain configuration option to your {@link Options}
	 * object, that object calls
	 * {@link Options#markForProcessing(com.googlecode.wickedcharts.highcharts.options.IProcessableOption)}
	 * to mark itself for later processing by an {@link IOptionsProcessor}.</li>
	 * <li>An {@link IOptionsProcessor} calls
	 * {@link Options#getMarkedForProcessing(String)} to get a list of all option
	 * objects marked this way.</li>
	 * <li>The {@link IOptionsProcessor} modifies the {@link Options} object based
	 * on the information it gets from the marked objects.</li>
	 * </ol>
	 * <p/>
	 * This class is not part of the public API!
	 * 
	 * @param options
	 *          the {@link Options} to process or modify.
	 * @param context
	 *          the context containing some context variables that may be accessed
	 *          and changed by the processor.
	 */
	void processOptions(Options options, OptionsProcessorContext context);

}
