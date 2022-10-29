package com.thekim12.staticpattern;

public abstract class Calculator {
	
	private Calculator nextCalculator;
	
	public void setNextCarculator(Calculator nextCalculator) {
		this.nextCalculator = nextCalculator;
	}
	
	public boolean process(Request request) {
		if(operator(request)) {
			return true;
		}else {
			return nextCalculator.process(request);
		}
	}
	
	public abstract boolean operator(Request request);

}
