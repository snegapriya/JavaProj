package com.sample;

public class Return_Ex {

	static int a;//0

	public static int demo() {

		a = 30;
		return a;

	//	a = 50; we can't change the variable value after return to the method
	}

	public static void main(String[] args) {

		demo();
	}
}
