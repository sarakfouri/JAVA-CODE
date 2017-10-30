
package com.java21;

public class Exer2 {
	double num1;
	double num2;
	double division;
	double remainder;
	
	public static void main (String args[]){
		Exer2 ex2 = new Exer2();
		ex2.num1 = 45.00;
		ex2.num2 = 34.00;
		ex2.division = ex2.num1 / ex2.num2;
		ex2.remainder = ex2.num1 % ex2.num2;
		System.out.println(ex2.num1 + " divided by: " + ex2.num2 );
		System.out.println("\n the result is: " + ex2.division + "\t the remander is: " + ex2.remainder  );

	}
}