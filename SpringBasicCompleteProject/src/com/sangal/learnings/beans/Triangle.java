package com.sangal.learnings.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Triangle implements Shape{

	private Point pointA;
	private Point pointB;
	private Point pointC;
	private List<Point> list;
	
	@Override
	public void draw() {	
		System.out.println("Trianlge drawn");
		System.out.println("Point A: "+getPointA().getX()+","+getPointA().getY());
		System.out.println("Point B: "+getPointB().getX()+","+getPointB().getY());
		System.out.println("Point C: "+getPointC().getX()+","+getPointC().getY());
		System.out.println("Printing above using Collections : here using list");
		for(Point p:list){
			System.out.println("Point A: "+p.getX()+","+p.getY());
		}
	}

	public void initMethod(){
		System.out.println("Init method called before initialization of beans of Triangle");
	}
	public void destroyMethod(){
		System.out.println("destroy method called after application ends of Triangle bean");
	}
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public List<Point> getList() {
		return list;
	}
	@Autowired
	public void setList(List<Point> list) {
		this.list = list;
	}


}
