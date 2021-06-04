package com.obydul.lambda.anony;

public interface FunctionalInterfaceTest {
	void anonymous1();

	default void anonymous2() {
		System.out.println("default function 1");
	}

	default void anonymous3() {
		System.out.println("default function 2");
	}

	static void anonymous4() {
		System.out.println("default function 3");
	}

}
