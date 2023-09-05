package com.test;

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SampleAbstarctClass s = new SampleAbstarctClass();
		B s = new B();
		s.getNumber();
		s.getString();

	}

}


abstract class SampleAbstarctClass{
	abstract void getNumber();
	
	void getString() {
		System.out.println("Hello");
	}
	
}

class B extends SampleAbstarctClass{

	@Override
	void getNumber() {
		// TODO Auto-generated method stub
		System.out.println(1);
		
	}
	
}
