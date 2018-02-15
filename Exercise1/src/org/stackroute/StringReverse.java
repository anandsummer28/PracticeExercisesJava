package org.stackroute;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String ch = scan.nextLine();
		char[] a = ch.toCharArray();
		String newch = "";
		for(int i=a.length-1; i>=0; --i){
			newch += a[i];
		}
		System.out.println(newch);
		scan.close();
	}

}
