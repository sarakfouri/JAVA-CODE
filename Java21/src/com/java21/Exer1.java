package com.java21;

import java.text.DecimalFormat;


public class Exer1 {
double invest = 14000.00;

public void firstYear (double money){
	invest = money * 1.40; 
	
}
public void secondYear (double money){
	invest = money - 1500.00;
	 
}
public void thirdYear(double money){
invest = invest * 1.12;
}

public static void main (String[] args){
	DecimalFormat form = new DecimalFormat(); 
	form.applyPattern("$ 00,000.00;$(00,000.00)"); 
	Exer1 ex = new Exer1();
	ex.firstYear(ex.invest);
	System.out.println(form.format(ex.invest));
	ex.secondYear(ex.invest);
	System.out.println(form.format(ex.invest));
	ex.thirdYear(ex.invest);
	System.out.println(form.format(ex.invest));
	
}
	

}