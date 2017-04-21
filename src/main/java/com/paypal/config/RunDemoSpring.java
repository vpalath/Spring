package com.paypal.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.paypal.entities.Match;

public class RunDemoSpring {
	
	public static void main (String[] args){
		// for java based config file use AnnotationConfig appl context
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Match match1 = ctx.getBean("match",Match.class);
		System.out.println(match1.playMatch());
		
		System.out.println("no of beans " + ctx.getBeanDefinitionCount());
		for (String name : ctx.getBeanDefinitionNames()){
			System.out.println(name);
		}
	}

}
