package com.thekim12.mediator.contract;

import java.util.ArrayList;
import java.util.List;

public abstract class Mediator {
	protected List<Colleague> colleagues;
	
	public Mediator() {
		colleagues = new ArrayList<Colleague>();
	}
	
	public boolean addColleague(Colleague colleague) {
		if(colleagues == null) {
			return false;
		}
		
		colleagues.add(colleague);
		return true;
	}
	
	public abstract void mediate(String data);

}
