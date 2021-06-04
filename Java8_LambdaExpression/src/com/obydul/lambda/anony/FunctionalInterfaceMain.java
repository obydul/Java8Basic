package com.obydul.lambda.anony;

interface test {
	void cal();
}

public class FunctionalInterfaceMain {

	public static void main(String[] args) {
		test test = () -> System.out.println("Cal start");
		test.cal();
	}

}
