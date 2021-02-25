package com.job.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {

	public Circle() {

	}

	public Circle(Point center) {
		this.center = center;

	}

	private Point center;

	public Point getCenter() {
		return center;
	}

	@Required
	@Autowired
	@Qualifier("center")
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("I am circle!");
		System.out.println("pointA: x*y = " + (getCenter().getX() * getCenter().getY()));

	}

}
