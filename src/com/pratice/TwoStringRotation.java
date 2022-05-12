package com.pratice;

public class TwoStringRotation {

	public static void main(String[] args){
		String string = "aba";
		TwoStringRotation obj = new TwoStringRotation();
		String b = obj.resverse(string);
		System.out.println(b);
	}
	
	public String resverse(String string) {
		
		String[] str = string.split("");
		String strRev = "";
		for( int i = str.length-1; i>=0; i--) {
			strRev = strRev + str[i];
		}
		if(string.equals(strRev)) {
			System.out.println("true");
			
		}
		else {
			System.out.println("false");
		}
		return strRev;
	}
}
