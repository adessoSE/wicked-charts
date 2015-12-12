/**
 *   Copyright 2012-2013 Wicked Charts (http://wicked-charts.googlecode.com)
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
package com.googlecode.wickedcharts.wicket7;

import org.apache.wicket.ajax.AbstractDefaultAjaxBehavior;
import org.apache.wicket.ajax.attributes.AjaxRequestAttributes;
import org.apache.wicket.request.cycle.RequestCycle;
import org.apache.wicket.request.http.WebRequest;
import org.apache.wicket.util.string.StringValue;

import java.util.HashMap;
import java.util.Map;

/**
 * This AJAX behavior passes the values of a set of defined javascript variables
 * to the server via AJAX.
 *
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 */
public abstract class JavaScriptExpressionSendingAjaxBehavior extends AbstractDefaultAjaxBehavior {

    private final Map<String, String> javascriptExpressions = new HashMap<>();

    /**
     * Reads the value of the given javascript variable from the AJAX request.
     *
     * @param parameterName the parameter name of the javascript expression whose value to
     *                      read. The parameterName must have been specified earlier when
     *                      calling {@link #addJavaScriptValue(String, String)}.
     * @return the string representation of the javascript expression's value
     */
    protected StringValue getVariableValue(String parameterName) {
        RequestCycle cycle = RequestCycle.get();
        WebRequest webRequest = (WebRequest) cycle.getRequest();
        StringValue value = webRequest.getRequestParameters().getParameterValue(parameterName);
        return value;
    }

    @Override
    public CharSequence getCallbackScript() {
        String script = super.getCallbackScript().toString();
        for (Map.Entry<String, String> entry : this.javascriptExpressions.entrySet()) {
            String expression = entry.getValue();
            script = script.replace("\"" + expression + "\"", expression);
        }
        return script;
    }

    /**
     * Adds a javascript expression whose value to be passed from client to
     * server. The result value of this expression is sent to the server via AJAX
     * and can be accessed using the method {@link #getVariableValue(String)}. A
     * javascript variable with the given name must exist within the scope the
     * callback script of this behavior is called on the client side!
     *
     * @param parameterName        the name under which the value of the given javascript expression
     *                             can be accessed later
     * @param javascriptExpression the javascript expression whose value pass from client to server.
     */
    public void addJavaScriptValue(String parameterName, String javascriptExpression) {
        this.javascriptExpressions.put(parameterName, javascriptExpression);
    }

    /**
     * Adds a set of javascript expressions to be passed from client to server.
     *
     * @param parameterMap a map containing the name of a parameter as key and a javascript
     *                     expression as value
     * @see #addJavaScriptValue(String, String)
     */
    public void addJavaScriptValues(Map<String, String> parameterMap) {
        for (Map.Entry<String, String> entry : parameterMap.entrySet()) {
            String parameterName = entry.getKey();
            String parameterValue = entry.getValue();
            this.javascriptExpressions.put(parameterName, parameterValue);
        }
    }

    @Override
    protected void updateAjaxAttributes(AjaxRequestAttributes attributes) {
        super.updateAjaxAttributes(attributes);
        for (Map.Entry<String, String> entry : this.javascriptExpressions.entrySet()) {
            String parameterName = entry.getKey();
            String parameterValue = entry.getValue();
            attributes.getExtraParameters().put(parameterName, parameterValue);
        }
    }

}
