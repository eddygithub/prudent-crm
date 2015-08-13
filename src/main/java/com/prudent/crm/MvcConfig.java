package com.prudent.crm;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebMvc
@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/js/**", "/css/**", "/img/**")
		.addResourceLocations("classpath:/static/css/")
		.addResourceLocations("classpath:/static/img/")
		.addResourceLocations("classpath:/static/node_modules/")
		.addResourceLocations("classpath:/static/node_modules/bootstrap/dist/css/")
		.addResourceLocations("classpath:/static/node_modules/bootstrap/dist/js/")
		.addResourceLocations("classpath:/static/node_modules/jquery/dist/");
	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/login").setViewName("login");
		registry.addViewController("/customer/search").setViewName("customer/search");
		registry.addViewController("/customer/new").setViewName("customer/new");
	}
}
