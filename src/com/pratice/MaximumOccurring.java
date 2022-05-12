package com.pratice;

public class MaximumOccurring {

	public static void main(String[] args) {
		
		String string = "Java";
		char ch = ' ';
		int[] array = new int[127];
		for(int i=0; i<string.length(); i++) {
			array[string.charAt(i)] = array[string.charAt(i)] + 1;
		}
		
		int max = -1;
		for(int i=0; i<string.length(); i++) {
			if(max < array[string.charAt(i)]) {
				max = array[string.charAt(i)];
				ch = string.charAt(i); 
			}
		}
		System.out.println(ch);
		
	}
}
