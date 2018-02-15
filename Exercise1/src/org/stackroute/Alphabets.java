package org.stackroute;

import java.util.Scanner;

public class Alphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		scan.close();
		for(int i=0; i<s.length(); ++i){
			char x = s.toUpperCase().charAt(i);
			if(Character.isLetter(x)){
				switch(s.toUpperCase().charAt(i)){
				case 'A':
				case 'E':
				case 'I':
				case 'O': 
				case 'U': System.out.print("Vowel ");
					break;
				default: System.out.print("Consonent ");
				
				}
			}
			else{
				System.out.print("Error! ");
			}
			
		}
		

	}

}
