package com.java;

public class ReturnKeyword {

	  static int a;//0
	  
	  public static int demo() {

		  a = 25;
		  return a;
		  
		//  a = 40; we can't change the variable value after return to the method
	}
	  
	  public static void main(String[] args) {
		
		  demo();
	}
}
