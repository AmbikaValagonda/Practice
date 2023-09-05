package com.test;

@FunctionalInterface
interface MyInterface{
	int operate(int a, int b);
}

public class LambdaExpressionExample {

	public static void main(String[] args) {

		MyInterface addition = (a, b) -> (a+b);
		MyInterface subtraction = (a, b) -> (a-b);
		MyInterface multiplication = (a, b) -> (a*b);
		MyInterface division = (a, b) -> (a/b);
		
		System.out.println(addition.operate(20, 10));
		System.out.println(subtraction.operate(20, 10));
		System.out.println(multiplication.operate(20, 10));
		System.out.println(division.operate(20, 10));
		
	}

}
