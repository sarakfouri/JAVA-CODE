package com.java21;

public class EqualsTester {
	String s1;
	String s2;
public static void main (String[]  args){
	EqualsTester et = new EqualsTester();
	et.s1 = "Free the bound periodicals.";
	et.s2 = et.s1;
	System.out.println("String 1: "+ et.s1);
	System.out.println("String 2: " + et.s2);
	System.out.println("Is the same object ? " + (et.s1==et.s2));
	
	et.s2 = new String(et.s1);
	System.out.println("String 1: "+ et.s1);
	System.out.println("String 2: " + et.s2);
	System.out.println("Is the same object ? " + (et.s1==et.s2));
}
}
