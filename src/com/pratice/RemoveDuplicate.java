package com.pratice;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		String string = "Java";
		RemoveDuplicate obj = new RemoveDuplicate();
		System.out.println(obj.removeDuplicate(string));
		
	}

	public String removeDuplicate(String string) {
		String str = "";
		for(int i =0; i<string.length(); i++) {
			char chara = string.charAt(i);
			if(str.indexOf(chara) == -1) {
				str += chara;
			}
		}
		return str;
		
	}
}
