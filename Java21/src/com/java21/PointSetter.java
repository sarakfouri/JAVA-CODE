package com.java21;
import java.awt.Point;
public class PointSetter {
public static void main (String[] args){
	Point location = new Point (4, 13);
	System.out.println("Starting Location");
	System.out.println("X equals " + location.x);
	System.out.println("Y equals " + location.y);
	//change
	System.out.println("\n Moving to (7,6)");
	location.x = 7;
	location.y = 6;
	System.out.println("\n Ending location");
	System.out.println("X equals " + location.x);
	System.out.println("Y equals " + location.y);
}
}
