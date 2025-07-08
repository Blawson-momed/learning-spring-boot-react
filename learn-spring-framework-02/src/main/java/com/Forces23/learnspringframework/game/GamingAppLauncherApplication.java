package com.Forces23.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.Forces23.learnspringframework.game")
public class GamingAppLauncherApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = null;
		
		try {
			context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class);
			
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}finally {
			if(context != null) {
				context.close();
			}
		}
	}

}
