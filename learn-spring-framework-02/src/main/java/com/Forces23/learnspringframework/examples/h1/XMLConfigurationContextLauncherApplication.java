package com.Forces23.learnspringframework.examples.h1;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Forces23.learnspringframework.game.GameRunner;

public class XMLConfigurationContextLauncherApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = null;
		
		try {
			context = new ClassPathXmlApplicationContext("contextConfiguration.xml");
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			
			context.getBean(GameRunner.class).run();
			
			
		}finally {
			if(context != null) {
				context.close();
			}
		}
	}

}
