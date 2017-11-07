package com.java21;

public class StringChecker {
public static void main (String[] args){
	String str = "A Lannister always pays his debts";
    System.out.println("The string is: " + str);
    System.out.println("Length of this string: " + str.length());
    System.out.println("The caracter at position 6: " + str.charAt(6));
    System.out.println("The subString from 12 to 18: " + str.substring(12, 18));
    System.out.println("Index of the first  't': " + str.indexOf('t'));
    System.out.println("Index of the biginner of the " + "subtring \"debts\" : " + str.indexOf("debts"));
    System.out.println("The string in uppercase: " + str.toUpperCase());
}
}
