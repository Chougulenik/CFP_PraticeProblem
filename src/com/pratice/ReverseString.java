package com.pratice;

public class ReverseString {

	public static void main(String[] args){
		String string = "abcd";
		ReverseString obj = new ReverseString();
		obj.resverse(string);
	}
	
	void resverse(String string) {
		char word;
		String newString = "";
		for( int i = 0; i<string.length(); i++) {
			word = string.charAt(i);	
			newString = word + newString;
		}
		System.out.println(newString);
	}
}
