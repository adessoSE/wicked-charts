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


import de.adesso.wickedcharts.wicket14.JavaScriptResourceRegistry;
import org.apache.wicket.Request;
import org.apache.wicket.Response;
import org.apache.wicket.Session;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.request.target.coding.HybridUrlCodingStrategy;
import org.apache.wicket.request.target.coding.IndexedParamUrlCodingStrategy;
import org.apache.wicket.util.lang.PackageName;
import org.springframework.stereotype.Component;

@Component
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
		mount(new IndexedParamUrlCodingStrategy("/start", Homepage.class));
	}

	@Override
	public Session newSession(final Request request, final Response response) {
		return new ShowcaseSession(request);
	}

}
