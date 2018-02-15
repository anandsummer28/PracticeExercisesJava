package org.stackroute;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PalindromeCheckerTest {
	
	 PalindromeChecker palindromeChecker;
	 @Before
	    public void setup() {
		 palindromeChecker = new PalindromeChecker();	        
	 }
   
	 @After
	 	public void cleanup() {
        palindromeChecker = null;
    }

	@Test
	public void methodShouldReturnTrueForPalindromeString() {
		//arrange
		String str1 = "121";
		
		//act
		boolean result = palindromeChecker.checkPalindrome(str1);
		
		//assert
		assertTrue(result);
	}
	
	@Test
	public void methodShouldReturnFalseForNonPalindromeString() {
		//arrange
		String str1 = "abcde";
		
		//act
		boolean result = palindromeChecker.checkPalindrome(str1);
		
		//assert
		assertFalse("Input" + str1 + " is not a palindrome ", result);
	}
	
	@Test
	public void methodShouldConcatAndReturnTrue() {
		//arrange
		String str1 = "12 1";
		
		//act	
		boolean result = palindromeChecker.checkPalindrome(str1);
	
		//assert
		assertTrue("After removing the spaces "+ str1 + "is a palindrome", result);
	}
	
	@Test(expected = NullPointerException.class)
	public void methodShouldReturnNullPointException() {
		//arrange
		String str1 = null;
		
		//act 
		palindromeChecker.checkPalindrome(str1);	
	}
}
