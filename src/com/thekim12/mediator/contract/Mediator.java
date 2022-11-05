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
		
		// 중재자에 추가
		colleagues.add(colleague);
		return true;
	}
	
	// 중재 매소드를 추상화해 놓음
	public abstract void mediate(String data);

}
