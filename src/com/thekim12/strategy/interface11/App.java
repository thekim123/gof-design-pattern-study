package com.thekim12.strategy.interface11;

import com.thekim12.strategy.delegate.AObj;

public class App {
	
	public static void main(String[] args) {
		AInterface aInterface = new AInterfaceImpl();
		
		// ����� ��� ���
		aInterface.funcA();
		
		System.out.println("---------");
		
		AObj aobj = new AObj();
		aobj.funcAA();
	}

}
