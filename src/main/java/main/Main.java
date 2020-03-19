package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.expression.BeanFactoryAccessor;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import config.MyBeanConfig;
import service.UserService;

public class Main {
	
	public static void main(String[] args) {
	
		UserService.unosUser();
		UserService.unosUser();
		UserService.prikazUser();
		
	}

}
