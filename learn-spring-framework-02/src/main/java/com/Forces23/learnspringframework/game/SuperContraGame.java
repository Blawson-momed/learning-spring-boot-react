package com.Forces23.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContraGame implements GamingConsole{
	
	public void gameTitle() {
		System.out.println("Playing Super Contra ... ");
	}

	public void up() {
		System.out.println("up");
	}
	 
	public void down() {
		System.out.println("Crouch");
	}
	
	public void left() {
		System.out.println("Go back // or to the left of the screen");
	}
	
	public void right() {
		System.out.println("shoot a bullet");
	}
	
}
