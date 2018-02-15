package org.stackroute;

import java.util.Scanner;

public class CharacterCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);
		scan.close();
		if(Character.isDigit(ch)){
			System.out.println("Digit");
		}
		else if(Character.isAlphabetic(ch)){
			if(Character.isUpperCase(ch)){
				System.out.println("Capital letter");
			}
			else {
				System.out.println("Small letter");
			}
		}
		else{
			System.out.println("Symbol");
		}
	}

}
