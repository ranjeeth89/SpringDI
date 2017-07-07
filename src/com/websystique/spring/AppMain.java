package com.websystique.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
	public static void main(String args[]){
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("resources/app-config.xml");

		Communication app = (Communication)context.getBean("communication");
	    app.communicate();
	}
}
