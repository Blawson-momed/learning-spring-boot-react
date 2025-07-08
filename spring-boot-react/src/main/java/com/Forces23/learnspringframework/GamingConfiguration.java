package com.Forces23.learnspringframework;

import org.springframework.context.annotation.Bean;

import com.Forces23.learnspringframework.game.GameRunner;
import com.Forces23.learnspringframework.game.GamingConsole;
import com.Forces23.learnspringframework.game.PacManGame;

public class GamingConfiguration {
	
	@Bean
	public GamingConsole game() {
		PacManGame game = new PacManGame();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		GameRunner gameRunner = new GameRunner(game);
		return gameRunner;
	}
}
