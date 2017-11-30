package com.qp.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qp.service.ProviderService;

import javassist.ClassPath;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		System.out.println(11111);
		
		int y =1111;
		ClassPathXmlApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
		app.start();
		int A=111;
		System.out.println(A);
		
		int y2 =1111;
		ClassPathXmlApplicationContext app1=new ClassPathXmlApplicationContext("applicationContext.xml");
		app1.start();
		
		int y3 =1111;
		ClassPathXmlApplicationContext app11=new ClassPathXmlApplicationContext("applicationContext.xml");
		app11.start();
	}

}
