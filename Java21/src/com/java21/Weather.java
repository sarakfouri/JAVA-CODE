package com.java21;

public class Weather {
public static void main (String[] args){
	float fah = 86; 
	System.out.println(fah + "degrees Fahrenheit is ...");
// convert Fahrenheit into celsius
//subtracting 32
fah = fah - 32;
fah = fah / 9;
fah = fah * 5;
System.out.println(fah + "degrees Celsius \n ");
float cel = 33;
//convert celsius into Fahrenheit
cel = cel * 9;
cel = cel /5;
cel = cel +32;
System.out.println(cel +"degrees Fahrenheits");
}
}
