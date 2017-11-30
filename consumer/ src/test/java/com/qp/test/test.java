package com.qp.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qp.service.ProviderService;

import javassist.ClassPath;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		System.out.println(11111);
		
		int A=111;
		System.out.println(A);
		
		int y =1111;
		ClassPathXmlApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
		app.start();
	}

}
