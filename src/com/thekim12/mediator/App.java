package com.thekim12.mediator;

import com.thekim12.mediator.contract.Colleague;
import com.thekim12.mediator.contract.Mediator;

public class App {
	public static void main(String[] args) {
		Mediator mediator = new ChatMediator();

		Colleague colleague1 = new ChatColleague();
		Colleague colleague2 = new ChatColleague();
		Colleague colleague3 = new ChatColleague();

		colleague1.join(mediator);
		colleague2.join(mediator);
		colleague3.join(mediator);

		colleague1.sendData("하위~~");
		colleague2.sendData("넌 누구니?");
		colleague3.sendData("나가!!");
	}
}
