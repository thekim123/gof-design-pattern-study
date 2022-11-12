package com.thekim12.strategy.strategy;

public class GameCharacter {
	
	private Weapon weapon;
	
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void 공격() {
		
		if(weapon == null) {
			System.out.println("주먹질");
			return;
		}
		
		// 위임
		weapon.공격하기();
	}
	

}
