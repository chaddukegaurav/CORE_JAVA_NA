package com.corejava.assgn1;

import java.util.Scanner;

public class incomeTax {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your EMPID : ");
		String EmpId = sc.next();
	    System.out.print("Annual Income : ");
		double AI = sc.nextDouble();
		System.out.print("Total Deductions : ");
		double TI=sc.nextDouble();
		
		double Taxable_Income= AI-TI;
	    int r=0;
		if (Taxable_Income <= 180000) {
			System.out.println("NIL");
		}
		else if (Taxable_Income >= 181001 && Taxable_Income <=300000){
			r =10;
		}
		else if (Taxable_Income >=300001 && Taxable_Income <=500000) {
			r = 20;
		}
		else if (Taxable_Income >=500001 && Taxable_Income <=1000000) {
			r = 30;
		}
		
		double IR = Taxable_Income *r/100;
		
		System.out.println("EMP ID : "+EmpId);
		System.out.println("Annual Salary "+AI);
		System.out.println("So the taxes need to be paid in INR : Rs "+IR);
	}
}
