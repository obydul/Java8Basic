package com.obydul.lambda.anony;

public class AnonymouseFunTest {	
	public void an1() {
		System.out.println("Tradition process");
	}
	
//	() -> {
//		System.out.println("Lambda function");
//	}
//
	public static void main(String[] args) {
		new AnonymouseFunTest().an1();
	}
}
