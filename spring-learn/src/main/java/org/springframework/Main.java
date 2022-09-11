package org.springframework;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		Object userBean = context.getBean("userBean");
		System.out.println(userBean);
	}
}
