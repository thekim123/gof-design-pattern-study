package com.thekim12.strategy.strategy;

public class GameCharacter {
	
	private Weapon weapon;
	
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void attack() {
		
		if(weapon == null) {
			System.out.println("�ָ���");
			return;
		}
		
		// ����
		weapon.�����ϱ�();
	}
	

}
