package org.stackroute;

import java.util.Scanner;

public class SetLimit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int limit = 100;
		int guess = 0;
		do{
			guess = scan.nextInt();
			if(guess>limit){
				System.out.println("Number guessed is more than original number");
			}
			else if(guess<limit){
				System.out.println("Number guessed is less than original number  ");
			}
			else{
				System.out.println("Number guessed matches the original number");
				break;
			}
		}while(guess!=limit);
		scan.close();

	}

}
