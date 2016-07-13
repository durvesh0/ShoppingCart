package com.niit.shoppingcart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.scan("com.niit.shoppingcart");
		context.refresh();
		
		Category c= (Category) context.getBean("category");
		
		System.out.println("D is created");
		
		c.setId("101");
		c.setName("Sagar");
		System.out.println(c.getId());
		
		
	}

}
