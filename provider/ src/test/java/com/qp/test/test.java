package com.qp.test;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
		public static void main(String[] args) throws IOException {
			ClassPathXmlApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
			System.out.println(app.getBean("providerService"));
			app.start();
			System.in.read();
		}
}
