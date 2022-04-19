package com.touwenzi_l.config;

import com.touwenzi_l.web.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebSystemConfig{
	//注册servlet
	@Bean
	public ServletRegistrationBean servletRegistrationBean(){
		MyServlet myServlet = new MyServlet();
		ServletRegistrationBean reg = new ServletRegistrationBean(myServlet,"/myservlet");
		return reg;
	}
	
	//注册filter
	@Bean
	public FilterRegistrationBean filterRegistrationBean(){
		FilterRegistrationBean reg = new FilterRegistrationBean();
		CharacterEncodingFilter filter=new CharacterEncodingFilter();
		filter.setEncoding("utf-8");
		filter.setForceEncoding(true);
		reg.setFilter(filter);
		reg.addUrlPatterns("/*");
		return reg;
	}
}
