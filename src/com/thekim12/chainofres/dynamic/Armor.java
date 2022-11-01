package com.thekim12.chainofres.dynamic;

public class Armor implements Defence {
	
	private Defence nextDefence;
	private int def;
	
	@Override
	public void defence(Attack attack) {
		
		process(attack);
		
		if(nextDefence!=null) {
			nextDefence.defence(attack);
		}

	}
	
	private void process(Attack attack) {
		int amount = attack.getAmount();
		amount -= def;
		attack.setAmount(amount);	
	}

	public Armor() {
		// TODO Auto-generated constructor stub
	}
	
	public Armor(int def) {
		this.def = def;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public void setNextDefence(Defence nexDefence) {
		this.nextDefence = nexDefence;
	}
}
