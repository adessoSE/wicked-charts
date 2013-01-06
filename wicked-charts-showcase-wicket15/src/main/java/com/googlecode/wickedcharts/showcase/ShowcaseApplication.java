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
package com.googlecode.wickedcharts.showcase;

import org.apache.wicket.Session;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.request.Request;
import org.apache.wicket.request.Response;

import com.googlecode.wickedcharts.wicket15.JavaScriptResourceRegistry;

/**
 * Application object for your web application. If you want to run this
 * application without deploying, run the Start class.
 * 
 * @see com.googlecode.wickedcharts.showcase.Start#main(String[])
 */
public class ShowcaseApplication extends WebApplication {
	/**
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	@Override
	public Class<Homepage> getHomePage() {
		return Homepage.class;
	}

	/**
	 * @see org.apache.wicket.Application#init()
	 */
	@Override
	public void init() {
		super
		    .init();
		JavaScriptResourceRegistry
		    .getInstance()
		    .setJQueryReference("js/jquery-1.8.1.min.js");

		mountPage("/start", Homepage.class);
		mountPage("/start/${theme}", Homepage.class);
	}

	@Override
	public Session newSession(final Request request, final Response response) {
		return new ShowcaseSession(request);
	}

}
