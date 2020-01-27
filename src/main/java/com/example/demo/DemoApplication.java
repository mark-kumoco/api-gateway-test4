package com.example.demo;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

public class DemoApplication {

	public static void main(String[] args)  throws Exception {
		
		CamelContext context = new DefaultCamelContext();
		
		context.addRoutes(new HelloWorldRoute());
		
		context.start();
		
		//SpringApplication.run(DemoApplication.class, args);
	}

}
