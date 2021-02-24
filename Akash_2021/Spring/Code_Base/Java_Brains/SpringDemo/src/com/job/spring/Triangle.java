package com.job.spring;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

public class Triangle implements InitializingBean, BeanNameAware, DisposableBean, Shape {

	// Video 8
	@Autowired
	private Point pointA;
	@Autowired
	private Point pointB;
	@Autowired
	private Point pointC;

	private String beanName;

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

	@Override
	public void draw() {
		System.out.println("Triangle drawn!!");
		System.out.println("pointA: x*y = " + (getPointA().getX() * getPointA().getY()));
		System.out.println("pointB: x+y = " + (getPointB().getX() + getPointB().getY()));
		// System.out.println("pointC: x-y = " + (getPointC().getX() -
		// getPointC().getY()));
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// System.out.println("SPRING Interface Created Bean:- " + getBeanName());
	}

	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public String getBeanName() {
		return beanName;
	}

	@Override
	public void destroy() throws Exception {
		// System.out.println("SPRING Interface Destroyed Bean :- " + getBeanName());

	}

	public void init() throws Exception {
		// System.out.println("XML Created Bean");
	}

	public void cleanUp() throws Exception {
		// System.out.println("XML Destroyed Bean");
	}

	/*
	 * List<Point> points;
	 * 
	 * public List<Point> getPoints() { return points; }
	 * 
	 * public void setPoints(List<Point> points) { this.points = points; }
	 * 
	 * public void draw() { System.out.println("Triangle drawn!!"); for (Point point
	 * : points) { System.out.println("X+Y= " + (point.getX() + point.getY())); } }
	 */

	/*
	 * 
	 * public Triangle(String type) { super(); this.type = type; }
	 * 
	 * public Triangle(String type, int height) { super(); this.type = type;
	 * this.height = height; }
	 * 
	 * private String type; private int height;
	 * 
	 * public String getType() { return type; }
	 * 
	 * public void setType(String type) { this.type = type; }
	 * 
	 * public int getHeight() { return height; }
	 * 
	 * public void setHeight(int height) { this.height = height; }
	 * 
	 *
	 * }
	 */

}