package com.googlecode.wickedcharts.showcase;

import org.apache.wicket.Session;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.request.Request;
import org.apache.wicket.request.Response;

import com.googlecode.wickedcharts.JavaScriptResourceRegistry;

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
