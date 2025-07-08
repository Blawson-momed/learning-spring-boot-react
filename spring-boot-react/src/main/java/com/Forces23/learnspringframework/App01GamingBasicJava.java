package com.Forces23.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Forces23.learnspringframework.game.GameRunner;
import com.Forces23.learnspringframework.game.GamingConsole;
import com.Forces23.learnspringframework.game.MarioGame;
import com.Forces23.learnspringframework.game.PacManGame;
import com.Forces23.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = null;
		try {
			context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
			//context.getBean(GamingConsole.class).up();
			//System.out.println(context.getBeanDefinitionNames());
			context.getBean(GameRunner.class).run();

		}finally {
			if(context != null) {
				context.close();
			}
		}
	}

}
