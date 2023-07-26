package com.corejava.assgn1;

import java.util.Scanner;

public class studentMarks {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter SUB_1 marks : ");
		int sub1 = sc.nextInt();
		System.out.print("Enter SUB_2 marks : ");
		int sub2 = sc.nextInt();
		System.out.print("Enter SUB_3 marks : ");
		int sub3 = sc.nextInt();
		
		if (sub1>60&&sub2>60&&sub3>60) {
			System.out.println(" Passed ");
		}
		else if ((sub1>60&& sub2>60)|| (sub1>60&&sub3>60)||(sub2>60&&sub3>60)) {
			System.out.println("promoted");
		}
		else {
			System.out.println("fail");
		}
	}
}
