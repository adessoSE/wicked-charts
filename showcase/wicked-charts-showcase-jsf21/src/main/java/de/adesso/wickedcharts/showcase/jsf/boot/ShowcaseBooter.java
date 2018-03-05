package de.adesso.wickedcharts.showcase.jsf.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.boot.autoconfigure.web.MultipartAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

// excluding configurations since they are not compatible with libraries within the application
@EnableAutoConfiguration(exclude = {JacksonAutoConfiguration.class, MultipartAutoConfiguration.class})
@EntityScan("de.adesso.wickedcharts.showcase")
@ComponentScan("de.adesso.wickedcharts.showcase")
public class ShowcaseBooter {
	
    public static void main(String[] args) {
        SpringApplication.run(ShowcaseBooter.class, args);
    }

}