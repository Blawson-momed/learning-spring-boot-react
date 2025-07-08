package com.Forces23.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component 
public class PacManGame implements GamingConsole {
	
	public void gameTitle() {
		System.out.println("Playing PacMan ... ");
	}

	public void up() {
		System.out.println("up");
	}
	 
	public void down() {
		System.out.println("down");
	}
	
	public void left() {
		System.out.println("left");
	}
	
	public void right() {
		System.out.println("right");
	}
}
