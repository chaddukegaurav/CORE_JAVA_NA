package com.corejava.assgn1;

import java.util.Scanner;

public class userValidation {
	
	public static void main(String[] args) {
		String userName="Gaurav";
		String passWord="Pass@1234";
	
		int attempt = 0;

		 

		while (attempt < 3) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Username: ");

		String name = sc.next();

		System.out.print("Enter Password: ");

		String pass = sc.next();

		 

		if (userName.equals(name) && passWord.equals(pass)) {

		System.out.println("Welcome " + name + "...!");

		break;

		} else {

		attempt++;

		System.out.println("Invalid Credential");

		}

		}

		if (attempt >= 3) {

		System.out.println("contact Admin.Too Many attempt.Failed to Login");

		}
	
	
	}
}
