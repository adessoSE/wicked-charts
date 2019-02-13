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
package de.adesso.wickedcharts.highcharts.options.functions;

import de.adesso.wickedcharts.highcharts.options.Function;

/**
 * JavaScript function to use for events that redirects the user to a given URL.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class RedirectFunction extends Function {

  private static final long serialVersionUID = 1L;

  /**
   * Constructor.
   * 
   * @param url
   *          the URL to redirect to when the function is called.
   */
  public RedirectFunction(String url) {
    setFunction("window.location=\"" + url + "\";");
  }

}
