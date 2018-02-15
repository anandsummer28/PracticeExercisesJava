package org.stackroute.exercisetwo;


public class PalindromeChecker {
	
	public boolean checkPalindrome(String str) {
		String reverseStr = "";
		String newStr = "";
		
		for(int i=0; i<str.length(); ++i) {
			if(!(str.charAt(i) == ' ')) {
				newStr += str.charAt(i);
			}
		}
		
		int len = newStr.length();
		
		if(len == 0 ) {
			return false;
		}
		else {
			for(int i=len-1; i>=0; --i) 
				reverseStr += newStr.charAt(i);
	
			if(reverseStr.equals(newStr))
				return true;
			else
				return false;
		}
		
	}
	

}
