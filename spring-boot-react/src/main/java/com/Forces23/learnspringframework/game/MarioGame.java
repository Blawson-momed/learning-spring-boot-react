package com.Forces23.learnspringframework.game;

public class MarioGame implements GamingConsole{
	
	public void gameTitle() {
		System.out.println("Playing Mario ... ");
	}
	
	public void up() {
		System.out.println("jump");
	}
	 
	public void down() {
		System.out.println("Go into a hole // or Crouch");
	}
	
	public void left() {
		System.out.println("Go back // or to the left of the screen");
	}
	
	public void right() {
		System.out.println("Go to the right of the screen // or accelerate");
	}
	
}
