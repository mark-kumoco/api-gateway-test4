package com.example.demo;

import org.apache.camel.builder.RouteBuilder;

public class HelloWorldRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		System.out.println("Hellow oopla");
	}

}
