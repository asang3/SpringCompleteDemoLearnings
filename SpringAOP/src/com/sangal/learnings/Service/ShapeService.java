package com.sangal.learnings.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sangal.learnings.Model.Circle;
import com.sangal.learnings.Model.Triangle;

@Component
public class ShapeService{
	@Autowired
	private Triangle triangle;
	@Autowired
	private Circle circle;

	public Triangle getTriangle() {
		return triangle;
	}

	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}

	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

}
