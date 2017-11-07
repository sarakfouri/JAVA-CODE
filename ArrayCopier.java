package com.java21;


public class ArrayCopier {
public static void main (String args[] ){

	int[] arrayOne = {7,4,8,1,4,1,4};
	float[] arrayTwo = new float[arrayOne.length];
	 
	System.out.print("arrayOne: [" );
	for (int i = 0; i <arrayOne.length; i ++){
		System.out.print(arrayOne[i] + " ");
	}
	System.out.println("]");
	System.out.print("ArrayTwo: ["); 
	int count= 0;
	while (count < arrayOne.length && arrayOne[count] != 1){
		arrayTwo[count] = (float) arrayOne[count];
		System.out.print(arrayTwo[count++] + " ");
	}
	System.out.print("]");
	}

 
}


