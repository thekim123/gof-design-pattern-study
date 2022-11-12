package com.thekim12.strategy.strategy;

public class App {
	
	public static void main(String[] args) {
		GameCharacter character = new GameCharacter();
		character.attack();
		
		character.setWeapon(new Knife());
		character.attack();
		
		character.setWeapon(new Gun());
		character.attack();
	}

}
