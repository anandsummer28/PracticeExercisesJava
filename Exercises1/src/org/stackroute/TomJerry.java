package org.stackroute;

import java.util.Scanner;

public class TomJerry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		if(number>=20 && number<=30){
			if(number%2==0){
				System.out.println("Jerry");
			}
			else {
				System.out.println("Tom");
			}
		}
	}
}
