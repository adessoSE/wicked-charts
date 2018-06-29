package de.adesso.wickedcharts.showcase.boot;

import org.apache.wicket.protocol.http.WicketFilter;
import org.apache.wicket.spring.SpringWebApplicationFactory;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Configuration;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@Configuration
public class WebInitializer implements ServletContextInitializer {

    @Override
    public void onStartup(ServletContext sc) throws ServletException {
        FilterRegistration filter = sc.addFilter("wicket-filter",
                WicketFilter.class);
        filter.setInitParameter(WicketFilter.APP_FACT_PARAM,
                SpringWebApplicationFactory.class.getName());
        filter.setInitParameter("applicationBean", "showcaseApplication");
        filter.setInitParameter(WicketFilter.FILTER_MAPPING_PARAM, "/*");
        filter.addMappingForUrlPatterns(null, false, "/*");
    }

}
