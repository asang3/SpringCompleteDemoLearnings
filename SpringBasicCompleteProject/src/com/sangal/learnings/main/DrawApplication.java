package com.sangal.learnings.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sangal.learnings.beans.Circle;
import com.sangal.learnings.beans.Shape;
import com.sangal.learnings.beans.Triangle;

public class DrawApplication {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
		
		((AbstractApplicationContext) applicationContext).registerShutdownHook();
		/* Destroy methods will only be called if we have registerShutdownHook()
		 * destroy method called after application ends of Triangle bean
		   DisposableBean Destroy method called of Circle
		 * 
		 * 
		 * */
		Shape shape = applicationContext.getBean("circle", Circle.class);
		  //Shape shape=applicationContext.getBean("triangle",Triangle.class);
		 // Shape shape = applicationContext.getBean(Circle.class);
		
		  if (shape instanceof Triangle) {
			System.out.println("inside Triangle if block");
			shape.draw();
		} else if (shape instanceof Circle) {
			System.out.println("inside Circle if block");
			shape.draw();
		} else
			System.out.println("neither it is an instance of Circle nor Triangle");
	}
}
