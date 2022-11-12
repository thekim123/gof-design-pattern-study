package com.thekim12.strategy.strategy;

public class App {
	
	public static void main(String[] args) {
		GameCharacter character = new GameCharacter();
		character.공격();
		
		character.setWeapon(new Knife());
		character.공격();
		
		character.setWeapon(new Gun());
		character.공격();
	}

}
