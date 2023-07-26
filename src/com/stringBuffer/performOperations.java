package com.stringBuffer;

public class performOperations {
	
	public static void main(String[] args) {
		
	 String given ="Java String pool refers to collection of strings which are stored in the heap memory ";
	 
	 System.out.println(given.toLowerCase());
	 System.out.println(given.toUpperCase());
	 System.out.println(given.replace("a", "$"));
	 System.out.println(given.contains("collection"));
	 System.out.println(given.contentEquals("java string pool refers to collection of strings which are stored in the heap memory "));
	 
	}

}
