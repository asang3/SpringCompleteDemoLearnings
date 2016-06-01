package com.sangal.learnings.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Circle {

	private String name;

	public String getName() {
		return name;
	}
	@Autowired
	@Value(value = "${circle.name}")
	public void setName(String name) {
		this.name = name;
	}
}
