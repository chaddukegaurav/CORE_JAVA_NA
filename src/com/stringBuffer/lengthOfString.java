package com.stringBuffer;

public class lengthOfString {
	
	public static void main(String[] args) {
		
		String name = "Gaurav";
		int count =0;
		
		int length = name.length();
		
		System.out.println(length);
		
		for (int i=0; i<length;i++) {
			count++;
		}
	
	System.out.println(count);
	}

}
