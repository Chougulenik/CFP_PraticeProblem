package com.pratice;

public class ReverseStringWithoutRecursion {

	public static void main(String[] args){
		
		String string = "abcd";
		char word;
		String newString = "";
		for( int i = 0; i<string.length(); i++) {
			word = string.charAt(i);	
			newString = word + newString;
		}
		System.out.println(newString);
	}
}
