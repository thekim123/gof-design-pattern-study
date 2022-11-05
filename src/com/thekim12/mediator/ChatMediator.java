package com.thekim12.mediator;

import com.thekim12.mediator.contract.Colleague;
import com.thekim12.mediator.contract.Mediator;

public class ChatMediator extends Mediator {

	@Override
	public void mediate(String data) {
		for (Colleague c : colleagues) {
			c.handle(data);
		}
	}

}
