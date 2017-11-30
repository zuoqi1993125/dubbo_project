package com.qp.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qp.service.ProviderService;

import javassist.ClassPath;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
		app.start();
		ProviderService provider=(ProviderService) app.getBean("providerService");
		System.out.println(provider.getName());
		
	}

}
