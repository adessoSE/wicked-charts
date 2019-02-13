/**
 *   Copyright 2012-2019 Wicked Charts (http://github.com/adessoAG/wicked-charts)
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package de.adesso.wickedcharts.wicket6.highcharts.features.livedata;

import de.adesso.wickedcharts.highcharts.options.Function;
import de.adesso.wickedcharts.highcharts.options.Options;
import de.adesso.wickedcharts.highcharts.options.livedata.LiveDataSeries;
import de.adesso.wickedcharts.highcharts.options.util.OptionsUtil;

import java.text.MessageFormat;

/**
 * This javascript function starts a javascript timer to update a
 * {@link LiveDataSeries}.
 *
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 */
public class LiveDataFunction extends Function {

    private static final long serialVersionUID = 1L;

    private String createJavascript(final Options options, final LiveDataAjaxBehavior behavior) {
        int seriesIndex = OptionsUtil.getSeriesIndex(options, behavior.getSeries().getWickedChartsId());
        String interval = String.valueOf(behavior.getSeries().getUpdateIntervalMs());
        String intervalVarName = behavior.getIntervalJavaScriptVarName();
        String functionBody = "var series = this.series[" + seriesIndex + "];\n";
        functionBody += MessageFormat.format("if(!(typeof {0} === \"undefined\"))'{'clearInterval({0});'}'",
                intervalVarName);
        functionBody += intervalVarName + " = setInterval(function(series){\n";
        functionBody += behavior.getCallbackScript();
        functionBody += "}, " + interval + ");";
        return functionBody;
    }

    public void addLiveDataSeries(final Options options, final LiveDataAjaxBehavior behavior) {
        String javascript = createJavascript(options, behavior);
        setFunction(getBody() + "\n\n" + javascript);
    }

}
