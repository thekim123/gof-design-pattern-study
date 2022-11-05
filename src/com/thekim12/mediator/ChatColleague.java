package com.thekim12.mediator;

import com.thekim12.mediator.contract.Colleague;

public class ChatColleague extends Colleague {

	@Override
	public void handle(String data) {
		System.out.println(this + " : "+data);
	}

}
