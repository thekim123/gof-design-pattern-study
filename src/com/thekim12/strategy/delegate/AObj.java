package com.thekim12.strategy.delegate;

import com.thekim12.strategy.interface11.AInterface;
import com.thekim12.strategy.interface11.AInterfaceImpl;

public class AObj {
	
	AInterface aInterface;
	
	public AObj() {
		aInterface = new AInterfaceImpl();
	}
	// �����Ѵ�.
	public void funcAA() {
		System.out.println("AAA");
		System.out.println("AAA");
		
		// ~~~ ����� �������ּ���
		
	}

}
