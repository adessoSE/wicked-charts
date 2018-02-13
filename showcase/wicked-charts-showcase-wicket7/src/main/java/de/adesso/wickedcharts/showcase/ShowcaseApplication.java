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
package de.adesso.wickedcharts.showcase;

import de.adesso.wickedcharts.wicket7.JavaScriptResourceRegistry;

import de.adesso.wickedcharts.showcase.ie.SimplePage;
import de.adesso.wickedcharts.showcase.modalwindow.ModalWindowPage;

import org.apache.wicket.Session;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.request.Request;
import org.apache.wicket.request.Response;
import org.apache.wicket.request.resource.JavaScriptResourceReference;

/**
 * Application object for your web application. If you want to run this
 * application without deploying, run the Start class.
 * 
 * @see de.adesso.wickedcharts.showcase.Start#main(String[])
 */

public class ShowcaseApplication extends WebApplication {
	/**
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	@Override
	public Class<? extends WebPage> getHomePage() {
		return HomepageChartJs.class;
	}

	/**
	 * @see org.apache.wicket.Application#init()
	 */
	@Override
	public void init() {
		super.init();
		JavaScriptResourceRegistry.getInstance().setJQueryReference(
				new JavaScriptResourceReference(ShowcaseApplication.class,
						"jquery-1.8.3.min-IEfix.js"));

		mountPage("/start/chartjs", HomepageChartJs.class);
		mountPage("/start/highcharts", HomepageHighcharts.class);
		mountPage("/start/highcharts/${theme}", HomepageHighcharts.class);
		mountPage("/simple", SimplePage.class);
		mountPage("/modal", ModalWindowPage.class);

		getJavaScriptLibrarySettings().setJQueryReference(
				new JavaScriptResourceReference(ShowcaseApplication.class,
						"jquery-1.8.3.min-IEfix.js"));
	}

	@Override
	public Session newSession(final Request request, final Response response) {
		return new ShowcaseSession(request);
	}

}
