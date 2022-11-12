package com.thekim12.strategy.strategy;

public class Gun implements Weapon {
	
	@Override
	public void 공격하기() {
		System.out.println("탕탕 - 총공격");
	}

}
