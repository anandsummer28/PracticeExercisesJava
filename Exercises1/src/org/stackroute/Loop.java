package org.stackroute;

import java.util.Scanner;

public class Loop {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		scan.close();
		for(int i=1; i<=x; ++i){
			for(int j=0; j<i; ++j){
				System.out.printf("%d ",i); 
			}
		}
	}

}
