package com.corejava.assgn1;

import java.util.Scanner;

public class searchNumberInArray {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("");
	int number = sc.nextInt();
	
	int [] arr= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
	int length = arr.length;
	boolean b=false;
	for (int i=0; i<length; i++) {
		if (arr[i]==number) {
			b=true;
			break;
		}
		else {
			b=false;
		}
	}
	if(b==true) {
		System.out.println("is present");
	}
	else {
		System.out.println("not present");
	}
	
}}
