package com.thekim12.staticpattern;

public class MinusCalculator extends Calculator {

	@Override
	public boolean operator(Request request) {
		if (request.getOperator().equals("-")) {
			int a = request.getA();
			int b = request.getB();
			int result = a - b;
			System.out.println(a + " - " + b + " = " + result);
			return true;
		}
		return false;
	}

}
