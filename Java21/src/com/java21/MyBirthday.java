package com.java21;

public class MyBirthday {
	 String mybirth = "10/03/1984";
	 String choseDate = "04/29/2016";
	
	public static void main (String[] args){
		
			MyBirthday b = new MyBirthday();
	
		System.out.println("My birthday: " + b.mybirth);
		System.out.println("The day: " + b.mybirth.substring(0,2));
		System.out.println("My month: " + b.mybirth.substring(3, 5));
		System.out.println("My year: " + b.mybirth.substring(6, 10));
		
		// now another date
		System.out.println("Another date!");
		System.out.println("day: " + b.choseDate.substring(0, 2));
		System.out.println("Month: " + b.choseDate.substring(3, 5) );
		System.out.println("Year: " + b.choseDate.substring(6, 10));
	}
}
