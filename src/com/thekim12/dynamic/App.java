package com.thekim12.dynamic;

public class App {

	public static void main(String[] args) {
		Attack attack = new Attack(100);
		Armor armor1  = new Armor(10);
		Armor armor2 = new Armor(15);
		
		armor1.setNextDefence(armor2);
		armor1.defence(attack);
		System.out.println(attack.getAmount());
		
		
		// µ¿Àû
		
		Defence shield = new Defence() {
			
			@Override
			public void defence(Attack attack) {
				int amount = attack.getAmount();
				attack.setAmount(amount-=50);
			}
		};
		
		armor2.setNextDefence(shield);
		attack.setAmount(100);
		armor1.defence(attack);
		System.out.println(attack.getAmount());
	}
}
