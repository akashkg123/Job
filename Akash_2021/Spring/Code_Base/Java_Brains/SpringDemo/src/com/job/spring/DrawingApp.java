package com.job.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	/* private static ApplicationContext context; */
	private static AbstractApplicationContext context;

	public static void main(String[] args) {

		context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
//		Triangle triangle = (Triangle) context.getBean("triangle2");
//		triangle.draw();
//		Circle circle = (Circle) context.getBean("circle");
//		circle.draw();

		Shape shape = (Shape) context.getBean("circle");
		shape.draw();

		/*
		 * Video 5
		 * 
		 * System.out.println("The type of this triangle is : " + triangle.getType());
		 */

		/*
		 * Video 4
		 * 
		 * BeanFactory factory = new XmlBeanFactory(new
		 * FileSystemResource("spring.xml")); Triangle triangle = (Triangle)
		 * factory.getBean("triangle"); triangle.draw();
		 */
	}

}