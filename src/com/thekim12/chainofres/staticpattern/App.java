package com.thekim12.chainofres.staticpattern;

public class App {
	
	public static void main(String[] args) {
		
		Calculator plus  = new PlusCalculator();
		Calculator minus = new MinusCalculator();
		
		plus.setNextCarculator(minus);
		
		Request r1 = new Request(1, 2, "+");
		Request r2 = new Request(5, 2, "-");
		
		plus.process(r1);
		plus.process(r2);
	}

}
