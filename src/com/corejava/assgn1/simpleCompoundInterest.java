package com.corejava.assgn1;

import java.util.Scanner;

public class simpleCompoundInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Money Invested : ");
		double MI = sc.nextDouble();
	    System.out.print("Annual Rate Of I : ");
		double ARI = sc.nextDouble();
		System.out.print("Time Period you borrowed for : ");
		double timePeriod =sc.nextDouble();
		
		double SI = MI*ARI*timePeriod/100;
		System.out.println(" Simple Interest : "+SI);
		
		double compound_Interest= (MI* Math.pow((1+ARI/100.0),timePeriod))-MI;
		
		
		System.out.println("Compound Interest : "+compound_Interest);
		
		
	}
}
