package com.Forces23.learnspringframework;

import com.Forces23.learnspringframework.game.GameRunner;
import com.Forces23.learnspringframework.game.MarioGame;
import com.Forces23.learnspringframework.game.PacManGame;
import com.Forces23.learnspringframework.game.SuperContraGame;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		
		//uncomment the game object you would run 
		//MarioGame game = new MarioGame(); // 1: Object Creation 
		//SuperContraGame game = new SuperContraGame();
		PacManGame game = new PacManGame();
		
		GameRunner gameRunner = new GameRunner(game);
			//2: Object Creation + Wiring of Dependencies
			// Game is a Dependency of the GameRunner 
		
		gameRunner.run();
	}

}
