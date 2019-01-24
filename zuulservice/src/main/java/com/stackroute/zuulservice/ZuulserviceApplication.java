package com.stackroute.zuulservice;

import com.stackroute.zuulservice.filter.ErrorFilter;
import com.stackroute.zuulservice.filter.PostFilter;
import com.stackroute.zuulservice.filter.PreFilter;
import com.stackroute.zuulservice.filter.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
<<<<<<< HEAD
public class ZuulserviceApplication
{
=======
@EnableEurekaClient
public class ZuulserviceApplication {
>>>>>>> a54c5fde124d1acd189a55f44766b10f5c4f0aaa

	public static void main(String[] args)

	{
		SpringApplication.run(ZuulserviceApplication.class, args);
	}
	@Bean
	public PreFilter preFilter()
	{
		return new PreFilter();
	}
	@Bean
	public PostFilter postFilter()
	{
		return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter()
	{
		return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter()
	{
		return new RouteFilter();
	}
}



