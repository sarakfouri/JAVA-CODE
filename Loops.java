package com.java21;

public class Loops {
	public static void main (String args[]){
	int  number = 4;

do {

	System.out.println(number--);
	
}while (number == 0);


// always executed once before the test condition!! 
long i = 1;
do {
	i *= 2;
	System.out.println(i + " ");
}while (i < 3_000_00_0L);

out: for (int n = 0; n <10; n++){
	for (int j =0; j < 50; j++ ) {
		if( n * j > 400){
			System.out.println(n + " " + j);
			break out;
		}
	}
}

float x = 9;
float y = 5;
int z = (int) ( x / y); 
switch (z){
case 1:
	x = x + 2;
case 2: 
	x = x + 3;
	default: 
		x = x + 1;
	} 
	System.out.println("value of x " + x);
	}



}