package com.sangal.learnings.beans;

import javax.annotation.Resource;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape, InitializingBean, DisposableBean {
	/*
	 * InitializingBean and DisposableBean are postProcessors. We can also
	 * initialize the same with manual functions.
	 * 
	 * 
	 */
	private Point center;
	@Autowired
	private MessageSource messageSource;

	@Autowired
	public Circle(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("Circle Drawn");
		System.out.println("Center :" + getCenter().getX() + "," + getCenter().getY());
		System.out.println("*************Testing message source***************");
		System.out.println(this.messageSource.getMessage("greeting", null, "Default Message", null));
		System.out.println(
				this.messageSource.getMessage("drawing.circle", new Object[] { center.getX(), center.getY() }, null));
		// Internationalization can also be done by passing EN or GB accordingly
		// spring will call myMessages_EN.properties
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean Destroy method called of Circle");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean afterPropertiesSet method called of Circle");

	}

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
}
