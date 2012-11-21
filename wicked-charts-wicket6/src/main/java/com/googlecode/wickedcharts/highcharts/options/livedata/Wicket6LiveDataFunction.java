package com.googlecode.wickedcharts.highcharts.options.livedata;

import java.text.MessageFormat;

import com.googlecode.wickedcharts.highcharts.options.Function;
import com.googlecode.wickedcharts.highcharts.options.livedata.LiveDataSeries;

/**
 * This javascript function starts a javascript timer to update a
 * {@link LiveDataSeries}.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class Wicket6LiveDataFunction extends Function {

  private static final long serialVersionUID = 1L;

  public Wicket6LiveDataFunction(Wicket6LiveDataAjaxBehavior behavior) {
    String interval = String.valueOf(behavior.getSeries().getUpdateIntervalMs());
    String intervalVarName = behavior.getIntervalJavaScriptVarName();
    String functionBody = "var series = this.series[0];\n";
    functionBody += MessageFormat.format("if(!(typeof {0} === 'undefined'))'{'clearInterval({0});'}'", intervalVarName);
    functionBody += intervalVarName + " = setInterval(function(series){\n";
    functionBody += behavior.getCallbackScript();
    functionBody += "}, " + interval + ");";
    setFunction(functionBody);
  }

}
