package com.sangal.learnings;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sangal.learnings.Service.ShapeService;

public class AppMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
		ShapeService service = applicationContext.getBean("shapeService", ShapeService.class);

		System.out.println("Triangle service called:: " + service.getTriangle().getName());
		System.out.println("*************************");
		System.out.println("Circle service called:: " + service.getCircle().getName());

	}
}
